package Interface;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import java.awt.event.*;
import javax.swing.*;

public final class Interface{
	static JFrame frame;
	private Interface(){
		
	}

	// static methods
	protected static void Start() {
		frame = new JFrame("");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(null);//using no layout managers
		frame.setVisible(true);
    }

	protected static void addButton(JButton button, ActionListener action) {
		button.addActionListener(action);
		frame.add(button);
    }

	protected static void setTitle(String title) {
		frame.setTitle(title);
    }

	protected static void setVisible(boolean visibility) {
		frame.setVisible(visibility);
	}

    protected static void setSize(int width, int height) {
		frame.setSize(width, height);
    }

    protected static void destroy(JButton button) {
		frame.remove(button);
    }

    protected static void reload() {
		frame.repaint();
    }

    protected static void endFrame() {
		frame.dispose();
    }
}
