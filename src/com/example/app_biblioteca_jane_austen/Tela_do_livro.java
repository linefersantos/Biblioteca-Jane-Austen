package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Tela_do_livro extends Activity {

	LivroDAO db = new LivroDAO(this);
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		int tela_livro;
		final Button btn_enviar;
		final RatingBar rating_bar;
		final TextView nome_livro;
		final TextView txt_sinopse;

		ImageView img_do_livro;

		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_do_livro);

		img_do_livro = (ImageView) findViewById(R.id.img_do_livro);
		btn_enviar = (Button) findViewById(R.id.btn_enviar_avaliacao);
		rating_bar = (RatingBar) findViewById(R.id.ratBar_avaliacao);
		nome_livro = (TextView) findViewById(R.id.txt_nome_livro);
		txt_sinopse = (TextView) findViewById(R.id.txt_sinopse);

		Bundle b = getIntent().getExtras();

		// Trocando imagens de cada tela de opções
		Bundle bundle = getIntent().getExtras();
		tela_livro = bundle.getInt("click");

		switch (tela_livro) {
		case 1:
			img_do_livro.setImageResource(R.drawable.eassimqueacaba);
			nome_livro.setText(R.string.txt_nome01_livro1);
			
			txt_sinopse.setText(R.string.sinopse01_01);

			break;

		case 2:
			img_do_livro.setImageResource(R.drawable.domquixote);
			nome_livro.setText(R.string.txt_nome02_livro1);
			
			txt_sinopse.setText(R.string.sinopse02_01);
			
			break;
			

		case 3:
			img_do_livro.setImageResource(R.drawable.crepusculo1);
			nome_livro.setText(R.string.txt_nome03_livro1);
			
			txt_sinopse.setText(R.string.sinopse03_01);
			
			break;

		case 4:
			img_do_livro.setImageResource(R.drawable.harry1);
			nome_livro.setText(R.string.txt_nome04_livro1);
			
			txt_sinopse.setText(R.string.sinopse04_01);
			
			break;

		case 5:
			img_do_livro.setImageResource(R.drawable.saborosocadaver);
			nome_livro.setText(R.string.txt_nome05_livro1);
			
			txt_sinopse.setText(R.string.sinopse05_01);
			
			break;

		case 6:
			img_do_livro.setImageResource(R.drawable.ummilhaodefinaisfelizes);
			nome_livro.setText(R.string.txt_nome01_livro2);
			txt_sinopse.setText(R.string.sinopse01_02);
			
			break;

		case 7:
			img_do_livro.setImageResource(R.drawable.emma);
			nome_livro.setText(R.string.txt_nome02_livro2);
			
			txt_sinopse.setText(R.string.sinopse02_02);
			break;

		case 8:
			img_do_livro.setImageResource(R.drawable.luanova2);
			nome_livro.setText(R.string.txt_nome03_livro2);
			
			txt_sinopse.setText(R.string.sinopse03_02);
			break;

		case 9:
			img_do_livro.setImageResource(R.drawable.harrypottereacamara);
			nome_livro.setText(R.string.txt_nome04_livro2);
			
			txt_sinopse.setText(R.string.sinopse04_02);
			break;

		case 10:
			img_do_livro.setImageResource(R.drawable.misery);
			nome_livro.setText(R.string.txt_nome05_livro2);
			
			txt_sinopse.setText(R.string.sinopse05_02);
			break;

		case 11:
			img_do_livro.setImageResource(R.drawable.voceligouparasam);
			nome_livro.setText(R.string.txt_nome01_livro3);
			
			txt_sinopse.setText(R.string.sinopse01_03);
			break;

		case 12:
			img_do_livro.setImageResource(R.drawable.madamebovary);
			nome_livro.setText(R.string.txt_nome02_livro3);
			txt_sinopse.setText(R.string.sinopse02_03);
			
			break;

		case 13:
			img_do_livro.setImageResource(R.drawable.eclipse3);
			nome_livro.setText(R.string.txt_nome03_livro3);
			
			txt_sinopse.setText(R.string.sinopse03_03);
			break;

		case 14:
			img_do_livro.setImageResource(R.drawable.harrypottereoprisioneiro);
			nome_livro.setText(R.string.txt_nome04_livro3);
			
			txt_sinopse.setText(R.string.sinopse04_03);
			break;

		case 15:
			img_do_livro.setImageResource(R.drawable.itacoisa);
			nome_livro.setText(R.string.txt_nome05_livro3);
			
			txt_sinopse.setText(R.string.sinopse05_03);
			break;

		case 16:
			img_do_livro.setImageResource(R.drawable.clubedolivrodoshomens);
			nome_livro.setText(R.string.txt_nome01_livro4);
			
			txt_sinopse.setText(R.string.sinopse01_04);
			break;

		case 17:
			img_do_livro.setImageResource(R.drawable.oautodabarca);
			nome_livro.setText(R.string.txt_nome02_livro4);
			
			txt_sinopse.setText(R.string.sinopse02_04);
			break;

		case 18:
			img_do_livro.setImageResource(R.drawable.amanhecer4);
			nome_livro.setText(R.string.txt_nome03_livro4);
			
			txt_sinopse.setText(R.string.sinopse03_04);
			break;

		case 19:
			img_do_livro.setImageResource(R.drawable.harrypottereocalice);
			nome_livro.setText(R.string.txt_nome04_livro4);
			
			txt_sinopse.setText(R.string.sinopse04_04);
			break;

		case 20:
			img_do_livro.setImageResource(R.drawable.contodefadas);
			nome_livro.setText(R.string.txt_nome05_livro4);
			
			txt_sinopse.setText(R.string.sinopse05_04);
			break;

		case 21:
			img_do_livro.setImageResource(R.drawable.amoregelato);
			nome_livro.setText(R.string.txt_nome01_livro5);
			
			txt_sinopse.setText(R.string.sinopse01_05);
			break;

		case 22:
			img_do_livro.setImageResource(R.drawable.ocorvo);
			nome_livro.setText(R.string.txt_nome02_livro5);
			
			txt_sinopse.setText(R.string.sinopse02_05);
			break;

		case 23:
			img_do_livro.setImageResource(R.drawable.cortedeespinhoserosas1);
			nome_livro.setText(R.string.txt_nome03_livro5);
			
			txt_sinopse.setText(R.string.sinopse03_05);
			break;

		case 24:
			img_do_livro.setImageResource(R.drawable.harrypottereaordemdafenix);
			nome_livro.setText(R.string.txt_nome04_livro5);
			
			txt_sinopse.setText(R.string.sinopse04_05);
			break;

		case 25:
			img_do_livro.setImageResource(R.drawable.adancadamorte);
			nome_livro.setText(R.string.txt_nome05_livro5);
			
			txt_sinopse.setText(R.string.sinopse05_05);
			break;

		case 26:
			img_do_livro.setImageResource(R.drawable.eleanorpark);
			nome_livro.setText(R.string.txt_nome01_livro6);
			
			txt_sinopse.setText(R.string.sinopse01_06);
			break;

		case 27:
			img_do_livro.setImageResource(R.drawable.romeuejulieta);
			nome_livro.setText(R.string.txt_nome02_livro6);
			
			txt_sinopse.setText(R.string.sinopse02_06);
			break;

		case 28:
			img_do_livro.setImageResource(R.drawable.cortedenevoaefuria2);
			nome_livro.setText(R.string.txt_nome03_livro6);
			
			txt_sinopse.setText(R.string.sinopse03_06);
			break;

		case 29:
			img_do_livro.setImageResource(R.drawable.harrypottereoenigma);
			nome_livro.setText(R.string.txt_nome04_livro6);
			
			txt_sinopse.setText(R.string.sinopse04_06);
			break;

		case 30:
			img_do_livro.setImageResource(R.drawable.amitivillehouse);
			nome_livro.setText(R.string.txt_nome05_livro6);
			
			txt_sinopse.setText(R.string.sinopse05_06);
			break;

		case 31:
			img_do_livro.setImageResource(R.drawable.osdoismorremnofinal);
			nome_livro.setText(R.string.txt_nome01_livro7);
			
			txt_sinopse.setText(R.string.sinopse01_07);
			break;

		case 32:
			img_do_livro.setImageResource(R.drawable.orgulhoepreconceito);
			nome_livro.setText(R.string.txt_nome02_livro7);
			
			txt_sinopse.setText(R.string.sinopse02_07);
			break;

		case 33:
			img_do_livro.setImageResource(R.drawable.cortedeasaseruina3);
			nome_livro.setText(R.string.txt_nome03_livro7);
			
			txt_sinopse.setText(R.string.sinopse02_07);
			break;

		case 34:
			img_do_livro.setImageResource(R.drawable.harrypottereasreliquias);
			nome_livro.setText(R.string.txt_nome04_livro7);
			
			txt_sinopse.setText(R.string.sinopse03_07);
			break;

		case 35:
			img_do_livro.setImageResource(R.drawable.criaturascriadores);
			nome_livro.setText(R.string.txt_nome05_livro7);
			
			txt_sinopse.setText(R.string.sinopse04_07);
			break;

		case 36:
			img_do_livro.setImageResource(R.drawable.vermelhobrancosangueazul);
			nome_livro.setText(R.string.txt_nome01_livro8);
			
			txt_sinopse.setText(R.string.sinopse05_07);
			break;

		case 37:
			img_do_livro.setImageResource(R.drawable.oslusiadas);
			nome_livro.setText(R.string.txt_nome02_livro8);
			
			txt_sinopse.setText(R.string.sinopse01_08);
			break;

		case 38:
			img_do_livro.setImageResource(R.drawable.cortedechamasprateadas4);
			nome_livro.setText(R.string.txt_nome03_livro8);
			
			txt_sinopse.setText(R.string.sinopse02_08);
			break;

		case 39:
			img_do_livro.setImageResource(R.drawable.acriancaamaldicoada);
			nome_livro.setText(R.string.txt_nome04_livro8);
			
			txt_sinopse.setText(R.string.sinopse03_08);
			break;

		case 40:
			img_do_livro.setImageResource(R.drawable.dracula);
			nome_livro.setText(R.string.txt_nome05_livro8);
			
			txt_sinopse.setText(R.string.sinopse04_08);
			break;

		case 41:
			img_do_livro.setImageResource(R.drawable.eassimquecomeca);
			nome_livro.setText(R.string.txt_nome01_livro9);
			
			txt_sinopse.setText(R.string.sinopse05_08);
			break;

		case 42:
			img_do_livro.setImageResource(R.drawable.oitentaanosdepoesia);
			nome_livro.setText(R.string.txt_nome02_livro9);
			
			txt_sinopse.setText(R.string.sinopse01_09);
			break;

		case 43:
			img_do_livro.setImageResource(R.drawable.aselecao);
			nome_livro.setText(R.string.txt_nome03_livro9);
			
			txt_sinopse.setText(R.string.sinopse02_09);
			break;

		case 44:
			img_do_livro.setImageResource(R.drawable.osobrinhodomago1);
			nome_livro.setText(R.string.txt_nome04_livro9);
			
			txt_sinopse.setText(R.string.sinopse03_09);
			break;

		case 45:
			img_do_livro.setImageResource(R.drawable.encruzilhada);
			nome_livro.setText(R.string.txt_nome05_livro9);
			
			txt_sinopse.setText(R.string.sinopse05_09);
			break;

		case 46:
			img_do_livro.setImageResource(R.drawable.novembro9);
			nome_livro.setText(R.string.txt_nome01_livro10);
			
			txt_sinopse.setText(R.string.sinopse01_10);
			break;

		case 47:
			img_do_livro.setImageResource(R.drawable.iracema);
			nome_livro.setText(R.string.txt_nome02_livro10);
			
			txt_sinopse.setText(R.string.sinopse02_10);
			break;

		case 48:
			img_do_livro.setImageResource(R.drawable.aelite);
			nome_livro.setText(R.string.txt_nome03_livro10);
			
			txt_sinopse.setText(R.string.sinopse03_10);
			break;

		case 49:
			img_do_livro
					.setImageResource(R.drawable.oleaoafeiticeiraeoguardaroupa2);
			nome_livro.setText(R.string.txt_nome04_livro10);
			
			txt_sinopse.setText(R.string.sinopse04_10);
			break;

		case 50:
			img_do_livro.setImageResource(R.drawable.obebederosemary);
			nome_livro.setText(R.string.txt_nome05_livro10);
			
			txt_sinopse.setText(R.string.sinopse05_10);
			break;

		case 51:
			img_do_livro.setImageResource(R.drawable.todasassuasimperfeicoes);
			nome_livro.setText(R.string.txt_nome01_livro11);
			
			txt_sinopse.setText(R.string.sinopse01_11);
			break;

		case 52:
			img_do_livro.setImageResource(R.drawable.memoriaspostumas);
			nome_livro.setText(R.string.txt_nome02_livro11);
			
			txt_sinopse.setText(R.string.sinopse02_11);
			break;

		case 53:
			img_do_livro.setImageResource(R.drawable.aescolha);
			nome_livro.setText(R.string.txt_nome03_livro11);
			
			txt_sinopse.setText(R.string.sinopse03_11);
			break;

		case 54:
			img_do_livro.setImageResource(R.drawable.ocavaloeseumenino3);
			nome_livro.setText(R.string.txt_nome04_livro11);
			
			txt_sinopse.setText(R.string.sinopse04_11);
			break;

		case 55:
			img_do_livro.setImageResource(R.drawable.oexorcista);
			nome_livro.setText(R.string.txt_nome05_livro11);
			
			txt_sinopse.setText(R.string.sinopse05_11);
			break;

		case 56:
			img_do_livro.setImageResource(R.drawable.oladofeiodoamor);
			nome_livro.setText(R.string.txt_nome01_livro12);
			
			txt_sinopse.setText(R.string.sinopse01_12);
			break;

		case 57:
			img_do_livro.setImageResource(R.drawable.oateneu);
			nome_livro.setText(R.string.txt_nome02_livro12);
			
			txt_sinopse.setText(R.string.sinopse02_12);
			break;

		case 58:
			img_do_livro.setImageResource(R.drawable.aherdeira);
			nome_livro.setText(R.string.txt_nome03_livro12);
			
			txt_sinopse.setText(R.string.sinopse03_12);
			break;

		case 59:
			img_do_livro.setImageResource(R.drawable.principecaspian4);
			nome_livro.setText(R.string.txt_nome04_livro12);
			
			txt_sinopse.setText(R.string.sinopse04_12);
			break;

		case 60:
			img_do_livro.setImageResource(R.drawable.oiluminado);
			nome_livro.setText(R.string.txt_nome05_livro12);
			
			txt_sinopse.setText(R.string.sinopse05_12);
			break;

		case 61:
			img_do_livro.setImageResource(R.drawable.acincopassosdevoce);
			nome_livro.setText(R.string.txt_nome01_livro13);
			
			txt_sinopse.setText(R.string.sinopse01_13);
			break;

		case 62:
			img_do_livro.setImageResource(R.drawable.domcasmurro);
			nome_livro.setText(R.string.txt_nome02_livro13);
			
			txt_sinopse.setText(R.string.sinopse02_13);
			break;

		case 63:
			img_do_livro.setImageResource(R.drawable.laminaassassina);
			nome_livro.setText(R.string.txt_nome03_livro13);
			
			txt_sinopse.setText(R.string.sinopse03_13);
			break;

		case 64:
			img_do_livro.setImageResource(R.drawable.aviagemdoperegrino5);
			nome_livro.setText(R.string.txt_nome04_livro13);
			
			txt_sinopse.setText(R.string.sinopse04_13);
			break;

		case 65:
			img_do_livro.setImageResource(R.drawable.ossete);
			nome_livro.setText(R.string.txt_nome05_livro13);
			
			txt_sinopse.setText(R.string.sinopse05_13);
			break;

		case 66:
			img_do_livro.setImageResource(R.drawable.milbeijosdeumgaroto);
			nome_livro.setText(R.string.txt_nome01_livro14);
			
			txt_sinopse.setText(R.string.sinopse01_14);
			break;

		case 67:
			img_do_livro.setImageResource(R.drawable.ocortico);
			nome_livro.setText(R.string.txt_nome02_livro14);
			
			txt_sinopse.setText(R.string.sinopse02_14);
			break;

		case 68:
			img_do_livro.setImageResource(R.drawable.tronodevidro1);
			nome_livro.setText(R.string.txt_nome03_livro14);
			
			txt_sinopse.setText(R.string.sinopse03_14);
			break;

		case 69:
			img_do_livro.setImageResource(R.drawable.acadeiradeprata6);
			nome_livro.setText(R.string.txt_nome04_livro14);
			
			txt_sinopse.setText(R.string.sinopse04_14);
			break;

		case 70:
			img_do_livro.setImageResource(R.drawable.ovilarejo);
			nome_livro.setText(R.string.txt_nome05_livro14);
			
			txt_sinopse.setText(R.string.sinopse05_14);
			break;

		case 71:
			img_do_livro.setImageResource(R.drawable.porlugaresincriveis);
			nome_livro.setText(R.string.txt_nome01_livro15);
			
			txt_sinopse.setText(R.string.sinopse01_15);
			break;

		case 72:
			img_do_livro.setImageResource(R.drawable.quincasborba);
			nome_livro.setText(R.string.txt_nome02_livro15);
			
			txt_sinopse.setText(R.string.sinopse02_15);
			break;

		case 73:
			img_do_livro.setImageResource(R.drawable.coroadameianoite2);
			nome_livro.setText(R.string.txt_nome03_livro15);
			
			txt_sinopse.setText(R.string.sinopse03_15);
			break;

		case 74:
			img_do_livro.setImageResource(R.drawable.aultimabatalha7);
			nome_livro.setText(R.string.txt_nome04_livro15);
			
			txt_sinopse.setText(R.string.sinopse04_15);
			break;

		case 75:
			img_do_livro.setImageResource(R.drawable.terramorta);
			nome_livro.setText(R.string.txt_nome05_livro15);
			
			txt_sinopse.setText(R.string.sinopse05_14);
			break;

		case 76:
			img_do_livro.setImageResource(R.drawable.tetoparadois);
			nome_livro.setText(R.string.txt_nome01_livro16);
			
			txt_sinopse.setText(R.string.sinopse01_16);
			break;

		case 77:
			img_do_livro.setImageResource(R.drawable.oalquimista);
			nome_livro.setText(R.string.txt_nome02_livro16);
			
			txt_sinopse.setText(R.string.sinopse02_16);
			break;

		case 78:
			img_do_livro.setImageResource(R.drawable.herdeiradofogo3);
			nome_livro.setText(R.string.txt_nome03_livro16);
			
			txt_sinopse.setText(R.string.sinopse03_16);
			break;

		case 79:
			img_do_livro.setImageResource(R.drawable.ascronicasdenarnia);
			nome_livro.setText(R.string.txt_nome04_livro16);
			
			txt_sinopse.setText(R.string.sinopse04_16);
			break;

		case 80:
			img_do_livro.setImageResource(R.drawable.omedicoeomonstro);
			nome_livro.setText(R.string.txt_nome05_livro16);
			
			txt_sinopse.setText(R.string.sinopse05_16);
			break;

		default:
			break;
		}

		// Cadastro de Avaliações
		
		

		btn_enviar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				AlertDialog.Builder alerta01 = new AlertDialog.Builder(
						Tela_do_livro.this);
				alerta01.setTitle("BIBLIOTECA JANE AUSTEN");
				alerta01.setMessage("Você deseja avaliar o livro?");
				alerta01.setCancelable(false);
				alerta01.setNegativeButton("NÃO",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub
								
							}
						});

				alerta01.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								// TODO Auto-generated method stub
								
								Livro livro = new Livro();
								livro.setNome(nome_livro.getText().toString());
								livro.setNota(Double.valueOf(rating_bar
										.getRating()));
								db = new LivroDAO(Tela_do_livro.this);
								db.salvarLivro(livro);  
								
								
								rating_bar.setRating(Float.valueOf(0));
								
								Toast.makeText(Tela_do_livro.this,
										"GRAVADO COM SUCESSO",
										Toast.LENGTH_SHORT).show();

							}
						});
				alerta01.show();
			}
		});

	}
	
	public void voltar (View v) {
		Intent intent = new Intent(Tela_do_livro.this, Tela_categoria_livros.class);
		startActivity(intent);
		
	}
	
	public void marcar_lida(View v) {
		Toast.makeText(Tela_do_livro.this, "MARCADO COMO LIDO", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_do_livro, menu);
		return true;
	}

}
