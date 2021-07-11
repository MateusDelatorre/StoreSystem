import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;

import Classes.Produto;
import Interface.Login;
import Interface.Menu;
import handler.ProdutoHandler;

public class Main {
    public static void main(String[] args) {
        // int i = 10;
        // int j = 20;
        // int x = i + j;
        // System.out.println(x);
        // Login gui = new Login();
        ProdutoHandler.carregarProduto();
        Menu.getInstance();
    }
}
