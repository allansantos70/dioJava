package desafio;

import java.util.Scanner; 

public class PedraPapel {

    public static void main(String[] args) {
      
        Scanner leitor = new Scanner(System.in);

    	int N = leitor.nextInt();
    	String jogador1, jogador2;
               
// TODO: complete os espaços em branco com sua solução para o problema
    	for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();
    		
    		
    		if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")){
    		    // Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, 
    	    	//todos os jogadores perdem, devido a Aniquilação Mútua.
    		    System.out.println("Aniquilação mutua");
    		  
    	  	}else if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")){
    		     //  Papel vs. Papel: Nesta variação, ambos os jogadores ganham,
    		     //porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
    		     System.out.println("Ambos venceram");
    		  
    	    }else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")){
    		     //Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, 
    		      //porque Ataque Aéreo sempre ganha e o Papel é patético.
    		      System.out.println("jogador 1 venceu");
    		   
    	   	}else if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")){
    		      //Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, 
    		      //porque Ataque Aéreo sempre ganha e o Papel é patético.
    		     System.out.println("jogador 2 venceu");
    	  
    	  	}else if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")){
    	  	    //Ataque Aéreo vs. Pedra: Neste caso, o jogador com o 
    	  	    //Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
    	  	    System.out.println("jogador 1 venceu");
    	  	    
    	  	}else if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")){
    	           //Ataque Aéreo vs. Pedra: Neste caso, o jogador com o 
    	  	    //Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
    	  	    System.out.println("jogador 2 venceu");

    	  	}else{
    	  	    // Pedra vs. Pedra: Para este caso não há ganhador, 
    	  	    //porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
    	  	    System.out.println("Sem ganhador");
    	  	  
    	  	}
    	  	
         }

         leitor.close();

   }

}