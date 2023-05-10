package com.example.app_biblioteca_jane_austen;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class TelaAlterar extends Activity {
	
	ListView lista2;
	ArrayAdapter<String> adapter2;
	ArrayList<String> arrayList2;

	UsuarioDAO db = new UsuarioDAO(this);
	
	String id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_alterar);
		
		final EditText usuario2 = (EditText) findViewById(R.id.editText_AlterarEmail);
		final EditText senha2 = (EditText) findViewById(R.id.editText_AlterarSenha);
		final Button btn_alterar = (Button) findViewById(R.id.btn_alterar2);
		final Button btn_excluir = (Button) findViewById(R.id.btn_excluir2);
		
		//Mostrando seu Usuário
		
		lista2 = (ListView) findViewById(R.id.listView_usuario);
		
		// Listando Itens
		listarUsuario();
		
		// Alterando dado na lista

				btn_alterar.setOnClickListener(new Button.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						Usuario a = new Usuario();
						
						a.setId(Integer.parseInt(id));
						a.setNome(usuario2.getText().toString());
						a.setSenha(senha2.getText().toString());
						
						db = new UsuarioDAO(TelaAlterar.this);
						db.alterarUsuario(a);
					
						
						Toast.makeText(TelaAlterar.this,
								"ALTERADO COM SUCESSO",
								Toast.LENGTH_SHORT).show();
						
						listarUsuario();

					}
				}); 
				
				//Ativando click da lista
				
				lista2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						
						@Override
						public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3 ) {
							// TODO Auto-generated method stub
							String conteudo = (String) lista2.getItemAtPosition(position);
							String palavra[] = conteudo.split(" - ");
							id = palavra[0];
							usuario2.setText(palavra[1]);
							senha2.setText(palavra[2]);
							
							
						}
				});
		
		
		
		
		
		btn_excluir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Usuario a = new Usuario();
				a.setId(Integer.parseInt(id));
				db = new UsuarioDAO(TelaAlterar.this);
				db.excluir(a);
				Toast.makeText(TelaAlterar.this, "EXCLUÍDO COM SUCESSO", Toast.LENGTH_SHORT).show();
				
			}
		}); 
		
		
		
		
	}
		
	public void listarUsuario() {
			List<Usuario> usuarios = db.listaUsuario();

			arrayList2 = new ArrayList<String>();
			adapter2 = new ArrayAdapter<String>(TelaAlterar.this,
					android.R.layout.simple_list_item_1, arrayList2);
			lista2.setAdapter(adapter2);

			for (Usuario a : usuarios) {
			arrayList2.add(a.getId() + " - " + a.getNome() + " - " + a.getSenha());

				adapter2.notifyDataSetChanged();
			} 
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_alterar, menu);
		return true;
	}

}
