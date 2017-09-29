import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class RandomRobots {
public static void main(String[] args) {
	Random random = new Random();
	for (int i = 0; i < 51; i++) {
		Robot robot = new Robot("mini");	
		robot.setRandomPenColor();
		robot.penDown();
		robot.moveTo(random.nextInt(1300), random.nextInt(800));
		
	}
	
}
}
