package tela;

import aparelhoTelefonico.AparelhoTelefonico;
import comunicadorInternet.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import smartPhone.Iphone;

public class TelaInicial {

	public static void main(String[] args) {
	
	/*Programa para simular as funções do IPHONE 2G, conforme conhecimento 
	 * obtido na aula de orinteção objeto interface */

		Iphone iphone = new Iphone();
		
		AparelhoTelefonico iphone2g = iphone;
		NavegadorInternet safari = iphone;
		ReprodutorMusical ipod = iphone;
		
		
		// Simulando função phone do Iphone.
		iphone2g.desbloquear();
		iphone2g.atender();
		iphone2g.ligar();
		iphone2g.iniciarCorreioVoz();
		iphone2g.enviarSms();
		System.out.println();
		
				
		// Simulando função Navegador Safari.
		safari.exibirPagina();
		safari.adicionarNovaAba();
		safari.atualizarPagina();
		safari.assistirVideo();
		System.out.println();
		
		//Simulado função do ipod.	
		ipod.selecionarMusica();
		ipod.tocar();
		ipod.pausar();
		ipod.proximarMusica();
		ipod.musicaAnterior();
		
		
	}

}
