
public class PetPlatypus {
	private String name1;
PetPlatypus(String name){
	name1=name;
}

	void sayHi(){
		System.out.println("The platypus " + name1 + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus pet = new PetPlatypus("Perry");
		

		//2. Call the sayHi method
		pet.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
	


}




