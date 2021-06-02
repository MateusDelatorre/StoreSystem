package Interface;

import java.awt.event.*;
import javax.swing.*;

public class Login extends Interface{

    JButton auditores;
	JButton caixas;
	JButton cliente;
	JButton gerente;
	JButton vendedor;
    
    public Login(){
        super();
        super.setTitle("Login");
        super.setVisible(true);
        super.setSize(300, 350);
        auditoresButton();
        caixasButton();
        clienteButton();
        gerenteButton();
        vendedorButton();
    }

    private void auditoresButton(){
        this.auditores = new JButton("auditores");
		this.auditores.setBounds(100, 100, 100, 40);
        super.addButton(this.auditores, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy();
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

    private void destroy() {
        this.auditores.setEnabled(false);
    }
}
