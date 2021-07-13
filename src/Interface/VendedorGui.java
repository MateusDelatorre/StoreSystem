package Interface;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import handler.ClienteHandler;

public class VendedorGui  extends GuiModel{

    private static VendedorGui instance;
    private JLabel nome;
    private JTextField input_nome;

    private VendedorGui(){
        StartFrame("Vendedor");
        StartLabels();
        StartButtons();
    }

    public static VendedorGui getInstance() {
        if (instance == null) {
            instance = new VendedorGui();
        }
        return instance;
    }

    private void StartLabels() {
        nome = new JLabel("Login");
    }

    private void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Checar"));
        buttons.get(0).setBounds(451, 420, 100, 40);
        buttons.add(new JButton("Adicionar ao carrinho"));
    }

    protected void Focus(){
        ListarClientesWithCart();
        configuraBackButton();
        chekarButton();
        inputField();
    }

    private void inputField(){
        nome.setText("Digite o nome do cliente:");
        nome.setBounds(0, 390, 200, 30);
        input_nome = new JTextField();
        input_nome.setBounds(151, 390, 300, 30);
        
        addComponent(nome);
        addComponent(input_nome);
    }

    private void chekarButton() {
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var input = input_nome.getText();

                if(input == null || input.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    resolverAsDependencias(input);
                }
            }
        });
    }

    private void resolverAsDependencias(String NomeDoCliente){
        ClienteHandler.checarCliente(NomeDoCliente);
    }

}
