package practices;

public class parc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mind ruu = new mind();
		System.out.println(ruu.type);
		System.out.println(ruu.color);
		ruu.displaycolor();
		String i = ruu.displaytype();
		System.out.println(i);
		
		System.out.println("------------");
		
		brain ruu1 = new brain("suv","s-class");
		System.out.println(ruu1.type);
		System.out.println(ruu1.model);
		ruu1.displaytype();
		ruu1.displaymodel();
		
		
		
		
		}
		
	}



class mind{
	String type ="movie";
	String color = "blue";
	
	public void displaycolor() {
		System.out.println(this.color);
	}
	public String displaytype() {
		return this.type;
	}
}
class brain {
	String type ;
	String model;
public  brain( String ty , String ml) {
	this.model = ml;
	this.type = ty;
}

public void displaytype() {
	System.out.println(this.type);
}
public void displaymodel() {
	System.out.println(this.model);
}
	
}