package practices;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EXTRA kunaal = new EXTRA("kunaal","kanoje",24);
		kunaal.displaycolor();
		kunaal.displayname();
	}

}
interface RULE{
	public  void displaycolor();
}
class color{
	String firstname ;
	String lastname ;
	int age ;
	public color(String fn , String ln, int age) {
		this.firstname =fn;
		this.lastname = ln ;
		this.age =age ;
		
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}

class EXTRA extends color implements RULE{

	public EXTRA(String fn, String ln, int age) {
		super(fn, ln, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displaycolor() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}
	
	
}