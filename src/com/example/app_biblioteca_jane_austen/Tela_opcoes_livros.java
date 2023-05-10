package com.example.app_biblioteca_jane_austen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela_opcoes_livros extends Activity {

	int tela_cat;
	TextView txt_colecao, txt_tit1, txt_tit2, txt_tit3, txt_tit4,
			txt_nome_livro1, txt_nome_livro2, txt_nome_livro3, txt_nome_livro4,
			txt_nome_livro5, txt_nome_livro6, txt_nome_livro7, txt_nome_livro8,
			txt_nome_livro9, txt_nome_livro10, txt_nome_livro11,
			txt_nome_livro12, txt_nome_livro13, txt_nome_livro14,
			txt_nome_livro15, txt_nome_livro16;

	ImageView imagem_livro1, imagem_livro2, imagem_livro3, imagem_livro4,
			imagem_livro5, imagem_livro6, imagem_livro7, imagem_livro8,
			imagem_livro9, imagem_livro10, imagem_livro11, imagem_livro12,
			imagem_livro13, imagem_livro14, imagem_livro15, imagem_livro16;

	Bundle bundle = new Bundle();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela_opcoes_livros);

		Bundle b = getIntent().getExtras();
		tela_cat = b.getInt("val");

		imagem_livro1 = (ImageView) findViewById(R.id.img_livro1);
		imagem_livro2 = (ImageView) findViewById(R.id.img_livro2);
		imagem_livro3 = (ImageView) findViewById(R.id.img_livro3);
		imagem_livro4 = (ImageView) findViewById(R.id.img_livro4);

		imagem_livro5 = (ImageView) findViewById(R.id.img_livro5);
		imagem_livro6 = (ImageView) findViewById(R.id.img_livro6);
		imagem_livro7 = (ImageView) findViewById(R.id.img_livro7);
		imagem_livro8 = (ImageView) findViewById(R.id.img_livro8);

		imagem_livro9 = (ImageView) findViewById(R.id.img_livro9);
		imagem_livro10 = (ImageView) findViewById(R.id.img_livro10);
		imagem_livro11 = (ImageView) findViewById(R.id.img_livro11);
		imagem_livro12 = (ImageView) findViewById(R.id.img_livro12);

		imagem_livro13 = (ImageView) findViewById(R.id.img_livro13);
		imagem_livro14 = (ImageView) findViewById(R.id.img_livro14);
		imagem_livro15 = (ImageView) findViewById(R.id.img_livro15);
		imagem_livro16 = (ImageView) findViewById(R.id.img_livro16);
		
		
		txt_tit1 = (TextView) findViewById(R.id.txt_tit1);
		txt_tit2 = (TextView) findViewById(R.id.txt_tit2);
		txt_tit3 = (TextView) findViewById(R.id.txt_tit3);
		txt_tit4 = (TextView) findViewById(R.id.txt_tit4);
		
		txt_nome_livro1 = (TextView) findViewById(R.id.txt_nome_livro1);
		txt_nome_livro2 = (TextView) findViewById(R.id.txt_nome_livro2);
		txt_nome_livro3 = (TextView) findViewById(R.id.txt_nome_livro3);
		txt_nome_livro4 = (TextView) findViewById(R.id.txt_nome_livro4);
		txt_nome_livro5 = (TextView) findViewById(R.id.txt_nome_livro5);
		txt_nome_livro6 = (TextView) findViewById(R.id.txt_nome_livro6);
		txt_nome_livro7 = (TextView) findViewById(R.id.txt_nome_livro7);
		txt_nome_livro8 = (TextView) findViewById(R.id.txt_nome_livro8);
		txt_nome_livro9 = (TextView) findViewById(R.id.txt_nome_livro9);
		txt_nome_livro10 = (TextView) findViewById(R.id.txt_nome_livro10);
		txt_nome_livro11 = (TextView) findViewById(R.id.txt_nome_livro11);
		txt_nome_livro12 = (TextView) findViewById(R.id.txt_nome_livro12);
		txt_nome_livro13 = (TextView) findViewById(R.id.txt_nome_livro13);
		txt_nome_livro14 = (TextView) findViewById(R.id.txt_nome_livro14);
		txt_nome_livro15 = (TextView) findViewById(R.id.txt_nome_livro15);
		txt_nome_livro16 = (TextView) findViewById(R.id.txt_nome_livro16);


		// Trocando imagens de cada tela de opções

		switch (tela_cat) {
		case 1:
			imagem_livro1.setImageResource(R.drawable.eassimqueacaba);
			imagem_livro2.setImageResource(R.drawable.ummilhaodefinaisfelizes);
			imagem_livro3.setImageResource(R.drawable.voceligouparasam);
			imagem_livro4.setImageResource(R.drawable.clubedolivrodoshomens);

			imagem_livro5.setImageResource(R.drawable.amoregelato);
			imagem_livro6.setImageResource(R.drawable.eleanorpark);
			imagem_livro7.setImageResource(R.drawable.osdoismorremnofinal);
			imagem_livro8.setImageResource(R.drawable.vermelhobrancosangueazul);

			imagem_livro9.setImageResource(R.drawable.eassimquecomeca);
			imagem_livro10.setImageResource(R.drawable.novembro9);
			imagem_livro11.setImageResource(R.drawable.todasassuasimperfeicoes);
			imagem_livro12.setImageResource(R.drawable.oladofeiodoamor);

			imagem_livro13.setImageResource(R.drawable.acincopassosdevoce);
			imagem_livro14.setImageResource(R.drawable.milbeijosdeumgaroto);
			imagem_livro15.setImageResource(R.drawable.porlugaresincriveis);
			imagem_livro16.setImageResource(R.drawable.tetoparadois);
			
			txt_tit1.setText(R.string.tit_tela01_01);
			txt_tit3.setText(R.string.tit_tela01_03);
			
			
			txt_nome_livro1.setText(R.string.txt_nome01_livro1);
			txt_nome_livro2.setText(R.string.txt_nome01_livro2);
			txt_nome_livro3.setText(R.string.txt_nome01_livro3);
			txt_nome_livro4.setText(R.string.txt_nome01_livro4);
			txt_nome_livro5.setText(R.string.txt_nome01_livro5);
			txt_nome_livro6.setText(R.string.txt_nome01_livro6);
			txt_nome_livro7.setText(R.string.txt_nome01_livro7);
			txt_nome_livro8.setText(R.string.txt_nome01_livro8);
			txt_nome_livro9.setText(R.string.txt_nome01_livro9);
			txt_nome_livro10.setText(R.string.txt_nome01_livro10);
			txt_nome_livro11.setText(R.string.txt_nome01_livro11);
			txt_nome_livro12.setText(R.string.txt_nome01_livro12);
			txt_nome_livro13.setText(R.string.txt_nome01_livro13);
			txt_nome_livro14.setText(R.string.txt_nome01_livro14);
			txt_nome_livro15.setText(R.string.txt_nome01_livro15);
			txt_nome_livro16.setText(R.string.txt_nome01_livro16);

			break;

		case 2:
			imagem_livro1.setImageResource(R.drawable.domquixote);
			imagem_livro2.setImageResource(R.drawable.emma);
			imagem_livro3.setImageResource(R.drawable.madamebovary);
			imagem_livro4.setImageResource(R.drawable.oautodabarca);

			imagem_livro5.setImageResource(R.drawable.ocorvo);
			imagem_livro6.setImageResource(R.drawable.romeuejulieta);
			imagem_livro7.setImageResource(R.drawable.orgulhoepreconceito);
			imagem_livro8.setImageResource(R.drawable.oslusiadas);

			imagem_livro9.setImageResource(R.drawable.oitentaanosdepoesia);
			imagem_livro10.setImageResource(R.drawable.iracema);
			imagem_livro11.setImageResource(R.drawable.memoriaspostumas);
			imagem_livro12.setImageResource(R.drawable.oateneu);

			imagem_livro13.setImageResource(R.drawable.domcasmurro);
			imagem_livro14.setImageResource(R.drawable.ocortico);
			imagem_livro15.setImageResource(R.drawable.quincasborba);
			imagem_livro16.setImageResource(R.drawable.oalquimista);
			
			txt_tit1.setText(R.string.tit_tela02_01);
			txt_tit3.setText(R.string.tit_tela02_03);
			
			txt_nome_livro1.setText(R.string.txt_nome02_livro1);
			txt_nome_livro2.setText(R.string.txt_nome02_livro2);
			txt_nome_livro3.setText(R.string.txt_nome02_livro3);
			txt_nome_livro4.setText(R.string.txt_nome02_livro4);
			txt_nome_livro5.setText(R.string.txt_nome02_livro5);
			txt_nome_livro6.setText(R.string.txt_nome02_livro6);
			txt_nome_livro7.setText(R.string.txt_nome02_livro7);
			txt_nome_livro8.setText(R.string.txt_nome02_livro8);
			txt_nome_livro9.setText(R.string.txt_nome02_livro9);
			txt_nome_livro10.setText(R.string.txt_nome02_livro10);
			txt_nome_livro11.setText(R.string.txt_nome02_livro11);
			txt_nome_livro12.setText(R.string.txt_nome02_livro12);
			txt_nome_livro13.setText(R.string.txt_nome02_livro13);
			txt_nome_livro14.setText(R.string.txt_nome02_livro14);
			txt_nome_livro15.setText(R.string.txt_nome02_livro15);
			txt_nome_livro16.setText(R.string.txt_nome02_livro16);

			break;

		case 3:
			imagem_livro1.setImageResource(R.drawable.crepusculo1);
			imagem_livro2.setImageResource(R.drawable.luanova2);
			imagem_livro3.setImageResource(R.drawable.eclipse3);
			imagem_livro4.setImageResource(R.drawable.amanhecer4);

			imagem_livro5.setImageResource(R.drawable.cortedeespinhoserosas1);
			imagem_livro6.setImageResource(R.drawable.cortedenevoaefuria2);
			imagem_livro7.setImageResource(R.drawable.cortedeasaseruina3);
			imagem_livro8.setImageResource(R.drawable.cortedechamasprateadas4);

			imagem_livro9.setImageResource(R.drawable.aselecao);
			imagem_livro10.setImageResource(R.drawable.aelite);
			imagem_livro11.setImageResource(R.drawable.aescolha);
			imagem_livro12.setImageResource(R.drawable.aherdeira);

			imagem_livro13.setImageResource(R.drawable.laminaassassina);
			imagem_livro14.setImageResource(R.drawable.tronodevidro1);
			imagem_livro15.setImageResource(R.drawable.coroadameianoite2);
			imagem_livro16.setImageResource(R.drawable.herdeiradofogo3);
			
			txt_tit1.setText(R.string.tit_tela03_01);
			txt_tit2.setText(R.string.tit_tela03_02);
			txt_tit3.setText(R.string.tit_tela03_03);
			txt_tit4.setText(R.string.tit_tela03_04);
			
			txt_nome_livro1.setText(R.string.txt_nome03_livro1);
			txt_nome_livro2.setText(R.string.txt_nome03_livro2);
			txt_nome_livro3.setText(R.string.txt_nome03_livro3);
			txt_nome_livro4.setText(R.string.txt_nome03_livro4);
			txt_nome_livro5.setText(R.string.txt_nome03_livro5);
			txt_nome_livro6.setText(R.string.txt_nome03_livro6);
			txt_nome_livro7.setText(R.string.txt_nome03_livro7);
			txt_nome_livro8.setText(R.string.txt_nome03_livro8);
			txt_nome_livro9.setText(R.string.txt_nome03_livro9);
			txt_nome_livro10.setText(R.string.txt_nome03_livro10);
			txt_nome_livro11.setText(R.string.txt_nome03_livro11);
			txt_nome_livro12.setText(R.string.txt_nome03_livro12);
			txt_nome_livro13.setText(R.string.txt_nome03_livro13);
			txt_nome_livro14.setText(R.string.txt_nome03_livro14);
			txt_nome_livro15.setText(R.string.txt_nome03_livro15);
			txt_nome_livro16.setText(R.string.txt_nome03_livro16);


			break;

		case 4:
			imagem_livro1.setImageResource(R.drawable.harry1);
			imagem_livro2.setImageResource(R.drawable.harrypottereacamara);
			imagem_livro3.setImageResource(R.drawable.harrypottereoprisioneiro);
			imagem_livro4.setImageResource(R.drawable.harrypottereocalice);

			imagem_livro5
					.setImageResource(R.drawable.harrypottereaordemdafenix);
			imagem_livro6.setImageResource(R.drawable.harrypottereoenigma);
			imagem_livro7.setImageResource(R.drawable.harrypottereasreliquias);
			imagem_livro8.setImageResource(R.drawable.acriancaamaldicoada);

			imagem_livro9.setImageResource(R.drawable.osobrinhodomago1);
			imagem_livro10
					.setImageResource(R.drawable.oleaoafeiticeiraeoguardaroupa2);
			imagem_livro11.setImageResource(R.drawable.ocavaloeseumenino3);
			imagem_livro12.setImageResource(R.drawable.principecaspian4);

			imagem_livro13.setImageResource(R.drawable.aviagemdoperegrino5);
			imagem_livro14.setImageResource(R.drawable.acadeiradeprata6);
			imagem_livro15.setImageResource(R.drawable.aultimabatalha7);
			imagem_livro16.setImageResource(R.drawable.ascronicasdenarnia);
			
			txt_tit1.setText(R.string.tit_tela04_01);
			txt_tit3.setText(R.string.tit_tela04_03);
			
			txt_nome_livro1.setText(R.string.txt_nome04_livro1);
			txt_nome_livro2.setText(R.string.txt_nome04_livro2);
			txt_nome_livro3.setText(R.string.txt_nome04_livro3);
			txt_nome_livro4.setText(R.string.txt_nome04_livro4);
			txt_nome_livro5.setText(R.string.txt_nome04_livro5);
			txt_nome_livro6.setText(R.string.txt_nome04_livro6);
			txt_nome_livro7.setText(R.string.txt_nome04_livro7);
			txt_nome_livro8.setText(R.string.txt_nome04_livro8);
			txt_nome_livro9.setText(R.string.txt_nome04_livro9);
			txt_nome_livro10.setText(R.string.txt_nome04_livro10);
			txt_nome_livro11.setText(R.string.txt_nome04_livro11);
			txt_nome_livro12.setText(R.string.txt_nome04_livro12);
			txt_nome_livro13.setText(R.string.txt_nome04_livro13);
			txt_nome_livro14.setText(R.string.txt_nome04_livro14);
			txt_nome_livro15.setText(R.string.txt_nome04_livro15);
			txt_nome_livro16.setText(R.string.txt_nome04_livro16);
			break;

		case 5:
			imagem_livro1.setImageResource(R.drawable.saborosocadaver);
			imagem_livro2.setImageResource(R.drawable.misery);
			imagem_livro3.setImageResource(R.drawable.itacoisa);
			imagem_livro4.setImageResource(R.drawable.contodefadas);

			imagem_livro5.setImageResource(R.drawable.adancadamorte);
			imagem_livro6.setImageResource(R.drawable.amitivillehouse);
			imagem_livro7.setImageResource(R.drawable.criaturascriadores);
			imagem_livro8.setImageResource(R.drawable.dracula);

			imagem_livro9.setImageResource(R.drawable.encruzilhada);
			imagem_livro10.setImageResource(R.drawable.obebederosemary);
			imagem_livro11.setImageResource(R.drawable.oexorcista);
			imagem_livro12.setImageResource(R.drawable.oiluminado);

			imagem_livro13.setImageResource(R.drawable.ossete);
			imagem_livro14.setImageResource(R.drawable.ovilarejo);
			imagem_livro15.setImageResource(R.drawable.terramorta);
			imagem_livro16.setImageResource(R.drawable.omedicoeomonstro);
			
			txt_nome_livro1.setText(R.string.txt_nome05_livro1);
			txt_nome_livro2.setText(R.string.txt_nome05_livro2);
			txt_nome_livro3.setText(R.string.txt_nome05_livro3);
			txt_nome_livro4.setText(R.string.txt_nome05_livro4);
			txt_nome_livro5.setText(R.string.txt_nome05_livro5);
			txt_nome_livro6.setText(R.string.txt_nome05_livro6);
			txt_nome_livro7.setText(R.string.txt_nome05_livro7);
			txt_nome_livro8.setText(R.string.txt_nome05_livro8);
			txt_nome_livro9.setText(R.string.txt_nome05_livro9);
			txt_nome_livro10.setText(R.string.txt_nome05_livro10);
			txt_nome_livro11.setText(R.string.txt_nome05_livro11);
			txt_nome_livro12.setText(R.string.txt_nome05_livro12);
			txt_nome_livro13.setText(R.string.txt_nome05_livro13);
			txt_nome_livro14.setText(R.string.txt_nome05_livro14);
			txt_nome_livro15.setText(R.string.txt_nome05_livro15);
			txt_nome_livro16.setText(R.string.txt_nome05_livro16);

			break;

		default:
			break;
		}

		// fim

	}

	public void mudarTela() {
		Intent intent = new Intent(Tela_opcoes_livros.this, Tela_do_livro.class);
		intent.putExtras(bundle);
		startActivity(intent);
	}

	// Click das imagens

	public void img_livro1(View v) {

		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 1);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 2);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 3);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 4);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 5);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro2(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 6);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 7);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 8);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 9);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 10);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro3(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 11);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 12);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 13);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 14);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 15);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro4(View v) {

		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 16);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 17);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 18);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 19);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 20);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro5(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 21);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 22);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 23);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 24);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 25);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro6(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 26);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 27);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 28);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 29);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 30);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro7(View v) {

		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 31);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 32);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 33);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 34);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 35);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro8(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 36);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 37);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 38);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 39);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 40);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro9(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 41);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 42);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 43);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 44);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 45);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro10(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 46);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 47);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 48);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 49);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 50);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro11(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 51);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 52);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 53);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 54);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 55);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro12(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 56);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 57);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 58);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 59);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 60);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro13(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 61);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 62);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 63);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 64);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 65);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro14(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 66);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 67);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 68);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 69);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 70);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro15(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 71);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 72);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 73);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 74);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 75);
			mudarTela();

			break;

		default:
			break;
		}

	}

	public void img_livro16(View v) {
		switch (tela_cat) {
		case 1:
			bundle.putInt("click", 76);
			mudarTela();

			break;

		case 2:
			bundle.putInt("click", 77);
			mudarTela();

			break;

		case 3:
			bundle.putInt("click", 78);
			mudarTela();

			break;

		case 4:
			bundle.putInt("click", 79);
			mudarTela();

			break;

		case 5:
			bundle.putInt("click", 80);
			mudarTela();

			break;

		default:
			break;
		}

	}
	
	public void voltar (View v) {
		Intent intent = new Intent(Tela_opcoes_livros.this, Tela_categoria_livros.class);
		startActivity(intent);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_opcoes_livros, menu);
		return true;
	}

}
