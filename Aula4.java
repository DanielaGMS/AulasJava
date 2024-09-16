//Aula 4
 // Crie um jogo em que o usuário digite um número e ao final ele verifique se acertou ou errou o número aleatório.

 import java.util.Random;
 import java.util.Scanner;
 public class Aula4 {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        Scanner lendoNumero = new Scanner (System.in);

        final int sorteio = aleatorio.nextInt (0,10);

        System.out.println("Digite um número para jogar: ");
        int numeroDoUsuario = lendoNumero.nextInt();
        
        System.out.println("Número digitado: " + numeroDoUsuario + " - Número aleatório: " + sorteio);

        lendoNumero.close();
        

   
    }
}

