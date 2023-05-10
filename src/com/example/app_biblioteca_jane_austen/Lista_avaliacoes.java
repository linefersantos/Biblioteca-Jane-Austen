package com.example.app_biblioteca_jane_austen;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.Toast;

public class Lista_avaliacoes extends Activity {

	ListView lista;
	ArrayAdapter<String> adapter;
	ArrayList<String> arrayList;

	LivroDAO db = new LivroDAO(this);
	String id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_lista_avaliacoes);

		lista = (ListView) findViewById(R.id.listView_notas);

		final RatingBar bar = (RatingBar) findViewById(R.id.ratingBar_nota);
		final Button btn_editar = (Button) findViewById(R.id.btn_editar);
		final Button btn_excluir = (Button) findViewById(R.id.btn_excluir);
		final EditText editText_nome_livro = (EditText) findViewById(R.id.editText_nome_livro);
		
		// Listando Itens
				listarLivros();

		// Alterando dado na lista

		btn_editar.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Livro livro = new Livro();
				
				livro.setId(Integer.parseInt(id));
				livro.setNome(editText_nome_livro.getText().toString());
				livro.setNota(Double.valueOf(bar
						.getRating()));
				db = new LivroDAO(Lista_avaliacoes.this);
				db.alterarLivro(livro);
				
				editText_nome_livro.setText("");
				bar.setRating(Float.valueOf(0));
				
				Toast.makeText(Lista_avaliacoes.this,
						"ALTERADO COM SUCESSO",
						Toast.LENGTH_SHORT).show();
				
				listarLivros();

			}
		});

		// Apagando dados da lista

		btn_excluir.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Livro livro = new Livro();

				livro.setId(Integer.parseInt(id));
				db = new LivroDAO(Lista_avaliacoes.this);
				db.deletarLivro(livro);
				listarLivros();
				
				editText_nome_livro.setText("");
				bar.setRating(Float.valueOf(0));

				Toast.makeText(Lista_avaliacoes.this, "EXCLUÍDO COM SUCESSO",
						Toast.LENGTH_SHORT).show();

				listarLivros();

			}
		});
		
		//Ativando click da lista
		
		lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
				
				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3 ) {
					// TODO Auto-generated method stub
					String conteudo = (String) lista.getItemAtPosition(position);
					String palavra[] = conteudo.split(" - ");
					id = palavra[0];
					editText_nome_livro.setText(palavra[1]);
					bar.setRating(Float.valueOf(palavra[2]));
					
					
				}
		});
		
		
	}

	public void listarLivros() {
		List<Livro> livros = db.listaLivros();

		arrayList = new ArrayList<String>();
		adapter = new ArrayAdapter<String>(Lista_avaliacoes.this,
				android.R.layout.simple_list_item_1, arrayList);
		lista.setAdapter(adapter);

		for (Livro livro : livros) {
			arrayList.add(livro.getId() + " - " + livro.getNome() + " - " + livro.getNota());

			adapter.notifyDataSetChanged();
		}
	}
	
	public void voltar_lista(View v) {
		Intent intent = new Intent(Lista_avaliacoes.this, TelaMenu_1.class);
		startActivity(intent);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_avaliacoes, menu);
		return true;
	}

}
