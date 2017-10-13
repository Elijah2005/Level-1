import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class TypingTutor implements KeyListener {
	 JFrame j = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	char currentLetter;
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	TypingTutor tutor = new TypingTutor();
}
	TypingTutor(){
		j.add(p);
		p.add(l);
		j.setVisible(true);
		j.setTitle("TYPE OR DIE");
		currentLetter=generateRandomLetter();
		l.setText(""+ currentLetter);
		l.setFont(l.getFont().deriveFont(500.0f));
		l.setHorizontalAlignment(JLabel.CENTER);	
		j.pack();
		j.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	 System.out.println("You typed "+ currentLetter);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	currentLetter=generateRandomLetter();
	l.setText(""+ currentLetter);
	}
}

