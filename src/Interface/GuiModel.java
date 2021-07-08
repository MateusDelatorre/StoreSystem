package Interface;

import java.util.ArrayList;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public abstract class GuiModel {

  private JButton back;
  private JFrame frame;
  private JScrollPane scroll_pane;
  protected ArrayList<JButton> buttons;

  /*
  * Metodos para manipular o JFrame
  */

  /** Inicializa o JFrame definindo o seu titulo
  */
	protected void StartFrame(String tittle) {
    frame = new JFrame(tittle);
    scroll_pane = new JScrollPane();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(null);//using no layout managers
    frame.add(scroll_pane);
		frame.setVisible(true);
    frame.setSize(900, 800);
    back = new JButton("back");
    back.setBounds(100, 50, 100, 40);
  }

	protected void inicializaFrame(String tittle) {
    frame = new JFrame(tittle);
    scroll_pane = new JScrollPane();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    back = new JButton("back");
    back.setBounds(100, 50, 100, 40);
  }

  /** Adiciona um JButton ao JFrame e adiciona um ActionListener para realizar uma ou mais funções ao ser clicado
  */
	protected void addButton(JButton button, ActionListener action) {
		button.addActionListener(action);
		frame.add(button);
  }

  /** Troca o titulo do JFrame.
   * O JFrame precisa estar inicializado
   * @param title
  */
	protected void setTitle(String title) {
		frame.setTitle(title);
  }

  /**
   * Define a visibilidade do JFrame
   */
	protected void setVisible(boolean visibility) {
		frame.setVisible(visibility);
	}

  /**
   * Define o tamanho do JFrame.
   * Largura x Altura
   */
  protected void setSize(int width, int height) {
    frame.setSize(width, height);
  }

  /**
   * Retira o botão do JFrame.
   * O metodo não destoi de fato o botão, o botão vai continuar na memoria até o garbage colletor remover ele
   */
  protected void destroy(JButton button) {
    frame.remove(button);
    reload();
  }

  /**
   * Retira os botões do JFrame.
   * O metodo não destoi de fato os botões, os botões vão continuar na memoria até o garbage colletor remover eles
   */
  protected void destroy(ArrayList<JButton> buttons) {

    for (int i = 0; i < buttons.size(); i++) {
      frame.remove(buttons.get(i));
    }
    this.reload();
  }

  /**
   * Redesenha toda a interface.
   */
  protected void reload() {
    frame.repaint();
  }

  /**
   * Destroi todos os compenentes do JFrame e o proprio JFrame.
   * Dessa vez destroi de verdade, ou seja, toda a memoria referenciada ao JFrame sera apagada
   */
  protected void endFrame() {
    frame.dispose();
  }

  protected void addBackButton() {
    if (back == null) {
      back = new JButton("Back");
      back.setBounds(0, 0, 100, 40);
    }
    this.addButton(back, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        destroy(back);
        destroy(buttons);
        Menu.getInstance().Focus();
      }
    });
  }

  protected void moveBack(int x, int y){
    back.setLocation(x, y);
  }

  protected void makeTable(String[][] data, String[] columnNames){
    JTable table = new JTable(data, columnNames);
    table.setBounds(30, 40, 900, 600);
    
    scroll_pane.add(table);
    table.setFillsViewportHeight(true);
    scroll_pane.setLayout(new BoxLayout(scroll_pane, BoxLayout.PAGE_AXIS));
    table.setLocation(100, 100);
    //scroll_pane.setVisible(true);
    frame.add(scroll_pane);
    //frame.getContentPane().add(sp);
    reload();
  }

  protected abstract void Focus();
}
