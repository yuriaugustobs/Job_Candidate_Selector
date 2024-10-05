package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();
        String[] candidatos = {"Felipe", "Yuri", "Maria", "Andre", "João"};

        for (String candidato : candidatos) {
            contato(candidato);
        }
    }
        
       
    static void contato(String candidato) {
        int tentativa=1;
        boolean continua=true;
        boolean atendeu=false;


        do{
            atendeu= atendeu();
            continua = !atendeu;

            if (continua) {
                System.out.println("Tentativa n° " + tentativa + " de contato com " + candidato);
                tentativa++;
            } else {
                System.out.println("Contato realizado com sucesso com " + candidato);
            }
        } while(continua && tentativa < 3);
        if (!atendeu) {
            System.out.println("Não foi possível contatar " + candidato + " após 3 tentativas!");
        }
        }

          static boolean atendeu () {
                return new Random ().nextInt(3)==1;
            }
        
    

    static void imprimirSelecionados () {
        String[] candidatos = {"Felipe", "Yuri", "Maria", "Andre", "João"};
        System.out.println("Imprimindo a lista de candidadots informando o índice do elemento.");
        for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato n°: " + (indice+1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Yuri", "Maria", "Andre", "João", "Lucas", "Gleysson", "Flávio", "Gaby"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            

            System.out.println("O Candidato" + candidato + "Solicitou este valor de salário:" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        // Gera um valor aleatório entre 1500 e 3000
        return ThreadLocalRandom.current().nextDouble(1500, 3000);
    }
    
    
    static void analisarCandidato (double salarioPretendido) { 
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
        System.out.println("Ligar para o candidato");
        }

        else if (salarioBase == salarioPretendido) 
        System.out.println("Ligar para candidato com contra-proposta");

        else {
            System.out.println("Aguardando Resultado dos demais candidatos");
        }

            
        }

    }

