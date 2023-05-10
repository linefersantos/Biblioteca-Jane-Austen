package com.example.app_biblioteca_jane_austen;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class TelaLogin extends Activity {
	
	
	private EditText email;
	private EditText senha;
	private Button btn;
	private TextView criar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_login);
		
		btn = (Button) findViewById(R.id.entra);
        criar = (TextView)findViewById(R.id.criar);
	}
	
	public void entrar(View v){
		email = (EditText)findViewById(R.id.email);
	    senha = (EditText)findViewById(R.id.senha);
		//db.logarUsuario(email.toString(), senha.toString());
		Intent it = new Intent(TelaLogin.this, TelaMenu_1.class);
		startActivity(it);
	}
	
	public void nao_possui_conta(View v){
		Intent it = new Intent(TelaLogin.this, TelaCadastro.class);
		startActivity(it);   
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_login, menu);
		return true;
	}

}
