
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe o primeito parametro: ");
        int parametroUm = leia.nextInt();

        System.out.println("Informe o primeito parametro: ");
        int parametroDois = leia.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvValidosException e) {

            System.out.println("O SEGUNDO PARÂMENTRO DEVE SER MAIOR QUE O PRIMEIRO");

        }

        leia.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvValidosException {

        // Validar se parametroUm é maior que o parametroDois e lançar a execeção

        int contagem = parametroDois - parametroUm;
        if (parametroDois > parametroUm) {
            for (int cont = 0; cont < contagem; cont++) {
                System.out.println("Imprimindo o número " + (cont + 1));
            }
        } else {
            throw new ParametrosInvValidosException();
        }
    }

}
