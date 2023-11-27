package desafio;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; 
public class ProcessoSeletivo {
    
    public static void main(String[] args) {
     
     String [] candidatos = {"FELIPE","MARCIA", "JULIA","PAULO", "AUGUSTO"};
     for(String candidato: candidatos){
         entrandoEmContato(candidato);
     }

    
        

    }    

    static void entrandoEmContato(String candidato){
       int tentativasRealizadas = 1;
       boolean continuarTentando = true;
       boolean atendeu = false;

       do{
        atendeu = atender();
        continuarTentando = !atendeu;
        if (continuarTentando) {
            tentativasRealizadas++;
        }else{
            System.out.println("CONTATO REALIZADO COM SUCESSO");
        }

       }while(continuarTentando && tentativasRealizadas < 3);

       if (atendeu) {
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
       }else{
        System.out.println("TENTAMOS CONTATO COM " + candidato +", NÚMERO MÁXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
       }

    }

    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    // método para imprimir seelecionados
    static void imprimirSelecionado(){
        String [] candidatos = {"FELIPE","MARCIA", "JULIA","PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº" + (indice + 1) + " é " + candidatos[indice]);

        }
        System.out.println("Forma abreviada de interação foreach");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    
    // método para selecionar candidato conforme valor salario pretendido
    static void selecaoCandidato(){
    String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO", "MONICA","FABRICIO","MIRELA","DANIELA","JORGE" };
      
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos[candidatoAtual];
        double salarioPretendido = ValorPretendido();

        System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecinado para a vaga");
            candidatosSelecionados++;
        }
        candidatoAtual++;

    }
}
 
     // método analisar os candidos de acordo base no valor do salario base.
     static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO");
            }else if (salarioBase == salarioPretendido){
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA ");
            } else{
                System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATO");
            }    
          
        
    }


         static double ValorPretendido(){
                return ThreadLocalRandom.current().nextDouble(1800,2200);
            }
}
