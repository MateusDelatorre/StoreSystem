package Interface;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;
import handler.GerenteHandler;
import handler.LojaHandler;

public class GerenteGui extends GuiModel{

    private static GerenteGui instance;
    private JLabel label_tipo;
    private JLabel label_nome;
    private JLabel label_cpf;
    private JLabel label_salario;
    private JTextField input_tipo;
    private JTextField input_nome;
    private JTextField input_cpf;
    private JTextField input_salario;
    private String[] colunas = {"Nome", "CPF", "Sálario"};

    private GerenteGui(){
        StartFrame("Caixas");
        StartLabels();
        StartButtons();
    }

    private void StartLabels() {
        label_tipo = new JLabel("");
        label_nome = new JLabel("");
        label_cpf = new JLabel("");
        label_salario = new JLabel("");
    }

    public static GerenteGui getInstance() {
        if (instance == null) {
            instance = new GerenteGui();
        }
        return instance;
    }

    protected  void StartButtons(){
        buttons = new ArrayList<JButton>();
        buttons.add(new JButton("Contratar"));
        buttons.get(0).setBounds(320, 290, 100, 40);
        buttons.add(new JButton("Demitir"));
        buttons.get(1).setBounds(220, 290, 100, 40);
        buttons.add(new JButton("Demitir"));
        buttons.get(2).setBounds(451, 420, 100, 40);
        buttons.add(new JButton("Contratar"));
        buttons.get(3).setBounds(320, 400, 100, 40);
        buttons.add(new JButton("Checar Lucros"));
        buttons.get(4).setBounds(700, 0, 130, 40);
    }

    protected  void Focus(){
        setVisible(true);
        demitirButton();
        contratarButton();
        chekarButton();
        configuraBackButton(label_tipo, label_nome, label_cpf, label_salario, input_tipo, input_nome, input_cpf, input_salario);
    }

    private void chekarButton() {
        addButton(buttons.get(4), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var patrimonio = String.valueOf(LojaHandler.getPatrimonio());
                JOptionPane.showMessageDialog(null, "Patrimonio: R$ " + patrimonio, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void contratarButton() {
        addButton(buttons.get(0), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                contratarScreen();
            }
        });
    }

    private void contratarScreen() {
        label_tipo.setText("Tipo de funcionario");
        label_tipo.setBounds(290, 10, 100, 40);
        label_nome.setText("Name");
        label_nome.setBounds(300, 100, 100, 40);
        label_cpf.setText("cpf");
        label_cpf.setBounds(300, 200, 100, 40);
        label_salario.setText("Salario");
        label_salario.setBounds(295, 300, 100, 40);
        
        input_tipo = new JTextField();
        input_tipo.setBounds(220, 40, 200, 40);

        input_nome = new JTextField();
        input_nome.setBounds(220, 140, 200, 40);

        input_cpf = new JTextField();
        input_cpf.setBounds(220, 240, 200, 40);

        input_salario = new JTextField();
        input_salario.setBounds(220, 340, 200, 40);
        
        addComponent(label_tipo);
        addComponent(label_nome);
        addComponent(label_cpf);
        addComponent(label_salario);
        addComponent(input_tipo);
        addComponent(input_nome);
        addComponent(input_cpf);
        addComponent(input_salario);
        contratarFuncionarioButton();
    }

    private void contratarFuncionarioButton() {
        addButton(buttons.get(3), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var tipo = input_tipo.getText();
                var nome = input_nome.getText();
                var cpf = input_cpf.getText();
                var salario = input_salario.getText();

                if(tipo == null || tipo.equals("") || nome == null || nome.equals("") || cpf == null || cpf.equals("") || salario == null || salario.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    var codigo = GerenteHandler.contratarFuncionario(tipo, nome, cpf, salario);
                    if (codigo) {
                        JOptionPane.showMessageDialog(null, "Tudo certo, para ver o resultao recarregue a pagina", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                    }
                    reload();
                }
            }
        });
    }

    private void demitirButton() {
        addButton(buttons.get(1), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroy(buttons);
                demitirScreen();
            }
        });
    }

    private void demitirScreen(){
        makeTable(GerenteHandler.toArray(), colunas);
        label_cpf.setText("Digite o CPF do funcionario:");
        label_cpf.setBounds(0, 390, 200, 30);
        input_cpf = new JTextField();
        input_cpf.setBounds(151, 390, 300, 30);

        addComponent(label_cpf);
        addComponent(input_cpf);
        demitirFuncionarioButton();
    }

    private void demitirFuncionarioButton() {
        addButton(buttons.get(2), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var cpf = input_cpf.getText();

                if(cpf == null || cpf.equals("")){
                    JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                }else{
                    var codigo = GerenteHandler.demitirFuncionarios(cpf);
                    if (!codigo) {
                        JOptionPane.showMessageDialog(null, "Algo de errado não está certo", "Hmmmm...", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Tudo certo, para ver o resultao recarregue a pagina", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    reload();
                }
                destroy(buttons);
            }
        });
    }
}
