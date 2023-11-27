package oops;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kuki kunal = new kuki("rachana","kanoje","kunal");
		ruu  rcahana = new ruu("kunaal","kanoje","rcahana");
		
		System.out.println(kunal.firstName);
		System.out.println(kunal.lastName);
		System.out.println(kunal.sname);
		
		kunal.dispalysname();
		kunal.displayName();
		
		System.out.println(rcahana.firstName);
		System.out.println(rcahana.lastName);
		System.out.println(rcahana.dname);
		
		rcahana.displaydname();
		rcahana.displayName();
		
		
		
	}

}
class rachana{
	String firstName;
	String lastName;
	
	public rachana(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class kuki extends rachana{
	String sname;
	public kuki(String fn, String ln, String sn) {
		super(fn, ln);
		this.sname = sn;
		
	}
	public void dispalysname() {
		System.out.println(this.sname);
	}
}

class ruu extends rachana{
	String dname;
	public ruu(String fn, String ln , String dn) {
		super(fn, ln);
		this.dname = dn;
	}
	public void displaydname() {
		System.out.println(this.dname);
	}
}

	
	
	
	
	