import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {
public static void main(String[] args) {
	World world1 = new World();
	world1.show();
	Bug bug1 = new Bug();
	Bug bug2 = new Bug();
	Location loc = new Location(2, 2);
	Location location1 = new Location(4, 4);
	world1.add(loc, bug1);
	world1.add(location1, bug2);
	bug1.setColor(Color.cyan);
	bug1.setDirection(45);
	bug2.setColor(Color.BLUE);
	bug2.setDirection(45);
	Flower rose = new Flower();
	rose.setColor(Color.PINK);
	rose.moveTo(location1);
}
}
