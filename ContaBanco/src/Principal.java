
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cliente c1 = new Cliente();
		Conta cc = new ContaCorrente(c1);
		Conta poupanca = new ContaPoupanca(c1);

		// Solicitar o nome do cliente
		System.out.println("Informe seu nome: ");
		c1.nome = sc.next();

		/*
		 * verificar se o usuário digitado é usuário cadastrado se sim solicita a senha
		 * se não informa usuário inválido.
		 */
		if (c1.nome.equalsIgnoreCase("pedro")) {
			System.out.println("Informe sua senha: ");
			c1.senha = sc.next();

			/*
			 * checar se a senha é a senha cadastra se sim o cliente pode executar operações
			 * se não informa senha errada e encerrar o programa.
			 */
			if (c1.senha.equals("12345")) {

				System.out.println("===============================");
				System.out.println("      MENU PRINCIPAL   ");
				System.out.println("===============================");
				System.out.println("==== SEJA BEM VINDO " + c1.getNome().toUpperCase() + " =====\n");

				System.out.println("SALDO ATUAL C CORRENTE: " + cc.saldo);
				System.out.println("SALDO ATUAL C POUPANÇA: " + poupanca.saldo + "\n");

				int opcao = 0;

				System.out.println("SELECIONE UMA OPÇÃO ABAIXO:\n ");
				System.out.println("DEPOSITO DIGITE (1)\n" + "TRANSFERÊNCIA DIGITE(2)\n" + "SAQUE DIGITE (3)\n"
						+ "EXTRATO DIGITE (4)\n" + "SAIR DIGITE (0)\n");
				System.out.println("===============================");

				System.out.println("DIGITE A OPÇÃO: ");
				opcao = sc.nextInt();
				
				//Enquanto a condição for verdadeira a transação será realizada.
				while (opcao != 0) {

					switch (opcao) {
					case 1:

						// solicita o valor do deposito
						System.out.println("DIGITE O VALOR DEPOSITO: ");
						cc.depositar(sc.nextDouble());

						System.out.println("DESEJA DEPOSITAR OUTRO VALOR\n" + "Sim(1): Não(2) : Sair(0)");
						opcao = sc.nextInt();

						if (opcao == 1) {
							continue;
						} else if (opcao == 0) {
							System.out.println("FIM DA TRANSAÇÃO\n");
							break;
						}

					case 2:
						System.out.println("DIGITE O VALOR DAR TRANSFERÊNCIA: ");
						cc.transferir(sc.nextDouble(), poupanca);

						System.out.println("DESEJA TRANSFERIR OUTRO VALOR\n" + "Sim(1): Não(2) : Sair(0)");
						opcao = sc.nextInt();

						if (opcao == 1) {
							continue;
						} else if (opcao == 0) {
							System.out.println("FIM DA TRANSAÇÃO\n");
							break;
						}
					case 3:
						System.out.println("DIGITE O VALOR DO SAQUE: ");
						cc.sacar(sc.nextDouble());

						System.out.println("DESEJA SACAR OUTRO VALOR\n" + "Sim(1): Não(2) : Sair(0)");
						opcao = sc.nextInt();

						if (opcao == 1) {
							continue;
						} else if (opcao == 0) {
							System.out.println("FIM DA TRANSAÇÃO\n");
							break;
						}

					case 4:

						System.out.println("DESEJA IMPRIMIR EXTRATO\n" + "Sim(1): Sair(0)");
						opcao = sc.nextInt();
						if (opcao == 1) {
							cc.imprimirExtrato();
							poupanca.imprimirExtrato();

							System.out.println("Digite (0) para sair");
							opcao = sc.nextInt();

						}
					}
				}
				System.out.println("NOVO SALDO CONTA CORRENTE =  " + cc.saldo);
				System.out.println("NOVO SALDO CONTA POUPANCA =  " + poupanca.saldo);

			} else {
				System.out.println("SENHA INVÁLIDA");
			}

		} else {
			System.out.println("USUÁRIO INVÁLIDO");
		}
		System.out.println("FIM DO PROGRAMA");
		
		sc.close();
	}

}
