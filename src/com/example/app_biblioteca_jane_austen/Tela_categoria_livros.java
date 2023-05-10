package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class Tela_categoria_livros extends Activity {
	
	Bundle b = new Bundle();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_categoria_livros);
		
 }
	
	public void btn_romance(View v) {

		b.putInt("val", 1);
		Intent v1 = new Intent(Tela_categoria_livros.this,
				Tela_opcoes_livros.class);
		v1.putExtras(b);
		startActivity(v1);
	}

	public void btn_classicos(View v) {

		b.putInt("val", 2);
		Intent v2 = new Intent(Tela_categoria_livros.this,
				Tela_opcoes_livros.class);
		v2.putExtras(b);
		startActivity(v2);
	}

	public void btn_fantasia(View v) {

		b.putInt("val", 3);
		Intent v3 = new Intent(Tela_categoria_livros.this,
				Tela_opcoes_livros.class);
		v3.putExtras(b);
		startActivity(v3);
	}

	public void btn_aventura(View v) {

		b.putInt("val", 4);
		Intent v4 = new Intent(Tela_categoria_livros.this,
				Tela_opcoes_livros.class);
		v4.putExtras(b);
		startActivity(v4);
	}

	public void btn_terror(View v) {

		b.putInt("val", 5);
		Intent v5 = new Intent(Tela_categoria_livros.this,
				Tela_opcoes_livros.class);
		v5.putExtras(b);
		startActivity(v5);
	}
	
	public void voltar (View v) {
		Intent intent = new Intent(Tela_categoria_livros.this, TelaMenu_1.class);
		startActivity(intent);
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_categoria_livros, menu);
		return true;
	}

}
