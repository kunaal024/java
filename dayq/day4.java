package dayq;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("revision");
		int q = 10;
		int b = 10;
		System.out.println(q + b);
		System.out.println(q - b);
		System.out.println(q / b);
		System.out.println(q * b);
		add();
		add1(10,20);
		add2(10,20);
		int a = add2(10,33);
		System.out.println(a);
		add3(10,20);
	}
	public static void add() {
		System.out.println(9+6);
	}
	 
	public static void add1(int x , int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	}
	public static int add2(int i , int k) {
		            return i * k;
		
	}
	public static void add3(int o , int p) {
		System.out.println(o == p && o == p);
		System.out.println(o != p && o == p);
		System.out.println(o == p && o != p);
		System.out.println(o != p && o != p);
		System.out.println(o == p || o == p);
		System.out.println(o != p || o == p);
		System.out.println(o == p || o != p);
		System.out.println(o != p || o == p);
		System.out.println(o != p || o != p);
	}

	
	
}
