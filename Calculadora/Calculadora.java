import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends Frame implements ActionListener {

	private String op = "som";
	private double n1 = 0.0;
	private double n2 = 0.0;
	private double result = 0.0;
	private boolean resultOn = false;
    private static JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bc, bsub, bsoma, bdiv, bmult, bres, bpto, bsair;
    private static JFrame f;
    private static JPanel panelButton;
    private static JPanel panelRes;
    private static JTextField textFieldRes;

    @SuppressWarnings("deprecation")
	public void Form() {

    	textFieldRes = new JTextField("0");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bc = new JButton("C");
        bsub = new JButton("-");
        bsoma = new JButton("+");
        bdiv = new JButton("/");
        bmult = new JButton("*");
        bres = new JButton("=");
        bpto = new JButton(".");
        bsair = new JButton("Sair");
        f = new JFrame("Calculadora");
        f.setSize(400, 180);
        panelRes = new JPanel();
        panelRes.setLayout(new GridLayout(1, 1));
        panelRes.add(textFieldRes, BorderLayout.EAST);
        panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(5, 4));
        panelButton.add(b7);
        panelButton.add(b8);
        panelButton.add(b9);
        panelButton.add(bdiv);
        panelButton.add(b4);
        panelButton.add(b5);
        panelButton.add(b6);
        panelButton.add(bmult);
        panelButton.add(b1);
        panelButton.add(b2);
        panelButton.add(b3);
        panelButton.add(bsub);
        panelButton.add(b0);
        panelButton.add(bpto);
        panelButton.add(bres);
        panelButton.add(bsoma);
        panelButton.add(bc);
        panelButton.add(bsair);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        bsub.addActionListener(this);
        bpto.addActionListener(this);
        bsoma.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bres.addActionListener(this);
        bc.addActionListener(this);
        bsair.addActionListener(this);
        f.add(panelRes, BorderLayout.NORTH);
        f.add(panelButton);
        f.setVisible(true);
        f.show();
    }

    @Override
    public void actionPerformed(ActionEvent a) {
    	double x = Double.parseDouble(textFieldRes.getText());
    	if(a.getSource() == bc)
        {
        	textFieldRes.setText("0");
        	n1 = 0;
        	n2 = 0;
        	op = "som";
        	resultOn = false;
        }
    	if(resultOn == true)
    	{
    		if(a.getSource() != bsoma && a.getSource() != bsub && a.getSource() != bdiv && a.getSource() != bmult)
    		{
	    		textFieldRes.setText("0");
	        	resultOn = false;
    		}
    	}
        if(a.getSource() == b0)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "0");
        }
        if(a.getSource() == b1)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "1");
        }
        if(a.getSource() == b2)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "2");
        }
        if(a.getSource() == b3)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "3");
        }
        if(a.getSource() == b4)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "4");
        }
        if(a.getSource() == b5)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "5");
        }
        if(a.getSource() == b6)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "6");
        }
        if(a.getSource() == b7)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "7");
        }
        if(a.getSource() == b8)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "8");
        }
        if(a.getSource() == b9)
        {
        	if(x == 0 && textFieldRes.getText().length() == 1)
        	{
        		textFieldRes.setText("");
        	}
        	textFieldRes.setText(textFieldRes.getText() + "9");
        }
        if(a.getSource() == bpto)
        {
        	textFieldRes.setText(textFieldRes.getText() + ".");
        }
        if(a.getSource() == bdiv)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "div";
        	textFieldRes.setText("0");
        }
        if(a.getSource() == bmult)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "mult";
        	textFieldRes.setText("0");
        }
        if(a.getSource() == bsoma)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "soma";
        	textFieldRes.setText("0");
        }
        if(a.getSource() == bsub)
        {
        	n1 = Double.parseDouble(textFieldRes.getText());
        	op = "sub";
        	textFieldRes.setText("0");
        }
        if(a.getSource() == bres)
        {
        	n2 = Double.parseDouble(textFieldRes.getText());
        	if(op == "soma")
        	{
        		result = n1 + n2;
        	}
        	else if(op == "sub")
        	{
        		result = n1 - n2;
        	}
        	else if(op == "mult")
        	{
        		result = n1 * n2;
        	}
        	else if(op == "div")
        	{
        		result = n1 / n2;
        	}
        	textFieldRes.setText(String.valueOf(result));
        	resultOn = true;
        }
        if(a.getSource() == bsair)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
    	try {
	        Calculadora calculadora = new Calculadora();
	        calculadora.Form();
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	finally {
    		
    	}
    }
}