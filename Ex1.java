/* 1. Crie um programa em Java que leia o nome do aluno e suas 5 notas, e ao final, retorne sua média  */
import java.util.Scanner;
public class Ex1 {

public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int quantidade1, quantidade2, quantidade3, quantidade4, quantidade5;
    double preco1, preco2, preco3, preco4, preco5, media1, media2, media3, media4, media5, soma = 0.0;
    String nome1, nome2, nome3, nome4, nome5;


    System.out.println("Digite o nome do produto: ");
    nome1 = leitura.nextLine();


    System.out.println("Digite o nome do produto: ");
    media1 = leitura.nextDouble();

    soma = soma + media1;
    System.out.println(soma);
    leitura.close();
}


}