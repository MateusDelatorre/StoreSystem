package Interface;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.*;
import javax.swing.*;


public class AuditoresGui extends Interface{
    JFrame AuditoresFrame;
	JButton back;
	// JButton caixas;
	// JButton cliente;
	// JButton gerente;
	// JButton vendedor;
	boolean visibility;
    
	public AuditoresGui(){

	}

	public void backButton() {
		back = new JButton("auditores");
		back.setBounds(100, 50, 100, 40);
		super.addButton(back, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AuditoresFrame.dispose();
                
            }
        });
    }
}
