
import java.util.Scanner;
import java.time.LocalDateTime;

public class FabricaMoto {
    
    public String marca;
    public String cor;
    public int ano;
    public String nome;
    public void andar(){
        System.out. println("Sua moto está andando!");
    }

    public FabricaMoto(){
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite a marca da moto.");
        this.nome = leitura.nextLine();

        System.out.println("Digite a cor da moto");
        this.cor = leitura.nextLine();


        while(true){

            try{
                Scanner temp = new Scanner (System.in);
                System.out.println("Digite o ano da moto");
                this.ano = temp.nextInt();
                temp.close();
                break;
            }

            catch (Exception e){
                System.out.println("Digite um valor válido");
                continue;
            }

        }
        
    }
}

