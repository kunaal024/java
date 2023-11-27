package oops;

public class day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		person ku = new person();
		System.out.println(ku.firstname);
		System.out.println(ku.lastname);
		System.out.println(ku.age);
		ku.displayname();
		ku.firstname = "kunaal";
		ku.lastname = "kanoje";
		ku.age = 23;
		
		person4 kuu = new person4("kunaal","kanoje",24);
		System.out.println(kuu.firstname);
		System.out.println(kuu.lastname);
		System.out.println(kuu.age);
		
		kuu.displayname();
	
		
	}

}
class person{
	String firstname = " kunal";
	String lastname = "kanoje";
	int age = 24;
	public void displayname() {
		
	}
}
	
class person4{
	String firstname ;
	String lastname;
	int age;
	public person4(String fn, String ln, int ag) {
		this.firstname = fn;
		this.lastname =ln;
		this.age = ag;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}
