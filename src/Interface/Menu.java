package Interface;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public final class Menu extends GuiModel{

    private static Menu instance;
    

    private Menu(){
        StartFrame("Menu");
        StartButtons();
        Focus();
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
        setVisible(true);
        auditoresButton();
        caixasButton();
        clienteButton();
        gerenteButton();
        vendedorButton();
        reload();
    }

    private void auditoresButton(){
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                AuditoresGui auditor = AuditoresGui.getInstance();
                auditor.Focus();
                endFrame();
            }
        });
    }

    private void caixasButton(){
        addButton(buttons.get(1), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
            }
        });
    }

    private void clienteButton(){
        addButton(buttons.get(2), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                ClienteGui cliente = ClienteGui.getInstance();
                cliente.Focus();
                endFrame();
            }
        });
    }

    private void gerenteButton(){
        addButton(buttons.get(3), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                GerenteGui.Focus();
            }
        });
    }

    private void vendedorButton(){
        addButton(buttons.get(4), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                VendedorGui vendedor = VendedorGui.getInstance();
                vendedor.Focus();
                endFrame();
            }
        });
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
}