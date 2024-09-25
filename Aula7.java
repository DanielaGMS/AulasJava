import java.util.Scanner;
import java.util.Random;


public class Aula7{
    public static void main(String[] args) {

        /* Identificação e chamamento de duas bibliotecas: Random (para gerar números aleatórios) e Scanner 
        (para ler os números que o usuário irá inserir) */
        Random aleatorio = new Random();
        Scanner leitura = new Scanner (System.in);


        //
        final int sorteio = aleatorio.nextInt(1,6);

        //
        System.out.println( "Digite um número: " );
        int numero;
        int pontuacao = 50;
        while (pontuacao > 0){
            numero = leitura.nextInt();
            
            
            /* Condicional que indica a possibilidade se se o número do sorteio for maior que o número digitado 
            o programa deve imprimir na tela do usuário: Número digitado é menor que o número sorteado! */  
                if (sorteio > numero){
                //pontuação = pontuação - 10
                pontuacao -= 10;
                System.out.println(" Número digitado é menor que o número sorteado! ");

            }
            
            /* Condicional contrária a primeira que indica que o número digitado pelo usuário é maior que o sorteado. */
                else if (sorteio < numero){
                System.out.println(" Número digitado é maior que o número sorteado! ");  

            }
            
            /*  Condicional contrária a todas as outras, indicando que se o número digitado não foi menor (primeira possibilidade), 
            ou menor (segunda possibilidade) ele será (terceira possibilidade) o número gerado aleatóriamente. */

                else{
                System.out.println(" Você acertou! ");
                return;

            }

        }  
        System.out.println("Você perdeu! ");
        leitura.close();

    }

        
}


