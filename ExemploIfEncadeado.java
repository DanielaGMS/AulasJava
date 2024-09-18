
 public class ExemploIfEncadeado {

    /*  Onde fecha cada if, else if e else? */

    public static void main(String[] args) {
        // Alterar valor para testar
        int nota = 85; 


        if (nota == 100) { 
            System.out.println("Parabéns, nota máxima!");
        } 
        
        else if (nota >= 90) { 
            System.out.println("Você tirou um A."); 
        }

        else if (nota >= 85) { 
         System.out.println("Muito bom, quase um A!"); 
        }    
        
        else if (nota <= 80) { 
         System.out.println("Você tirou um B.");   
        } 

        else if (nota <= 70) { 
         System.out.println("Nota suficiente.");  
        }
       
        else if (nota <= 60) { 
         System.out.println("Você tirou um C."); 
        }

        else { 
            System.out.println("Nota insuficiente."); 
        } 
        
    } 
} 
    

