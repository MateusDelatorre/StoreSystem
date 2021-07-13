import Interface.Menu;
import handler.ProdutoHandler;
import handler.ClienteHandler;
import handler.GerenteHandler;
import handler.LojaHandler;

public class Main {
    public static void main(String[] args) {
        LojaHandler.carregarPatrimonio();
        ClienteHandler.carregarCliente();
        ProdutoHandler.carregarProduto();
        GerenteHandler.carregarFuncionarios();
        Menu.getInstance();
    }
}
