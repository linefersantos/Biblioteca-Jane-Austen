package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class TelaMenu_1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_menu_1);
	}
	
	//TROCA PARA A TELA CATEGORIAS
    public void categorias (View v){
    	Intent it = new Intent(TelaMenu_1.this, Tela_categoria_livros.class);
    	startActivity(it);
    }
    
    //TROCA PARA A TELA MINHAS AVAIAÇÕES
    public void avaliacoes(View v) {
    	Intent it = new Intent(TelaMenu_1.this, Lista_avaliacoes.class);
    	startActivity(it);
    }
    
    
    //TROCA PARA A TELAS USUARIO
    public void usuario(View v){
    	Intent it = new Intent(TelaMenu_1.this, TelaUsuario.class);
    	startActivity(it);
    }
    
    public void sobre_o_app(View v){
    	Intent it = new Intent(TelaMenu_1.this, TelaSobreOApp.class);
    	startActivity(it);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_menu_1, menu);
		return true;
	}

}
