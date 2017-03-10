import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements MouseListener {
	 int NumberOfButtons=35;
	 JFrame frame = new JFrame();
	  JPanel panel = new JPanel();
public static void main(String[] args)  {
	WhackAMole game = new WhackAMole();
	
game.drawButtons(new Random().nextInt(game.NumberOfButtons));
}
 void drawButtons(int rand)
 {
	frame.setSize(400, 400);
	
	frame.add(panel);
for (int i = 0; i < NumberOfButtons; i++) {
	panel.add(new JButton());
}
	 
frame.setVisible(true);	 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
int moleButton;

}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
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

