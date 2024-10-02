public class rjava {

    
 /* A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. 
 Faça um algoritmo para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever: 
 
 a. Média de salário da população;


 b. Média do número de filhos;


 c. Maior salário dos habitantes;


 d. Percentual de pessoas com salário menor que R$ 150,00;


 Obs.: O final das leituras dos dados se dará com a entrada de um “salário negativo”. */ 


 import java.util.Scanner;


 public static void main(String[] args) {


    System.out.println("Prefeitura de Bonito! /n");
    Scanner leitura = new Scanner (System.in);


    int mediaFilhos, filho1, filho2, filho3;

    float somaSalario, percentualSalario, mediaSalario, salario1, salario2, salario3;

    String habitante;
  


    System.out.println(" Digite seu nome: ");
    habitante = leitura.nextLine();
    System.out.println(" Digite a quantidade de filhos que possui: /n");
    filho1 = leitura.nextInt(); 
    System.out.println(" Digite o salário /n");
    salario1 = leitura.nextFloat();



    System.out.println(" Digite seu nome: /n");
    habitante = leitura.nextLine(); 
    System.out.println(" Digite a quantidade de filhos que possui: /n");
    filho2 =leitura.nextInt(); 
    System.out.println(" Digite o salário /n");
    salario2 = leitura.nextFloat(); 



    System.out.println(" Digite seu nome: /n");
    habitante = leitura.nextLine(); 
    System.out.println(" Digite a quantidade de filhos que possui: /n");
    filho3 = leitura.nextInt(); 
    System.out.println(" Digite o salário /n");
    salario3= leitura.nextFloat(); 

 
    somaSalario = salario1 + salario2 + salario3;

    mediaSalario = somaSalario /3;

    mediaFilhos = (filho1 + filho2 + filho3) /3;

    percentualSalario = (somaSalario / 3) * 100;
    

    
  if (salario1 > salario2) {
    System.out.println(" Seu salário é o maior da cidade. Pague mais impostos! Comprando, o 1º salário inserido é o maior que o 2º. /n");
    
  }

  else if (salario2 > salario3) {
    System.out.println(" Seu salário é o maior da cidade. Pague mais impostos! Comprando, o 2º salário inserido é o maior que o 3º./n");
    
  }
  else if (salario3 > salario1) {
    System.out.println(" Seu salário é o maior da cidade. Pague mais impostos! Comprando, o 3º salário inserido é o maior que o 1º./n");
    
  }
  else if (salario1 > salario3) {
    System.out.println(" Seu salário é o maior da cidade. Pague mais impostos! Comprando, o 1º salário inserido é o maior que o 3º. /n");
    
  }
  else if (salario3 > salario2) {
    System.out.println(" Seu salário é o maior da cidade. Pague mais impostos! Comprando, o 3º salário inserido é o maior que o 2º. /n");

  }
  else {
    System.out.println(" Seu salário é o menor da cidade. Pare de pagar impostos, há pessoas pagando por você! /n");

  }

  















 



    
}
