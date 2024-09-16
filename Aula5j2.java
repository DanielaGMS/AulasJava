import java.util.Random;
import java.util.Scanner;

public class Aula5j2{ 
    public static void main (String [] args) {

    //Atribuindo os valores iniciais.
    Random aleatorio = new Random();
    Scanner leia = new Scanner (System.in);
    final int sorteio = aleatorio.nextInt (1,6);

    //Obtendo valores com o usuário.
    System.out.println("Digite um número");
    int numero = leia.nextInt(), pontuacao = 30;

    //Condição 1: Caso o número aleatório seja IGUAL ao número escolhido a mensagem será "Você acertou!"
    if (numero == sorteio) {
        System.out.println("Você acertou!");
        leia.close();
        return;
    }

    //Condição 2: Caso o número aleatório seja DIFERENTE ao número escolhido a mensagem será "Você perder 10 pontos e está com X pontos."
    else if {
        pontuacao = pontuacao - 10;

        System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + "pontos!");
        leia.close();

    }

    //Condição 3: Caso o número aleatório seja DIFERENTE ao número escolhido a mensagem será "Você perder 10 pontos e está com X pontos."
    else if {
        pontuacao = pontuacao - 10;

        System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + "pontos!");
        leia.close();

    }

    else {
        pontuacao = pontuacao - 10;

        System.out.println("Você perdeu " + 10 + " pontos e está com " + pontuacao + "pontos!");
        leia.close();
    }
   
  leia.close();  
    }
}