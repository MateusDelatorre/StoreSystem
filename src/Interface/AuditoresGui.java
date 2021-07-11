package Interface;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import handler.ProdutoHandler;

public class AuditoresGui extends GuiModel{
    
    private static AuditoresGui instance;
    private final String[] columnNames = { "codigo", "categoria", "descricao", "nome", "preco_compra", "preco_venda", "quantidade_em_estoque" };
    String[][] data;
    private JTextField input_codigo;
    private JLabel label_codigo;
    private JTextField input_quantidade;
    private JLabel label_quantidade;
    

	private AuditoresGui(){
        
	}

    protected static AuditoresGui getInstance() {
        if (instance == null) {
            instance = new AuditoresGui();
        }
        return instance;
    }

    private void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Repor"));
        buttons.get(0).setBounds(451, 420, 100, 40);
    }

    protected void Focus(){
        data = ProdutoHandler.toArray();
        inicializaFrame("Auditores", data, columnNames);
        makeTable(data, columnNames);
        StartButtons();
        inputField();
        reporButton();
        configuraBackButton();
    }

    private void inputField(){
        label_codigo = new JLabel("Digite o codigo do produto:");
        label_codigo.setBounds(0, 390, 200, 30);
        input_codigo = new JTextField();
        input_codigo.setBounds(151, 390, 300, 30);

        label_quantidade = new JLabel("Digite a quantidade:");
        label_quantidade.setBounds(20, 420, 200, 30);
        input_quantidade = new JTextField();
        input_quantidade.setBounds(151, 420, 300, 30);
        
        addComponent(input_codigo);
        addComponent(input_quantidade);
        addComponent(label_codigo);
        addComponent(label_quantidade);
    }

    private void reporButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var input = input_codigo.getText();
                var quantidade = input_quantidade.getText();

                if(input == null || input.equals("") || quantidade == null || quantidade.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    var codigo = ProdutoHandler.reporProduto(Integer.parseInt(input), Integer.parseInt(quantidade));
                    if (codigo != 1) {
                        JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Tudo certo, para ver o resultao recarregue a pagina", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    reload();
                }
            }
        });
    }
}
