package Interface;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public final class Login extends GuiModel{

    private static Login instance;
    private ArrayList<JButton> buttons;

    private Login(){
        StartFrame("Menu");
        StartButtons();
        Focus();
    }

    public void Start(){
        
    }

    private void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("auditores"));
        buttons.add(new JButton("caixas"));
        buttons.add(new JButton("cliente"));
        buttons.add(new JButton("gerente"));
        buttons.add(new JButton("vendedor"));

        for (int i = 0, j = 100; i < buttons.size(); i++, j += 50) {
            buttons.get(i).setBounds(100, j, 100, 40);
        }
    }

    protected void Focus(){
        
    }

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }
}