package smartPhone;

import aparelhoTelefonico.AparelhoTelefonico;
import comunicadorInternet.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical,NavegadorInternet {

	public void desbloquear() {
		System.out.println("Iphone Desbloqueado");

	}

	public void ligar() {
		System.out.println("Fazendo uma Ligação");

	}

	public void atender() {
		System.out.println("Atendendo Ligação");

	}

	public void iniciarCorreioVoz() {
		System.out.println("Inciando Correio de Voz");

	}

	public void tocar() {
		System.out.println("Tocando Música");

	}

	public void pausar() {
		System.out.println("Música Pausada ");

	}

	public void selecionarMusica() {
		System.out.println("Selecionando Música");
	}

	public void proximarMusica() {
		System.out.println("Passando para Proxíma Música >>");

	}

	public void musicaAnterior() {
		System.out.println("<< Retornando para Música Anterior");

	}

	public void exibirPagina() {
		System.out.println("Exibindo Pagina Facebook no Safari");

	}

	public void adicionarNovaAba() {

		System.out.println("Adicionando uma Nova Aba");

	}

	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");

	}

	public void assistirVideo() {
		System.out.println("Assistindo Video no Youtube");
	}

	
	public void enviarSms() {
		System.out.println("Enviando SMS");
		
	}

}
