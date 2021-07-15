package Interface;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * This class is a guide to help the navigation between screens
 */
public final class Menu extends GuiModel{

    private static Menu instance;//Store the only instance of this class

    private Menu(){
        StartFrame("Menu");//Start the JFrame with the title Menu
        StartButtons();//call the method below
        Focus();//Call the method below the method below kkkk
    }

    /**
     * Start a instance of the buttons that will be used and add them to the arrayList
     */
    private void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("auditores"));
        buttons.add(new JButton("caixas"));
        buttons.add(new JButton("cliente"));
        buttons.add(new JButton("gerente"));
        buttons.add(new JButton("vendedor"));

        //Loop the buttons to and position them
        for (int i = 0, j = 100; i < buttons.size(); i++, j += 50) {
            buttons.get(i).setBounds(100, j, 100, 40);
        }
    }

    /**
     * This is the method that will be called every time you want this gui to appear or come into "focus"
     */
    protected void Focus(){
        setVisible(true);//Sets the visibility of the JFrame to true
        auditoresButton();
        caixasButton();
        clienteButton();
        gerenteButton();
        vendedorButton();
        reload();//repaint the JFrame just to be sure kkkkk
    }

    /**
     * Adds the button that, leads to the Auditores gui, to the JFrame
     */
    private void auditoresButton(){
        //calls the method from the father class with the first button from the buttons array(esqueci de falar mas o buttons também é da classe pai) and a new ActionListener that will define what happens when someone click him.
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

    /**
     * Adds the button that, leads to the Caixas gui, to the JFrame
     */
    private void caixasButton(){
        addButton(buttons.get(1), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                CaixasGui caixas = CaixasGui.getInstance();
                caixas.Focus();
                endFrame();
            }
        });
    }

    /**
     * Adds the button that, leads to the Cliente gui, to the JFrame
     */
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

    /**
     * Adds the button that, leads to the Gerente gui, to the JFrame
     */
    private void gerenteButton(){
        addButton(buttons.get(3), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                GerenteGui gerente = GerenteGui.getInstance();
                gerente.Focus();
                endFrame();
            }
        });
    }

    /**
     * Adds the button that, leads to the Vendedor gui, to the JFrame
     */
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

    /**
     * Return the current instance of the class, if there is no instance it will instantiate a new one
     */
    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
}