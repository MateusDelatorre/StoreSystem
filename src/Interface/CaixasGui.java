package Interface;

import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Classes.Cliente;
import handler.CaixaHandler;
import handler.LojaHandler;

public class CaixasGui extends GuiModel{
    private static CaixasGui instance;
    private JLabel nome_do_cliente;
    private JLabel total_da_compra;
    private Cliente cliente;

    private CaixasGui(){
        StartFrame("Caixas");
        StartLabels();
        StartButtons();
    }

    public static CaixasGui getInstance() {
        if (instance == null) {
            instance = new CaixasGui();
        }
        return instance;
    }

    private void StartLabels() {
        nome_do_cliente = new JLabel("Login");
        total_da_compra = new JLabel("Senha");
    }

    protected void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Receber Dinheiro"));
        buttons.get(0).setBounds(320, 290, 200, 40);
    }

    protected void Focus(){
        setVisible(true);
        hasClientes();
    }

    private void hasClientes() {
        cliente = CaixaHandler.hasCliente();
        if(cliente == null){
            semClientes();
        }else{
            configuraBackButton();
            configLabels();
            receberButton();
        }
    }

    private void semClientes() {
        nome_do_cliente.setText("Sem clientes, volte mais tarde");
        nome_do_cliente.setBounds(300, 100, 200, 40);
        configuraBackButton();
        addComponent(nome_do_cliente);
    }

    private void configLabels() {
        nome_do_cliente.setText("Nome: " + cliente.getNome());
        nome_do_cliente.setBounds(300, 100, 100, 40);
        total_da_compra.setText("Valor" + String.valueOf(cliente.getTotalDaCompra()));
        total_da_compra.setBounds(300, 200, 100, 40);

        addComponent(nome_do_cliente);
        addComponent(total_da_compra);
    }

    private void receberButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LojaHandler.Stonks(cliente.getTotalDaCompra());
                cliente.setChekado(false);
                cliente.clearCarrinho();
                JOptionPane.showMessageDialog(null, "Venda realizada", "Stonks📈", JOptionPane.INFORMATION_MESSAGE);
                destroy(total_da_compra);
                destroy(buttons);
                StartButtons();
                hasClientes();
            }
        });
    }
}