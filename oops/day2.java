package oops;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		serial nam = new serial();
		System.out.println(nam.color);
		System.out.println(nam.type);
		nam.displayColor();
		String ty = nam.displayType();
		System.out.println(ty);
		
		
		serial nam1 = new serial();
		System.out.println(nam1.color);
		System.out.println(nam1.type);
		
		nam1.displayColor();
		String ty1 = nam1.displayType();
		System.out.println(ty1);
		
		nam1.color ="blue";
		nam1.type ="bhoot";
		
		nam1.displayColor();
		String ty2 = nam1.displayType();
		System.out.println(ty2);
		
	
		
		
		
		
	
	}

}
class serial{
	 String type ="drama";
	 String color ="black";
	 
	 public void displayColor() {
		 System.out.println(this.color);
	 }
	 
	 public String displayType() {
		 return this.type;
	 }
}

class fruit{
	String type;
	String color;
	
	public fruit(String ty, String cl) {
		this.type = ty;
		this.color =cl;
	}
	
	public void displaycolor(){
		System.out.println(this.color);
	}
	
	public String displaytype() {
		return this.type;
	}
}

class vegetable{
	String color;
	String type;
	
	public String setColor(String cl) {
		 this.color = cl;
		 return this.color;
	}
	
	public String setType(String ty) {
		this.type = ty;
		return this.type;
	}
}








