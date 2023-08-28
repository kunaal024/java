package dayq;

public class day1 {

	public static void main(String[] args) {
		System.out.println("hiik");
		
		int a= 10;
		int b = 10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(a%b);
		
		add();
		add1(14,55);
		add2(44,66);
		add3(10,11);
	}
	public static void add() {
		System.out.println(9+9);
	}
	public static void add1(int c , int d ) {
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c/d);
		System.out.println(c*d);	
		
	}
	public static int add2(int k , int l ) {
					return k + l;
	}
	public static void add3(int i , int o) {
		System.out.println(i<o);
		System.out.println(i>o);
		System.out.println(i<=o);
		System.out.println(i>=o);
		
	}
	
	 
}
