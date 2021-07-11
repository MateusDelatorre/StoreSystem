import Classes.Produto;
import Interface.Login;
import handler.ProdutoHandler;
import Classes.Auditor;
import handler.AuditorHandler;

public class Main {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 20;
        // int x = i + j;
        // System.out.println(x);
        // Login gui = new Login();
        AuditorHandler.carregarAuditor();
        // Produto teste = ProdutoHandler.getproduto();
        // System.out.println(teste.toString());
        AuditorHandler.printaAuditor();
    }
}
