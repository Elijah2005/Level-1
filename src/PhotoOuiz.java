 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoOuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String Doge = "http://cdn.akamai.steamstatic.com/steamcommunity/public/images/avatars/50/50e29ed2772ca73045b9de430ef2bc924367026d_full.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component Dogec; 
		// 3. use the "createImage()" method below to initialize your Component
Dogec =createImage(Doge);
		// 4. add the image to the quiz window
quizWindow.add(Dogec);
		// 5. call the pack() method on the quiz window
quizWindow.pack();

		// 6. ask a question that relates to the image
JOptionPane.showInputDialog("What is this meme");
		// 7. print "CORRECT" if the user gave the right answer
JOptionPane.showMessageDialog(null, "CORRECT");
		// 8. print "INCORRECT" if the answer is wrong
//JOptionPane.showMessageDialog(null,"INCORRECT");
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(Dogec);

		// 10. find another image and create it (might take more than one line of code)
String Trump ="https://www.askideas.com/media/48/Funny-Donald-Trump-Meme-Trust-Me-If-I-Am-Elected-We-Will-Go-To-War-Picture.jpg";
Component Trumpc;
Trumpc =createImage(Trump);

		// 11. add the second image to the quiz window
quizWindow.add(Trumpc);

		// 12. pack the quiz window
quizWindow.pack();

		// 13. ask another question
JOptionPane.showInputDialog("What is this meme");
		// 14+ check answer, say if correct or incorrect, etc.
JOptionPane.showInputDialog("CORRECT");
//JOptionPane.showInputDialog("INCORRECT");

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
