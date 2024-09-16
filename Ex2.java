
// 2. Calcule a soma das média dos 5 estudantes e, ao final, retone essa soma e os nome dos estudantes.

import java.util.Scanner;
public class Ex2 {

public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double media1, media2, media3, media4, media5, soma = 0.0;
    String nome1, nome2, nome3, nome4, nome5;


    System.out.println("Digite seu nome: \n");
    nome1 = leitura.nextLine();
    System.out.println("Digite sua média: \n");
    media1 = leitura.nextLine();
    System.out.println("Seu nome é: " + nome1 + "Sua média é: " + media1 +"\n");
    

    System.out.println("Digite seu nome:  \n");
    nome2 = leitura.nextLine();
    System.out.println("Digite sua média: \n");
    media2 = leitura.nextLine();
    System.out.println("Seu nome é: " + nome2 + "Sua média é: " + media2 + "\n");


    System.out.println("Digite seu nome: \n");
    nome3 = leitura.nextLine();
    System.out.println("Digite sua média: \n");
    media3 = leitura.nextLine();
    System.out.println("Seu nome é: " + nome3 + "Sua média é: " + media3 + "\n");


    System.out.println("Digite seu nome: ");
    nome4 = leitura.nextLine();
    System.out.println("Digite sua média: ");
    media4 = leitura.nextLine();
    System.out.println("Seu nome é: " + nome4 + "Sua média é: " + media4);


    System.out.println("Digite seu nome: ");
    nome5 = leitura.nextDouble();
    System.out.println("Digite sua média: ");
    media5 = leitura.nextLine();
    System.out.println("Seu nome é: " + nome5 + "Sua média é: " + media5);

    leitura.close(); {

    soma = soma + (media1 + media2 + media3 + media4 + media5) /5;
    System.out.println(soma);

        
}
 

}
