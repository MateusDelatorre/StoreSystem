package Interface;

import java.util.ArrayList;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public abstract class GuiModel {

  private JButton back;
  private JFrame frame;
  protected ArrayList<JButton> buttons;
  private JTable table;
  private JScrollPane scrollPane;
  private final String[] columnNames = { "codigo", "categoria", "descricao", "nome", "preco_compra", "preco_venda", "quantidade_em_estoque" };

  /*
  * Metodos para manipular o JFrame
  */

  /** Inicializa o JFrame definindo o seu titulo
  */
	protected void StartFrame(String tittle) {
    frame = new JFrame(tittle);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLayout(null);//using no layout managers
		frame.setVisible(true);
    frame.setSize(850, 500);
  }

	protected void inicializaFrame(String tittle, String[][] data, String[] columns) {
    frame = new JFrame(tittle);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(850, 500);
    frame.setVisible(true);
  }

  /** Adiciona um JButton ao JFrame e adiciona um ActionListener para realizar uma ou mais funções ao ser clicado
  */
	protected void addButton(JButton button, ActionListener action) {
		button.addActionListener(action);
		frame.add(button);
  }

	protected void addLabel(JLabel label) {
		frame.add(label);
  }

	protected void addComponent(JComponent component) {
		frame.add(component);
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
    for( JButton currentButton: buttons ) {
      for( ActionListener al : currentButton.getActionListeners() ) {
        currentButton.removeActionListener( al );
      }
      frame.remove(currentButton);
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

  protected void getBackButton(){
    back = new JButton("Back");
  }

  protected void inicializaBackButton(){
    back = new JButton("Back");
  }
  
  protected boolean isBackButtonNull(){
    return back == null;
  }

  protected void posicionaBackButton(int x, int y, int width, int height){
    back.setBounds(x, y, width, height);
  }

  protected void destroy(JComponent component) {
    frame.remove(component);
    reload();
  }

  protected void destroy(JComponent... components) {
    for (JComponent component : components) {
      if (component != null) {
        frame.remove(component);
      }
    }
    reload();
  }

  protected void configuraBackButton(JComponent... components){
    if (isBackButtonNull()) {
      inicializaBackButton();
      posicionaBackButton(0, 0, 100, 40);
    }
    addBackButton(components);
  }

  protected void addBackButton(JComponent... components) {
    this.addButton(back, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        destroy(back);
        destroy(buttons);
        destroy(table, scrollPane);
        destroy(components);
        endFrame();
        Menu.getInstance().Focus();
      }
    });
  }

  protected void moveBack(int x, int y){
    back.setLocation(x, y);
  }

  protected void makeTable(String[][] data, String[] columns){
    this.table = new JTable(data, columns);
    this.scrollPane = new JScrollPane(table);
    table.setFillsViewportHeight(true);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().add(scrollPane);
    scrollPane.setBounds(0, 40, 800, 350);
  }

  protected void addJOptionPane(String mensage, String Title){
    
  }

  protected String[] getColumnNames() {
    return columnNames;
}

  protected abstract void Focus();
}
