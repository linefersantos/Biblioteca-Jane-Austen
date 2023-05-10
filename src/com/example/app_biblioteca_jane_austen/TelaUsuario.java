package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class TelaUsuario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_usuario);

	}
	
	//Voltando para o MENU
	
		public void voltar_menu(View v){
			Intent it = new Intent(TelaUsuario.this, TelaMenu_1.class);
	    	startActivity(it);
	}
		
		//Saindo da conta
		
		public void sair(View v){
	    		Intent it = new Intent(TelaUsuario.this, TelaLogin.class);
		    	startActivity(it);
		}
		
		//Alterando dados
		
				public void alterar_dados(View v){
			    		Intent it = new Intent(TelaUsuario.this, TelaAlterar.class);
				    	startActivity(it);
				}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_usuario, menu);
		return true;
	}

}
