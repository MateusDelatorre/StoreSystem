package Interface;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.*;
import javax.swing.*;

public class Interface{
	JFrame frame;
	
    
	protected Interface(){
		frame = new JFrame("");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(false);

		
	}

	protected void addButton(JButton button, ActionListener action) {
		button.addActionListener(action);
		frame.add(button);
    }

	protected void setTitle(String title) {
		frame.setTitle(title);
    }

	protected void setVisible(boolean visibility) {
		frame.setVisible(visibility);
	}

    protected void setSize(int width, int height) {
		frame.setSize(width, height);
    }

}
