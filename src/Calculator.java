import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setVisible(true);
	JPanel p = new JPanel();
	f.add(p);
	JButton b1 = new JButton();
	p.add(b1);
	JButton b2 = new JButton();
	p.add(b2);
	JButton b3 = new JButton();
	p.add(b3);
	JButton b4 = new JButton();
	p.add(b4);
	JTextField t1 = new JTextField(20);
	p.add(t1);
	JTextField t2 = new JTextField(20);
	p.add(t2);
	f.pack();
	
}
}
