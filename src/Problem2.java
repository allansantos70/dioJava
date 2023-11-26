
import java.util.Scanner;

public class Problem2 {
  
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
