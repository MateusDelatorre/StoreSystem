package Interface;

import java.awt.event.*;
import javax.swing.*;

public class Login {

    static JButton auditores;
	static JButton caixas;
	static JButton cliente;
	static JButton gerente;
	static JButton vendedor;

    public Login(){
        Interface.Start();
        StartButtons();
        TelaLogin();
    }

    protected static void TelaLogin(){
        Interface.setTitle("Login");
        Interface.setSize(300, 350);
        
        auditoresButton();
        caixasButton();
        clienteButton();
        gerenteButton();
        vendedorButton();
    }

    private void StartButtons(){
        auditores = new JButton("auditores");
        auditores.setBounds(100, 100, 100, 40);
        caixas = new JButton("caixas");
        caixas.setBounds(100, 100, 100, 40);
        cliente = new JButton("cliente");
        cliente.setBounds(100, 150, 100, 40);
        gerente = new JButton("gerente");
		gerente.setBounds(100, 200, 100, 40);
        vendedor = new JButton("vendedor");
		vendedor.setBounds(100, 250, 100, 40);
    }

    private static void auditoresButton(){
        Interface.addButton(auditores, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                AuditoresGui.TelaAuditores();
            }
        });
    }

    private static void caixasButton(){
        Interface.addButton(caixas, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                CaixasGui.TelaCaixas();
            }
        });
    }
    private static void clienteButton(){
        Interface.addButton(cliente, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                ClienteGui.TelaCliente();
            }
        });


    }
    private static void gerenteButton(){
        Interface.addButton(gerente, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                GerenteGui.TelaGerente();
            }
        });


    }
    private static void vendedorButton(){
        Interface.addButton(vendedor, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                VendedorGui.TelaVendedor();
            }
        });
    }

    private static void destroy() {
        Interface.destroy(auditores);
        Interface.destroy(caixas);
        Interface.destroy(cliente);
        Interface.destroy(gerente);
        Interface.destroy(vendedor);
        Interface.reload();
    }

}