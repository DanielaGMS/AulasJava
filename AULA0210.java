/* Implemente uma classe em Java denominada Pessoa com os atributos nome (String), sobrenome (String), 
idade (int) e sexo (char). Inclua um método para calcular e retornar a idade da pessoa.*/

import java.util.Scanner;


public class AULA0210 {
    
    public String nome;
    public String sobrenome;
    public int idade;
    public String sexo;
    public void calcular(){
        System.out.println("Seu nome é: " + nome + " " + sobrenome + ". E sua idade é: " + idade);
    }

    public AULA0210 (){

        System.out.println("Insira seu nome: ");
        this.nome = leitura.nextLine();


        System.out.println("Insira seu sobrenome: ");
        this.sobrenome  = leitura.nextLine();


        System.out.println("Insira sua idade: ");
        this.idade = leitura.Int();


        System.out.println("Insira seu sexo: ");
        this.sexo = leitura.nextLine();

    
    }
}

