/* 3. Desenvolva um programa em Java que leia informações de 5 produtos: nome, quantidade e preço unitário. 
Calcule o final, retorne a soma total de todos os produtos e os nomes de todos os produtos registrados. */

import java.util.Scanner;
public class Ex3 {

public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int paoQ, boloQ, tapiocaQ, bicoitoQ, granolaQ;
    double paoP, boloP, tapiocaP, biscoitoP, granolaP, soma = 0.0;
    String pao, bolo, tapioca, biscoito, granola;


    System.out.println("Digite o nome do produto 1: ");
    pao = leia.nextLine();
    System.out.println("Digite a quantidade do produto 1: ");
    paoQ = leia.nextInt();
    System.out.println("Digite o preço do produto 1: ");
    paoP = leia.nextFloat();


    System.out.println("Digite o nome do produto 2: ");
    bolo = leia.nextLine();
    System.out.println("Digite a quantidade do produto 2: ");
    boloQ = leia.nextInt();
    System.out.println("Digite o preço do produto 2: ");
    boloP = leia.nextFloat();


    System.out.println("Digite o nome do produto 3: ");
    tapioca = leia.nextLine();
    System.out.println("Digite a quantidade do produto 3: ");
    tapiocaQ = leia.nextInt();
    System.out.println("Digite o preço do produto 3: ");
    tapiocaP = leia.nextFloat();


    System.out.println("Digite o nome do produto 4: ");
    biscoito = leia.nextLine();
    System.out.println("Digite a quantidade do produto 4: ");
    biscoitoQ = leia.nextInt();
    System.out.println("Digite o preço do produto 4: ");
    biscoitoP = leia.nextFloat();


    System.out.println("Digite o nome do produto 5: ");
    granola = leia.nextLine();
    System.out.println("Digite a quantidade do produto 5: ");
    granolaQ = leia.nextInt();
    System.out.println("Digite o preço do produto 5: ");
    granolaP = leia.nextFloat();

    

    soma = soma + (paoP + boloP + tapiocaP + biscoitoP + granolaP)/5;
    System.out.println(" Os produtos respectivamente são: " + pao + ", " + bolo + ", " + tapioca + ", " + biscoito + ", " + granola + 
    ". A soma total de todos os produtos é: R$" + soma);
    
}


}