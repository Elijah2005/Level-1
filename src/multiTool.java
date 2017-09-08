import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class multiTool implements ActionListener{
	JFrame j = new JFrame();
	JButton b = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
public static void main(String[] args) {
multiTool m = new multiTool();
}
multiTool(){
	j.setVisible(true);
	j.setSize(250, 250);
	JPanel p = new JPanel();
	j.add(p);
	p.add(b);
	p.add(b2);
	p.add(b3);
	b.setText("Random");
	b2.setText("Greeting");
	b3.setText("Math");
	b.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource()==b) {
	Random rand = new Random();
	int t=rand.nextInt(10000000);
	JOptionPane.showMessageDialog(null,"Here's a random number "+t);
}
if(e.getSource()==b2) {
	String name = JOptionPane.showInputDialog("Enter a name");
	JOptionPane.showMessageDialog(null, "Hi  "+name +"!");
}
if(e.getSource()==b3) {
	String num= JOptionPane.showInputDialog("Enter number 1");
	String num2= JOptionPane.showInputDialog("Enter number 2");
	int x = Integer.parseInt(num);
	int y = Integer.parseInt(num2);
int sum= x+y;	
	JOptionPane.showMessageDialog(null, num +" + "+ num2 +" =" +sum );
}
}
}
