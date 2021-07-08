package Interface;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

import handler.ProdutoHandler;

public class AuditoresGui extends GuiModel{
    
    private static AuditoresGui instance;
    String[][] data;

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
        buttons.add(new JButton("Teste"));
        buttons.get(0).setBounds(10, 10, 100, 40);
    }

    protected void Focus(){
        inicializaFrame("Auditores");
        setVisible(true);
        setSize(900, 800);
        StartButtons();
        addBackButton();
        String[] columnNames = { "codigo", "categoria", "descricao", "nome", "preco_compra", "preco_venda", "quantidade_em_estoque" };
        data = ProdutoHandler.toArray();
        //  = {
        //     { "codigo", "categoria", "descricao", "nome", "preco_compra", "preco_venda", "quantidade_em_estoque" },
        //     { "codigo", "categoria", "descricao", "nome", "preco_compra", "preco_venda", "quantidade_em_estoque" }
        // };

        System.out.println(data[1][6]);
        // super.addButton(buttons.get(0), new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
                
        //     }
        // });
        //reload();
        makeTable(data, columnNames);
        moveBack(0, 0);
    }
}
