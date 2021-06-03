package Interface;

import java.awt.event.*;
import javax.swing.*;

public class Login {

    static JButton auditores;
	JButton caixas;
	JButton cliente;
	JButton gerente;
	JButton vendedor;

    public Login(){
        Interface.Start();
        TelaLogin();
    }

    protected static void TelaLogin(){
        Interface.setTitle("Login");
        Interface.setSize(300, 350);
        auditoresButton();
        // caixasButton();
        // clienteButton();
        // gerenteButton();
        // vendedorButton();
    }

    private static void auditoresButton(){
        if (auditores == null) {
            auditores = new JButton("auditores");
            auditores.setBounds(100, 100, 100, 40);
        }
        Interface.addButton(auditores, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
                AuditoresGui.TelaAuditores();
            }
        });
    }

    private void caixasButton(){
        this.caixas = new JButton("caixas");
		this.caixas.setBounds(100, 100, 100, 40);
    }
    private void clienteButton(){
        this.cliente = new JButton("cliente");
		this.cliente.setBounds(100, 150, 100, 40);

    }
    private void gerenteButton(){
        this.gerente = new JButton("gerente");
		this.gerente.setBounds(100, 200, 100, 40);

    }
    private void vendedorButton(){
        this.vendedor = new JButton("vendedor");
		this.vendedor.setBounds(100, 250, 100, 40);
    }

    private static void destroy() {
        Interface.destroy(auditores);
        // Interface.destroy(caixas);
        // Interface.destroy(cliente);
        // Interface.destroy(gerente);
        // Interface.destroy(vendedor);
        Interface.reload();
    }

}