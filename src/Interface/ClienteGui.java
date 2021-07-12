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
    private int index;
    private JTextField input_login;
    private JLabel login;
    private JTextField input_senha;
    private JLabel senha;
    private JLabel cart_label;
    private JTextField input_senioriade;
    private ArrayList<Integer> cart;

    private ClienteGui(){
        cart = new ArrayList<Integer>();
        StartFrame("Caixas");
        StartLabels();
        StartButtons();
    }

    private void StartLabels() {
        login = new JLabel("Login");
        senha = new JLabel("Senha");
        cart_label = new JLabel("cart: ");
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
        buttons.get(0).setBounds(320, 290, 100, 40);
        buttons.add(new JButton("Adicionar ao carrinho"));
        buttons.get(1).setBounds(451, 420, 200, 40);
        buttons.add(new JButton("Cadastrar"));
        buttons.get(2).setBounds(220, 290, 100, 40);
    }

    protected void Focus() {
        // TODO Auto-generated method stub
        setVisible(true);
        configuraBackButton(input_login, login, input_senha, senha, cart_label, input_senioriade);
        Login();
    }

    private void Login() {
        login.setText("Login");
        login.setBounds(300, 100, 100, 40);
        senha.setText("Senha");
        senha.setBounds(300, 200, 100, 40);

        input_login = new JTextField();
        input_login.setBounds(220, 140, 200, 40);
        input_senha = new JTextField();
        input_senha.setBounds(220, 240, 200, 40);
        addComponents();
    }

    private void addComponents() {
        addComponent(input_login);
        addComponent(input_senha);
        addComponent(login);
        addComponent(senha);
        LoginButton();
        cadastrarButton();
    }

    private void cadastrarButton() {
        addButton(buttons.get(2), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                destroy(input_login, input_senha, login, senha);
                reload();
                cadastroScreen();
            }
        });
    }

    private void cadastroScreen(){
        login.setText("Name");
        senha.setText("cpf");
        cart_label.setText("Senioriade");
        cart_label.setBounds(290, 300, 100, 40);
        input_senioriade = new JTextField();
        input_senioriade.setBounds(220, 340, 200, 40);
        
        addComponent(input_login);
        addComponent(input_senha);
        addComponent(login);
        addComponent(senha);
        addComponent(cart_label);
        addComponent(input_senioriade);
        buttons.get(2).setBounds(220, 400, 100, 40);
        buttons.get(0).setBounds(320, 400, 100, 40);
        fazerCadastroButton();
        goToLoginButton();
    }

    private void goToLoginButton() {
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                destroy(input_login, input_senha, login, senha, cart_label, input_senioriade);
                remakeLogin();
                reload();
            }
        });
    }

    private void remakeLogin() {
        login.setText("Login");
        senha.setText("Senha");
        buttons.get(2).setBounds(220, 290, 100, 40);
        buttons.get(0).setBounds(320, 290, 100, 40);
        addComponents();
    }

    private void fazerCadastroButton() {
        addButton(buttons.get(2), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClienteHandler.cadastrarCliente(input_login.getText(), input_senha.getText(), input_senioriade.getText());
                destroy(buttons);
                destroy(input_login, input_senha, login, senha, cart_label, input_senioriade);
                remakeLogin();
                reload();
            }
        });
    }

    private void LoginButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            // public void actionPerformed(ActionEvent e) {

            //     destroy(buttons);
            //     destroy(input_login, input_senha, login, senha);
            //     id = 0;
            //     reload();
            //     cartScreen();
            // }
            public void actionPerformed(ActionEvent e) {
                var input = input_login.getText();

                if(input == null || input.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    index = ClienteHandler.getClienteByLogin(input);
                    if (index <= -1) {
                        JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                    }
                    destroy(buttons);
                    destroy(input_login, input_senha, login, senha);
                    reload();
                    cartScreen();
                }
            }
        });
    }

    private void cartScreen(){
        ListProdutos();
        inputField();
        cartButton();
    }

    private void inputField(){
        login.setText("Digite o codigo do produto:");
        login.setBounds(0, 390, 200, 30);
        input_login = new JTextField();
        input_login.setBounds(151, 390, 300, 30);

        senha.setText("Digite a quantidade:");
        senha.setBounds(20, 420, 200, 30);
        input_senha = new JTextField();
        input_senha.setBounds(151, 420, 300, 30);

        cart_label.setText("cart: " + String.valueOf(cart.size()));
        cart_label.setBounds(400, 0, 200, 30);
        
        addComponent(input_login);
        addComponent(input_senha);
        addComponent(login);
        addComponent(senha);
        addComponent(cart_label);
    }

    private void cartButton(){
        addButton(buttons.get(1), new ActionListener() {
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
                        ClienteHandler.addCart(index, ProdutoHandler.getProdutoByCodigo(codigo));
                        cart.add(Integer.parseInt(input));
                    }
                    cart_label.setText("cart: " + String.valueOf(cart.size()));
                    reload();
                }
            }
        });
    }
}
