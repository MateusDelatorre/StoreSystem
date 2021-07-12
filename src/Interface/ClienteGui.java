package Interface;

import java.awt.event.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import handler.ClienteHandler;
import handler.ProdutoHandler;

public class ClienteGui extends GuiModel{

    private static ClienteGui instance;
    private int id;
    private JTextField input_login;
    private JLabel login;
    private JTextField input_senha;
    private JLabel senha;
    private JLabel cart_label;
    ArrayList<Integer> cart;

    private ClienteGui(){
        cart = new ArrayList<Integer>();
        StartFrame("Caixas");
        StartButtons();
    }

    public static ClienteGui getInstance() {
        if (instance == null) {
            instance = new ClienteGui();
        }
        return instance;
    }

    protected void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Login"));
        buttons.get(0).setBounds(451, 420, 100, 40);
        buttons.add(new JButton("Adicionar ao carrinho"));
        buttons.get(1).setBounds(451, 420, 150, 40);
    }

    
    protected void Focus() {
        // TODO Auto-generated method stub
        configuraBackButton();
        Login();
    }

    private void Login() {
        login = new JLabel("Login");
        login.setBounds(300, 150, 100, 40);
        input_login = new JTextField();
        input_login.setBounds(220, 200, 200, 40);

        senha = new JLabel("Senha");
        senha.setBounds(300, 250, 100, 40);
        input_senha = new JTextField();
        input_senha.setBounds(220, 300, 200, 40);
        
        addComponent(input_login);
        addComponent(input_senha);
        addComponent(login);
        addComponent(senha);
        LoginButton();
    }

    private void LoginButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                destroy(buttons);
                destroy(input_login, input_senha, login, senha);
                id = 0;
                reload();
                cartScreen();
            }
            // public void actionPerformed(ActionEvent e) {
            //     var input = input_login.getText();

            //     if(input == null || input.equals("")){
            //         JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
            //     }else{
            //         var codigo = ClienteHandler.getClienteByLogin(input);
            //         if (codigo <= -1) {
            //             JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
            //         }
            //         destroy(buttons);
            //         destroy(input_login, input_senha, login, senha);
            //         reload();
            //         cartScreen();
            //     }
            // }
        });
    }

    private void cartScreen(){
        makeTable(ProdutoHandler.getData(), getColumnNames());
        inputField();
        cartButton();
    }

    private void inputField(){
        login = new JLabel("Digite o codigo do produto:");
        login.setBounds(0, 390, 200, 30);
        input_login = new JTextField();
        input_login.setBounds(151, 390, 300, 30);

        senha = new JLabel("Digite a quantidade:");
        senha.setBounds(20, 420, 200, 30);
        input_senha = new JTextField();
        input_senha.setBounds(151, 420, 300, 30);

        cart_label = new JLabel("cart: " + String.valueOf(cart.size()));
        cart_label.setBounds(400, 0, 200, 30);
        
        addComponent(input_login);
        addComponent(input_senha);
        addComponent(login);
        addComponent(senha);
        addComponent(cart_label);
    }

    private void cartButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var input = input_login.getText();
                var quantidade = input_senha.getText();

                if(input == null || input.equals("") || quantidade == null || quantidade.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    var codigo = ProdutoHandler.isProduto(Integer.parseInt(input));
                    if (codigo != 1) {
                        JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                    }else{
                        cart.add(Integer.parseInt(input));
                    }
                    cart_label.setText("cart: " + String.valueOf(cart.size()));
                    reload();
                }
            }
        });
    }
}
