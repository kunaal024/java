package practices;

public class practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pratices kuu = new pratices();
		System.out.println(kuu.firstname);
		System.out.println(kuu.lastname);
		System.out.println(kuu.age);
		kuu.displayname();
		
		prac kuu1 = new prac("rachana","kanoje",26);
		System.out.println(kuu1.firstname);
		System.out.println(kuu1.lastname);
		System.out.println(kuu1.age);
		
		kuu1.displyname();
		
		
		
		
	}

}


class pratices {
	String firstname = "golu";
	String lastname = "kanoje";
	int age = 24;
	
	public void displayname() {
		
	}
}

class prac {
	String firstname;
	String lastname;
	int age;
	public prac (String fn, String ln , int ag) {
		this.age = ag;
		this.firstname = fn;
		this.lastname = ln;
	}
	public void displyname() {
		System.out.println(this.firstname + this.lastname);
	}
	
}