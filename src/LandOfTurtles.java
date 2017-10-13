import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
public static void main(String[] args) {
	MultiTurtlePanel panel = new MultiTurtlePanel();
	String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	Random random = new Random();
	JFrame frame = new JFrame();
	    frame.add(panel);
frame.setVisible(true);
    panel.setBackgroundImage(galapagosIslands);
    frame.pack();
    for (int i = 0; i < 100; i++) {
    Turtle tortle = new Turtle();
    panel.addTurtle(tortle);
    tortle.penDown();
    tortle.moveTo(random.nextInt(1300), random.nextInt(800));
    }
}
}
