import Interface.Menu;
import handler.ProdutoHandler;
import handler.ClienteHandler;
import handler.GerenteHandler;
import handler.LojaHandler;

public class Main {
    /**
     * The program start here
     */
    public static void main(String[] args) {
        /*
        This next function call reads all data from the Banco folder and loads in the program.
        */
        LojaHandler.carregarPatrimonio();//Loads the ammount of money available for stock purchase
        ClienteHandler.carregarCliente();//Loads all the customers registered in the system
        ProdutoHandler.carregarProduto();//Loads all the products registered in the system
        GerenteHandler.carregarFuncionarios();//Loads all the employees registered in the system

        Menu.getInstance();//Start the gui menu
    }
}
