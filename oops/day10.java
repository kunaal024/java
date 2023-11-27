package oops;

public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher1 T = new Teacher1();
		T.Rule1();
		
	}

}
class principle {
	String firstName ;
	String lastName ;
	public principle(String fn , String ln) {
		this.firstName = fn;
		this.lastName =ln;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class headmaster {
	String firstName ;
	String lastName ;

	public headmaster(String fn , String ln) {
		this.firstName = fn;
		this.lastName = ln ;
	}
	public void display() {
		System.out.println(this.firstName + this.lastName);
	}
}



interface A{
	public void Rule1();
	public void Rule2();
	public void Rule3();
	public void Rule4();
}

interface B{
	public void Rule5();
	public void Rule6();
	public void Rule7();
	public void Rule8();
}

class Teacher1 implements A, B{

	@Override
	public void Rule5() {
		// TODO Auto-generated method stub
		System.out.println("Rule 5");
		
	}

	@Override
	public void Rule6() {
		// TODO Auto-generated method stub
		System.out.println("Rule 6");
	}

	@Override
	public void Rule7() {
		// TODO Auto-generated method stub
		System.out.println("Rule 7");
	}

	@Override
	public void Rule8() {
		// TODO Auto-generated method stub
		System.out.println("Rule 8");
	}

	@Override
	public void Rule1() {
		// TODO Auto-generated method stub
		System.out.println("Rule 1");
	}

	@Override
	public void Rule2() {
		// TODO Auto-generated method stub
		System.out.println("Rule 2");
	}

	@Override
	public void Rule3() {
		// TODO Auto-generated method stub
		System.out.println("Rule 3");
	}

	@Override
	public void Rule4() {
		// TODO Auto-generated method stub
		System.out.println("Rule 4");
	}
	
}















