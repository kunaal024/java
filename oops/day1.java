package oops;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stood kunal = new stood();
		System.out.println(kunal.firstname);
		System.out.println(kunal.lastname);
		System.out.println(kunal.age);
		kunal.displayname();
		
		kunal.firstname = "kunal";
		kunal.lastname = "kunal";
		kunal.age = 23;
		
		
		
		
		person1 golu = new person1("golu","kanoje",23);
		System.out.println(golu.firstname);
		System.out.println(golu.lastname);
		System.out.println(golu.age);
		golu.displayname();
		
	}

}



class stood{
	String firstname = "kunal";
	String lastname = "kanoje";
	int age = 24;
	public void displayname() {
	}
}
class person1{
	String firstname ;
	String lastname;
	int age;
	
	public person1(String fn, String ln , int ag) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = ag;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}