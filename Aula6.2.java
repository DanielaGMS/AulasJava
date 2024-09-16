import java.util.Scanner;

public class Aula6.1 {
    public static void main (String[] args) {
        String [] resposta = {

            "Manaus",
            "Tabatinga",

            "Maceió",
            "São Miguel dos Milagres",


            "Fortaleza",
            "Jericoacoara",


            "Palmas",
            "Araguaína",


            "Belo Horizonte",
            "Ouro Preto",


            "Balneário Camboriú",
            "Florianópolis",


            "Recife",
            "Olinda",


            "Goiânia",
            "Caldas Novas",

            "Rio de Janeiro",
            "Niteroí", 


            "São Paulo",
            "Tatuí"};


            Scanner leitura = new Scanner (System.in);
            System.out.println("Digite um estado:");
            

            switch(leitura.nextLine()) {
            case "Amazonas":
                System.out.println(resposta[1]+" ou "+ resposta[2]);
                break;
       

            case "Alagoas":
                System.out.println(resposta[3]+" ou "+ resposta[4]);
                break;


            case "Ceará":
                System.out.println(resposta[5]+" ou "+ resposta[6]);
                break;

            case "Tocantins":
                System.out.println(resposta[7]+" ou "+ resposta[8]);
                break;


            case "Minas Gerais":
                System.out.println(resposta[9]+" ou "+ resposta[10]);
                break;


            case "Santa Catarina":
                System.out.println(resposta[11]+" ou "+ resposta[12]);
                break;


            case "Pernambuco":
                System.out.println(resposta[13]+" ou "+ resposta[14]);
                break;


            case "Goiás":
                System.out.println(resposta[15]+" ou "+ resposta[16]);
                break;


            case "Rio de Janeiro":
                System.out.println(resposta[17]+" ou "+ resposta[18]);
                break;
            

            case "São Paulo":
                System.out.println(resposta[19]+" ou "+ resposta[20]);
                break;
            

            default:
                System.out.println("Estado inválido");
            }
    }
    
}
