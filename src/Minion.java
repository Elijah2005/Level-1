
public class Minion {
	            private String name; 
	 			private int eyes; 
	 			private String color; 
	 			private String master;
	 			Minion(String newName, int newEyes, String newColor, String newMaster){
	 				name=newName;
	 				eyes=newEyes;
	 				color=newColor;
	 				master=newMaster;
	 			}
void setName(String newName){
	name=newName;
}
String getName(){
	return name;
}
void setEyes(int newEyes){
eyes=newEyes;	
}
int getEyes(){
return eyes;	
}
void setColor(String newColor){
	color=newColor;
}
String getColor(){
return color;
}
void setMaster(String newMaster){
	master=newMaster;
}
String getMaster(){
	return master;
}
}

