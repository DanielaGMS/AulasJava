import java.util.Scanner;

public class Aula6B { 
    public static void main (String[] args) {
        String [] resposta = {

            // Amazonas
            "Manaus",
            "Tabatinga",

            // Alagoas
            "Maceió",
            "São Miguel dos Milagres",

            // Ceará
            "Fortaleza",
            "Jericoacoara",

            // Tocantins
            "Palmas",
            "Araguaína",

            // Minas Gerais
            "Belo Horizonte",
            "Ouro Preto",

            // Santa Catarina
            "Balneário Camboriú",
            "Florianópolis",

            // Pernambuco
            "Recife",
            "Olinda",

            // Goiás
            "Goiânia",
            "Caldas Novas",

            // Rio de Janeiro
            "Rio de Janeiro",
            "Niteroí", 

            // São Paulo
            "São Paulo",
            "Tatuí"};


            Scanner leitura = new Scanner (System.in);
            System.out.println("Digite um estado:");
            

            switch(leitura.nextLine()) {
            case "Amazonas":
                System.out.println(resposta[0]+" ou "+ resposta[1]);
                break;
       

            case "Alagoas":
                System.out.println(resposta[2]+" ou "+ resposta[3]);
                break;


            case "Ceará":
                System.out.println(resposta[4]+" ou "+ resposta[5]);
                break;


            case "Tocantins":
                System.out.println(resposta[6]+" ou "+ resposta[7]);
                break;


            case "Minas Gerais":
                System.out.println(resposta[8]+" ou "+ resposta[9]);
                break;


            case "Santa Catarina":
                System.out.println(resposta[10]+" ou "+ resposta[11]);
                break;


            case "Pernambuco":
                System.out.println(resposta[12]+" ou "+ resposta[13]);
                break;


            case "Goiás":
                System.out.println(resposta[14]+" ou "+ resposta[15]);
                break;


            case "Rio de Janeiro":
                System.out.println(resposta[16]+" ou "+ resposta[17]);
                break;
            

            case "São Paulo":
                System.out.println(resposta[18]+" ou "+ resposta[19]);
                break;
            default:
                System.out.println("Estado inválido");
                break; 
        }

         leitura.close();
       
            }
        
        
       
         
          


        }

}

