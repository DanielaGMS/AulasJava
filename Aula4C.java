//Aula4C

public class Aula4C {

    public static void main(String[] args) {
        int numeroNaoQuebrado = 2;
        double numeroQuebrado = 7.0/3.0; //4º Divisão
        System.out.printf("%2f \n", numeroQuebrado);

        //Char serve para apenas uma letra
        char  letra;

        //String aceita texto
        String texto;

        boolean teste;
        
        //Calculos

        // 1º Soma
        var resultado = numeroNaoQuebrado + numeroQuebrado;
        System.out.printf("%2f \n",resultado);
        
        //2º Subtração
        resultado = numeroNaoQuebrado - numeroQuebrado;
        System.out.printf("%2f \n",resultado);
        
        //3º Multiplicação
        resultado = numeroNaoQuebrado * numeroQuebrado;
        System.out.printf("%2f \n",resultado);

        letra = 'A';
        texto = "ABC - ABCdario";

        System.out.println(texto.charAt(4));
        System.out.println(texto + texto + texto + texto);

        teste = letra == 'A';
        System.out.println(teste);
        teste = resultado > 1;
        System.out.println(teste);
        teste = resultado < 10;
        System.out.println(teste);
        teste = resultado >= 5;
        System.out.println(teste);
    }   
}