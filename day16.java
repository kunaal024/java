
public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//complier time error
		//local error
		//run time error
		
		//compile time error
		//system.out.println(a;
		
		//logical error
		
		
		System.out.println("a");
		
		try {
			System.out.print(10/0);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("bye");
	
		//program2
		try {
			int [] numbers = {11,22,33,44};
			System.out.println(numbers[6]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("bye");
		
		
		//program3
		//System.out.println("println");
		//System.out.println(10/0);
		
		
		try {
			System.out.println(10/0);
			String names[] = {"kunaal","kanoje","nagpur"};
			System.out.println(names[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("please enter correct input");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("element not found at particular index");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//program4
		System.out.println("OKAY");
		
		try {
			System.out.println(10/5);
		}
		catch( Exception e) {
			System.out.println("incorrect input");
		}
		finally {
			System.out.println("I will always run");
		}
		
		System.out.println("bye");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
}
