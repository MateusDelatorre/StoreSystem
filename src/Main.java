import Classes.Produto;
import Interface.Login;
import handler.ProdutoHandler;

public class Main {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 20;
        // int x = i + j;
        // System.out.println(x);
        // Login gui = new Login();
        ProdutoHandler.carregarProduto();
        // Produto teste = ProdutoHandler.getproduto();
        // System.out.println(teste.toString());
        ProdutoHandler.printaProdutos();
        
    }
}
