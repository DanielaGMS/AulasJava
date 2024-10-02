public class RegistroProdutos {
        public static void main(String[] args) {
           Produto produto = new Produto();
           System.out.println(produto.produto);
           produto.calcular();
           System.out.println(produto.preço);
           System.out.println(produto.quantidade);
       }
   }
    
}
