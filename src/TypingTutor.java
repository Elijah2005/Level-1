import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class TypingTutor {
	 JFrame j = new JFrame();
	JPanel p = new JPanel();
	char currentLetter;
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
}
	TypingTutor(){
		
		j.pack();
		j.setVisible(true);
		j.setTitle("TYPE OR DIE");
		JLabel l = new JLabel();
		l.setText(""+currentLetter);
		
	
	}
}

