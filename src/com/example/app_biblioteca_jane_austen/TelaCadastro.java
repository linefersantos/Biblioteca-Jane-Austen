package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaCadastro extends Activity {

	UsuarioDAO db = new UsuarioDAO(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_cadastro);

		final EditText email = (EditText) findViewById(R.id.emailcad);
		final EditText senha = (EditText) findViewById(R.id.senhacad);
		final EditText nome = (EditText) findViewById(R.id.nome);
		final Button btn = (Button) findViewById(R.id.cad);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if (email.getText().toString().equals("")) {

					Toast.makeText(TelaCadastro.this,
							"Todos os campos devem ser preenchidos",
							Toast.LENGTH_SHORT).show();

				}

				if (nome.getText().toString().equals("")) {
					Toast.makeText(TelaCadastro.this,
							"Todos os campos devem ser preenchidos",
							Toast.LENGTH_SHORT).show();

				}

				if (senha.getText().toString().equals("")) {

					Toast.makeText(TelaCadastro.this,
							"Todos os campos devem ser preenchidos",
							Toast.LENGTH_SHORT).show();

				}

				else {

					Usuario a = new Usuario();
					a.setEmail(email.getText().toString());
					a.setNome(nome.getText().toString());
					a.setSenha(senha.getText().toString());
					db = new UsuarioDAO(TelaCadastro.this);
					db.salvar(a);

					Toast.makeText(TelaCadastro.this, "Cadastro realizado!",
							Toast.LENGTH_SHORT).show();

					Intent it = new Intent(TelaCadastro.this, TelaLogin.class);
					startActivity(it);

				}

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_cadastro, menu);
		return true;
	}

}
