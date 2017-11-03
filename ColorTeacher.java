import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorTeacher {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	JButton yellow = new JButton();
	yellow.setBackground(Color.YELLOW);
	yellow.setOpaque(true);
	panel.add(yellow);
	JButton red = new JButton();
	red.setBackground(Color.RED);
	red.setOpaque(true);
	panel.add(red);
	JButton blue = new JButton();
	blue.setBackground(Color.BLUE);
	blue.setOpaque(true);
	panel.add(blue);
	JButton green = new JButton();
	green.setBackground(Color.GREEN);
	green.setOpaque(true);
	panel.add(green);
	frame.setVisible(true);
	frame.pack();
}
}
