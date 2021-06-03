package Interface;

import java.awt.event.*;
import javax.swing.*;

public class AuditoresGui {
	static JButton back;
	boolean visibility;
    
	public AuditoresGui(){

	}

	public static void TelaAuditores(){
		backButton();
	}

	public static void backButton() {
		if (back == null) {
            back = new JButton("back");
			back.setBounds(100, 50, 100, 40);
        }
		
		Interface.addButton(back, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				destroy();
                Login.TelaLogin();
            }
        });
    }

	private static void destroy() {
        Interface.destroy(back);
        // Interface.destroy(caixas);
        // Interface.destroy(cliente);
        // Interface.destroy(gerente);
        // Interface.destroy(vendedor);
        Interface.reload();
    }
}
