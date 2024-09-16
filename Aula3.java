import java.util.Scanner;
public class Aula3{
    //Faça um sistema em Java para a leitura dos nomes de 5 funcionários e em seguida mostre os nomes digitados
    public static void main(String[] arg){
            Scanner FUN = new Scanner(System.in);

            /* Aqui pedimos para que o sistema imprima a frase "Digite o nome completo do Xº funcionário: " para que assim,
            o usuário insira as informações solicitadas. Logo após o sistema lerá a variável inserida e guardará o algoritmo digitado*/
            
            System.out.println("Digite o nome completo do 1º funcionário: \n");
            /* String lê toda variável tipo texto, já nextLine lê o próximo valor de texto e está associado ao Scanner*/
            String nome1 = FUN.nextLine();
        
            /* Variável 2 */
            System.out.println("Digite o nome completo do 2º funcionário: \n");
            String nome2 = FUN.nextLine();

            /* Variável 3 */
            System.out.println("Digite o nome completo do 3º funcionário: \n");
            String nome3 = FUN.nextLine();

            /* Variável 4 */
            System.out.println("Digite o nome completo do 4º funcionário: \n");
            String nome4 = FUN.nextLine();

            /* Variável 5 */
            System.out.println("Digite o nome completo do 5º funcionário: \n");
            String nome5 = FUN.nextLine();

            /* Aqui o sistema mostrará os nomes guardados e imprimirá na tela */
            System.out.println("Os nomes respectivamente são: " + nome1 + " " +
            nome2 + " " +
            nome3 + " " +
            nome4 + " " +
            nome5);

            FUN.close();
            
    }
    
}
