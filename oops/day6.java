package oops;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model kunaal = new model ();
		kunaal.class1();
		kunaal.color();
		kunaal.companyName();
		
		desgin kunal =  new desgin();
		kunal.class1();
		kunal.color();
		
	}

}

abstract class cars{
	 public abstract void color();
	 public abstract void class1();
}


class model extends cars{

	@Override
	public void color() {
		System.out.println("red");		
	}

	@Override
	public void class1() {
		System.out.println("S class");
	}
	
	public void companyName() {
		System.out.println("bmw");
	}
	
}

class desgin extends cars{

	@Override
	public void color() {
		System.out.println("two tone");
		
	}

	@Override
	public void class1() {
		System.out.println("E class");
	}
}
