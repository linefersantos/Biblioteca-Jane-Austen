package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;


public class Tela_splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tela_splash);
        
     // Tela de Splash

     		Handler handler = new Handler();
     		handler.postDelayed(new Runnable() {

     			@Override
     			public void run() {
     				// TODO Auto-generated method stub
     				
     				Intent splash = new Intent(Tela_splash.this, TelaLogin.class);
     				startActivity(splash);
     			}
     		}, 3000);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_splash, menu);
        return true;
    }
    
}
