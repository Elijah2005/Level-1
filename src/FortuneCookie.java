import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//The point of this exercise is to guide the students through making a Swing app from scratch. They should have practiced with a few of the UI recipes already.
//It’s a button that gives one of five random fortunes when clicked.
//
//Make a class, main method and showButton method. Put a printout in the showButton method and challenge kids to get it printing (they will need to instantiate class and call method on the instance). 
//	FortuneCookie fortune = new FortuneCookie();
//	fortune.showButton();
//
//Make a JFrame in showButton method and get it to show.
//jFrame.setVisible(true);
//
//Make a JButton and add it to the JFrame.
//JButton butt = new JButton();
//jFrame.add(butt);
//
//When the button is clicked, say “Woohoo”.
//Add an action listener to the button:jButton.addActionListener(this);
//Let your class implement ActionListener [use quick fix]
//Add unimplemented methods [use quick fix]
//Put JOptionPane pop-up inside actionPerformed() method
//
//Generate a random number between 0 and 4: 
public class FortuneCookie implements ActionListener { 
	public static void main(String[] args) throws Exception {
		
				FortuneCookie fortune = new FortuneCookie();
fortune.showButton();
	}
		
	
void showButton(){ 
	System.out.println("Hi");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
		
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "hi");
}
if()	
		}	
	

	
	
	




