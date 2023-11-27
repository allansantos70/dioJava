package desafio;

import java.util.Scanner;

 /*Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso de teste inicia com uma palavra, que é o primeiro nome de quem está tentando levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo. */

public class PulandoNome {
     
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

         String[] nomes  = new String [10];

         System.out.println("informe o nome: ");

         for(int i = 0; i < 5; i++){
             nomes[i] = leia.nextLine();
         }
         System.out.println(nomes[2]);
         System.out.println(nomes[6]);
         System.out.println(nomes[8]);
     
         leia.close();


    }
  

}
