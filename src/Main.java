import Interface.Login;
import Interface.Menu;
import Classes.Produto;
import handler.ProdutoHandler;
import Classes.Auditor;
import handler.AuditorHandler;
import handler.CaixaHandler;
import handler.ClienteHandler;
import Classes.Caixa;
import handler.GerenteHandler;
import Classes.Gerente;
import handler.VendedorHandler;
import Classes.Vendedor;

public class Main {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 20;
        // int x = i + j;
        // System.out.println(x);
        // Login gui = new Login();
        ClienteHandler.carregarCliente();
        ProdutoHandler.carregarProduto();
        Menu.getInstance();
    }
}
