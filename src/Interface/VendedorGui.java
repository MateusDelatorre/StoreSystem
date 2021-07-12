package Interface;

import java.util.ArrayList;

import javax.swing.JButton;

public class VendedorGui  extends GuiModel{

    private static VendedorGui instance;

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

    protected void Focus(){
        
    }

    private void StartLabels() {
        
    }

    private void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Login"));
        buttons.get(0).setBounds(320, 290, 100, 40);
        buttons.add(new JButton("Adicionar ao carrinho"));
        buttons.get(1).setBounds(451, 420, 200, 40);
        buttons.add(new JButton("Cadastrar"));
        buttons.get(2).setBounds(220, 290, 100, 40);
    }

    private void AddButtons(){
        
    }

}
