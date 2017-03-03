import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener{
	int num1=1;
	int num2=2;
	int num3=3;
	JLabel reel1 = new JLabel();
	JLabel reel2 = new JLabel();
	JLabel reel3 = new JLabel();
public static void main(String[] args) {
	SlotMachine machine= new SlotMachine();
}
SlotMachine(){
JFrame machine = new JFrame();
JPanel layout = new JPanel();
JButton spin = new JButton();
machine.setSize(500, 500);
spin.addMouseListener(this);
machine.add(layout);
spin.setLabel("Spin");
layout.add(spin);
layout.add(reel1);
layout.add(reel2);
layout.add(reel3);
machine.setVisible(true);
machine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
		num1 = new Random().nextInt(3);
		num2 = new Random().nextInt(3);
		num3 = new Random().nextInt(3);
		reel1.setText(Integer.toString(num1));
		reel2.setText(Integer.toString(num2));
		reel3.setText(Integer.toString(num3));
		System.out.println("Mouse Clicked");
		}
	

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

