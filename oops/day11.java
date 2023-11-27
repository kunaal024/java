package oops;

public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fillH kunaal = new fillH("kunaal","kanoje",22);
		kunaal.displaycolor();
		kunaal.displayName();
	}

}
interface RULE{
	public void displaycolor();
}
class color{
	String firstName ;
	String lastName ;
	int age ;
	public color(String fn , String ln  ) {
		this.firstName = fn ;
		this.lastName = ln ;
		this.age = age;
	}
	public void displayName() {
		System.out.println(this.firstName + this.age);
	}
}

class fillH extends color implements RULE{

	public fillH(String fn, String ln , int age) {
		super(fn, ln);
		this.age = age ;
	}

	@Override
	public void displaycolor() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}
	
}