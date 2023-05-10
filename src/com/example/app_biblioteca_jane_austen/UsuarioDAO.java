package com.example.app_biblioteca_jane_austen;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class UsuarioDAO extends SQLiteOpenHelper {
	
	private static String database = "Biblioteca";
	private static int versao = 2;
	
	public UsuarioDAO(Context c) {
		super(c, database, null, versao);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = "create table usuario("
				    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
				    + "email TEXT, "
				    + "nome TEXT, "
				    + "senha TEXT);";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		// TODO Auto-generated method stub
		String sql = "drop table if exists usuario";
		db.execSQL(sql);
		this.onCreate(db);
	}
	
	//salvar
	public void salvar(Usuario a){
		ContentValues v = new ContentValues();
		v.put("email", a.getEmail());
		v.put("nome", a.getNome());
		v.put("senha", a.getSenha());
		getWritableDatabase().insert("Usuario", null, v);
	}

	
	//listar
		public List<Usuario> listaUsuario() {
			List<Usuario> usuarios = new ArrayList<Usuario>();
		    String query = "SELECT * FROM USUARIO ORDER BY ID ASC LIMIT 1";
		    SQLiteDatabase db = this.getWritableDatabase();
		    Cursor c = db.rawQuery(query, null);
		    if (c.moveToFirst()) {
		    	do {
		    		Usuario a = new Usuario();
		    		a.setId(Integer.parseInt(c.getString(0)));
		    		a.setEmail(c.getString(1));
		    		a.setNome(c.getString(2));
		    		a.setSenha(c.getString(3));
		    		usuarios.add(a);
		    	} while (c.moveToNext());
		    }
		    	return usuarios;		
		} 


		//alterar
		public void alterarUsuario(Usuario a) {
			ContentValues v = new ContentValues();
			v.put("nome", a.getNome());
			v.put("senha", a.getSenha());
			v.put("id", a.getId());
			getWritableDatabase().update("Usuario",v, "id=" + a.getId(), null);
		}
	
//EXCLUIR
	public void excluir(Usuario a) {
		this.getWritableDatabase().delete("Usuario", "id="+ a.getId(), null);
		}
	}