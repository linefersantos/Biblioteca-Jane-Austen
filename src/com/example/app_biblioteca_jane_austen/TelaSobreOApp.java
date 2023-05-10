package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class TelaSobreOApp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_sobre_oapp);
	}
	
	public void voltar (View v){
		Intent it = new Intent(TelaSobreOApp.this, TelaMenu_1.class);
    	startActivity(it);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_sobre_oapp, menu);
		return true;
	}

}
