package oops;

	//Default
	//private
	//protected
	//public
public class day12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empA a = new empA();
		a.dispaly();
		
		empB b  = new empB();
		b.display();
		
		empC c = new empC();
		c.display2();
		
		empD d = new empD();	
		d.display();
	}
	

}
class empA{
	void dispaly() {
		System.out.println("print emp");
	}
}

class empB{
	public void display() {
		System.out.println("print empB");
	}
}

class empC{
	private void display() {
		System.out.println("print priavte");
	}
	public void display2() {
		System.out.println("print public");
		
	}
}

class empD{
	protected void display() {
		System.out.println("print protected");
	}
	 public void display2() {
		 System.out.println("print display2");
	 }
}