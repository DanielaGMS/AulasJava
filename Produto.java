/* Desenvolva uma classe em Java chamada RegistroProdutos para armazenar informações de 10 produtos. 
Cada produto deve conter nome (String), preço (double) e quantidade (int). Implemente um método para calcular e retornar a quantidade total de produtos registrados.*/

import java.util.Scanner;

public class Produto {
    
    public String produto[];
    public double preço[];
    public int total, quantidade[];
    
    public void calcular(){
        System.out.println("O produto 1 é: " + produto[0] +  ", sua quantidade é " + quantidade[0] /n
        "O produto 2 é: " + produto[1] +  ", sua quantidade é " + quantidade[1]
        "O produto 3 é: " + produto[2] +  ", sua quantidade é " + quantidade[2]
        "O produto 4 é: " + produto[3] +  ", sua quantidade é " + quantidade[3]
        "O produto 5 é: " + produto[4] +  ", sua quantidade é " + quantidade[4]
        "O produto 6 é: " + produto[5] +  ", sua quantidade é " + quantidade[5]
        "O produto 7 é: " + produto[6] +  ", sua quantidade é " + quantidade[6]
        "O produto 8 é: " + produto[7] +  ", sua quantidade é " + quantidade[8]
        "O produto 9 é: " + produto[9] +  ", sua quantidade é " + quantidade[9]
        "O produto 10 é: " + produto[10] +  ", sua quantidade é " + quantidade[10]);
       
        total  = produto[0] + produto[1] + produto[2] + produto[3] + produto[4] + produto[5] + produto[6] + produto[7] + produto[8] + produto[9] + produto[10]

        System.out.println (" O total da quantidade de todos os produtos é: " + total);
    }

    public produto (){
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o nome do 1º produto: ");
        this.produto[0] = leitura.nextLine();


        System.out.println("Insira a quantidade do 1º produto: ");
        this.quantidade[0]  = leitura.nextInt();


        System.out.println("Insira o preço do 1º produto: ");
        this.preço[0] = leitura.nextDouble();







        System.out.println("Insira o nome do 2º produto: ");
        this.produto[1] = leitura.nextLine();


        System.out.println("Insira a quantidade do 2º produto: ");
        this.quantidade[1]  = leitura.nextInt();


        System.out.println("Insira o preço do 2º produto: ");
        this.preço[1] = leitura.nextDouble();







        System.out.println("Insira o nome do 3º produto: ");
        this.produto[2] = leitura.nextLine();


        System.out.println("Insira a quantidade do 3º produto: ");
        this.quantidade[2]  = leitura.nextInt();


        System.out.println("Insira o preço do 3º produto: ");
        this.preço[2] = leitura.nextDouble();







        System.out.println("Insira o nome do 4º produto: ");
        this.produto[3] = leitura.nextLine();


        System.out.println("Insira a quantidade do 4º produto: ");
        this.quantidade[3]  = leitura.nextInt();


        System.out.println("Insira o preço do 4º produto: ");
        this.preço[3] = leitura.nextDouble();






        System.out.println("Insira o nome do 5º produto: ");
        this.produto[4] = leitura.nextLine();


        System.out.println("Insira a quantidade do 5º produto: ");
        this.quantidade[4]  = leitura.nextInt();


        System.out.println("Insira o preço do 5º produto: ");
        this.preço[4] = leitura.nextDouble();






        System.out.println("Insira o nome do 6º produto: ");
        this.produto[5] = leitura.nextLine();


        System.out.println("Insira a quantidade do 6º produto: ");
        this.quantidade[5]  = leitura.nextInt();


        System.out.println("Insira o preço do 6º produto: ");
        this.preço[5] = leitura.nextDouble();







        System.out.println("Insira o nome do 7º produto: ");
        this.produto[6] = leitura.nextLine();


        System.out.println("Insira a quantidade do 7º produto: ");
        this.quantidade[6]  = leitura.nextInt();


        System.out.println("Insira o preço do 7º produto: ");
        this.preço[6] = leitura.nextDouble();






        System.out.println("Insira o nome do 8º produto: ");
        this.produto[7] = leitura.nextLine();


        System.out.println("Insira a quantidade do 8º produto: ");
        this.quantidade[7]  = leitura.nextInt();


        System.out.println("Insira o preço do 8º produto: ");
        this.preço[7] = leitura.nextDouble();







        System.out.println("Insira o nome do 9º produto: ");
        this.produto[8] = leitura.nextLine();


        System.out.println("Insira a quantidade do 9º produto: ");
        this.quantidade[8]  = leitura.nextInt();


        System.out.println("Insira o preço do 9º produto: ");
        this.preço[8] = leitura.nextDouble();








        System.out.println("Insira o nome do 10º produto: ");
        this.produto[9] = leitura.nextLine();


        System.out.println("Insira a quantidade do 10º produto: ");
        this.quantidade[9]  = leitura.nextInt();


        System.out.println("Insira o preço do 10º produto: ");
        this.preço[9] = leitura.nextDouble();




        
    }
}
