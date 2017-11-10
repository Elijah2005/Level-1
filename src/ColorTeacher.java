import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ColorTeacher implements ActionListener   {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
public static void main(String[] args) {
	ColorTeacher color = new ColorTeacher();
	}
	ColorTeacher() {
	frame.setTitle("Color Teacher");
	frame.add(panel);
	yellow.setBackground(Color.YELLOW);
	yellow.setOpaque(true);
	yellow.addActionListener(this);
	panel.add(yellow);
	red.setBackground(Color.RED);
	red.setOpaque(true);
	red.addActionListener(this);
	panel.add(red);
	blue.setBackground(Color.BLUE);
	blue.setOpaque(true);
	blue.addActionListener(this);
	panel.add(blue);
	green.setBackground(Color.GREEN);
	green.setOpaque(true);
	green.addActionListener(this);
	panel.add(green);
	frame.setVisible(true);
	frame.pack();
	}	


private static void ColorTeacher() {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==yellow) {
		speak("Yellow");
	}
	if(e.getSource()==red) {
		speak("Red");
	}
	if(e.getSource()==blue) {
		speak("Blue");
	}
	if(e.getSource()==green) {
		speak("Green");
	}
}
void speak(String words) {
	try {
		Runtime.getRuntime().exec("say "+ words);
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

