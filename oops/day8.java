package oops;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee a = new employee();
		a.Hr();
		a.manager();
		
		
	}

}

abstract class company{
	public abstract void manager();
	public abstract void Hr();
}

class employee extends company{

	@Override
	public void manager() {
		System.out.println("I am manager");
	}

	@Override
	public void Hr() {
		System.out.println("I am HR");
		
	}
	
}