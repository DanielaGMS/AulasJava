import java.util.Random;
import java.util.Scanner;

public class Aula5j{ 
    public static void main (String [] args) {

    //Atribuindo os valores iniciais.
    Random aleatorio = new Random();
    Scanner leia = new Scanner (System.in);
    final int sorteio = aleatorio.nextInt (1,6);

    //Obtendo valores com o usuário.
    System.out.println("Digite um número");
    int numero = leia.nextInt();

    //Condição 1: Caso o número aleatório seja IGUAL ao número escolhido a mensagem será "Acertou!"
    if (numero == sorteio) {
        System.out.println("Acertou!");
        leia.close();
        return;
    }

    //Função para receber um novo número (iniciando)
    System.out.println("Digite um número: ");
    numero = leia.nextInt();

    /* Condição 2: É uma nova tentativa semelhante a primeira que comparará o número recente ao numéro CONSTANTE sorteado. 
    Essa seria a segunda e última tentativa. */
    
    if (numero == sorteio) {
        System.out.println("Acertou");
        leia.close();
        return;

    }

  leia.close();  
    }
}