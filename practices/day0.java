package practices;

public class day0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employe owner = new employe();
		owner.desgination();
		owner.warehouse();
		owner.Headoffice();
		
		employee ownere = new employee();
		ownere.desgination();
		ownere.warehouse();
		
		
	}

}
abstract class company{
	public abstract void desgination();
	public abstract void warehouse();
}

class employe extends company{

	@Override
	public void desgination() {
	System.out.println("devloper");
	}

	@Override
	public void warehouse() {
	System.out.println("pune");
	}
	
	public void Headoffice() {
		System.out.println("ngpur");
	}
	}

class  employee extends company{

	@Override
	public void desgination() {
		System.out.println("testing");
		
	}

	@Override
	public void warehouse() {
		System.out.println("hyderabad");
		
	}
}