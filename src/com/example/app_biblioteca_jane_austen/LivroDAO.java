package com.example.app_biblioteca_jane_austen;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LivroDAO extends SQLiteOpenHelper {

	private static String database = "livro";
	private static int versao = 2;

	public LivroDAO(Context c) {
		super(c, database, null, versao);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String sql = " create table livro( "
				    + " id INTEGER PRIMARY KEY AUTOINCREMENT, " 
				    + " nota REAL, "
				    + " nome TEXT); ";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		String sql = "drop table if exists livro";
		db.execSQL(sql);
		this.onCreate(db);
	}
	
	//salvar 
	public void salvarLivro(Livro livro) {
		ContentValues v = new ContentValues();
		v.put("nota", livro.getNota());
		v.put("nome", livro.getNome());
		getWritableDatabase().insert("Livro", null, v);
	}
	
	//listar
	public List<Livro> listaLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		String query = "SELECT * FROM LIVRO";
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor c = db.rawQuery(query, null);
		
		if (c.moveToFirst()) {
			do {
			      Livro livro = new Livro();
			      livro.setId(Integer.parseInt(c.getString(0)));
			      livro.setNota(Double.valueOf(c.getString(1)));
			      livro.setNome(c.getString(2));
			      
			      livros.add(livro);
			} 
			while (c.moveToNext());
		}
		
		return livros;
	}
	
	//alterar
	public void alterarLivro(Livro livro) {
		ContentValues v = new ContentValues();
		v.put("nota", livro.getNota());
		v.put("nome", livro.getNome());
		v.put("id", livro.getId());
		getWritableDatabase().update("Livro",v, "id=" + livro.getId(), null);
	}
	
	//excluir
		public void deletarLivro(Livro livro) {
			this.getWritableDatabase().delete("Livro","id=" + livro.getId(), null);
		}
	

}
