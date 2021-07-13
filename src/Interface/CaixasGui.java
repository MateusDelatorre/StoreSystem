package Interface;

import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import handler.ProdutoHandler;
public class CaixasGui extends GuiModel{


    protected void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Recebe Dinheiro"));
        buttons.get(0).setBounds(320, 290, 100, 40);
    }

    protected void Focus(){
        
    }

    private void AddButtons(){
        
    }

}
private void caixasButton(){
    addButton(buttons.get(1), new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Renda_da_loja.setRenda(Renda_daloja.getRenda + valor);
        }
    });
}