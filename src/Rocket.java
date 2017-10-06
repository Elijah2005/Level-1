
public class Rocket {
	int fuel;
	String name;
Rocket(int fuel,String name){	
	System.out.println("Constructing rocket");
	this.fuel=fuel;
	this.name=name;
}
void Launch(){
	for (int i = -1; i < fuel; fuel--) {
		System.out.println(""+fuel);
		if(fuel<=0) {
			System.out.println("Out of fuel");
		}
	}
	
}
}

