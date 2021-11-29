import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Button;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends Frame implements ActionListener {

    private ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    
    private static JFrame f;
    private static Button b1, b2, b3, b4;
    private static JPanel panelButton;
    private static Panel panelSup;
    private static Label labelNumero;
    private static TextField textFieldNumero;
    private static Label labelNome;
    private static TextField textFieldNome;
    private static Label labelSexo;
    private static TextField textFieldSexo;
    private static Label labelIdade;
    private static TextField textFieldIdade;

    public void Form() {

        b1 = new Button("Ok");
        b2 = new Button("Limpar");
        b3 = new Button("Mostrar");
        b4 = new Button("Sair");
        f = new JFrame("Pessoa");
        f.setSize(400, 180);
        panelSup = new Panel();
        panelButton = new JPanel();
        labelNumero = new Label("Número: ");
        textFieldNumero = new TextField();
        textFieldNumero.setEnabled(false);
        labelNome = new Label("Nome: ");
        textFieldNome = new TextField();
        labelSexo = new Label("Sexo: ");
        textFieldSexo = new TextField();
        labelIdade = new Label("Idade: ");
        textFieldIdade = new TextField();

        panelSup.setLayout(new GridLayout(4, 2, 10, 10));
        panelSup.add(labelNumero, BorderLayout.WEST);
        panelSup.add(textFieldNumero, BorderLayout.EAST);
        panelSup.add(labelNome, BorderLayout.WEST);
        panelSup.add(textFieldNome, BorderLayout.EAST);
        panelSup.add(labelSexo, BorderLayout.WEST);
        panelSup.add(textFieldSexo, BorderLayout.EAST);
        panelSup.add(labelIdade, BorderLayout.WEST);
        panelSup.add(textFieldIdade, BorderLayout.EAST);
        panelButton.setLayout(new GridLayout(1, 4));
        panelButton.add(b1);
        panelButton.add(b2);
        panelButton.add(b3);
        panelButton.add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(panelSup);
        f.add(panelButton, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        // Botão OK
        if (a.getSource() == b1) {
            String nome = textFieldNome.getText();
            int idade = Integer.parseInt(textFieldIdade.getText());
            char sexo = textFieldSexo.getText().toUpperCase().charAt(0);           
            Pessoa pessoa = new Pessoa(nome, sexo, idade);
            listaPessoa.add(pessoa);
        }
        // Botão Limpar
        if (a.getSource() == b2) {
            textFieldNome.setText("");
            textFieldSexo.setText("");
            textFieldIdade.setText("");
        }
        // Botão Mostrar
        if (a.getSource() == b3) {
            String retorna = "";
            for (Pessoa p : listaPessoa) {
                retorna += p.toString();
            }
            JOptionPane.showMessageDialog(this, retorna);
        }
        // Botão Sair
        if (a.getSource() == b4) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.Form();
    }
}
