import Interface.Login;
import Classes.Produto;
import handler.ProdutoHandler;
import Classes.Auditor;
import handler.AuditorHandler;
import handler.CaixaHandler;
import Classes.Caixa;
import handler.GerenteHandler;
import Classes.Gerente;

public class Main {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 20;
        // int x = i + j;
        // System.out.println(x);
        // Login gui = new Login();
        GerenteHandler.carregarGerente();
        // Produto teste = ProdutoHandler.getproduto();
        // System.out.println(teste.toString());
        GerenteHandler.printaGerente();
    }
}
