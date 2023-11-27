package practices;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		stood Kunaal = new stood();
		System.out.println(Kunaal.firstNAme);
		System.out.println(Kunaal.Lastname);
		System.out.println(Kunaal.age);
		Kunaal.display();
		
		System.out.println("====================");
		
		person kunal = new person("kunaal","kanoje",24);
		System.out.println(kunal.age);
		System.out.println(kunal.firstname);
		System.out.println(kunal.lastname);
		kunal.display();
		
		System.out.println("====================");

		teacher golu = new teacher("kunaal", "kanoje", 24, 10000000);
		System.out.println(golu.firstname);
		System.out.println(golu.lastname);
		System.out.println(golu.age);
		System.out.println(golu.salary);
		
		golu.displayname();
		
		
	}

}

class stood {
	String firstNAme = "kunal";
	String Lastname = "kanoje";
	int age =24;
	public void display(){
		
	}
}


class person {
	String firstname ;
	String lastname ;
	int age;
	
	public person(String fn , String ln ,int age ) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = age;
	}
	public void display() {
		System.out.println(this.firstname + this.lastname);
	}
}





class teacher extends person{
	int salary ;
	public teacher(String fn, String ln, int age, int sal) {
		super(fn, ln, age);
		this.salary  = sal ;
		// TODO Auto-generated constructor stub
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
	
	
	
}










