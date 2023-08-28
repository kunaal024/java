package dayq;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4+4);
		game(4,5);
		game1();
		game2(4,5);
		game4(8,9);
		game5(7,9);
		int a = 10;
		int b = 20;
		if(a < b) {
			System.out.println(" ai is greater");
		}
		if(b > a ) {
			System.out.println(" b is grreater");
		}
	 
		
	}
	public static void game(int x , int y ) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
	}
	public static void game1() {
		System.out.println(4+5);
	}
	public static int game2(int i , int k ) {
					return i + k;
	}
	public static void game3(int o , int p ) {
		System.out.println(o < p);
		System.out.println(o > p);
		System.out.println(o <= p);
		System.out.println(o >= p);
		System.out.println(o != p);
		
	}
	public static void game4(int l , int k) {
		System.out.println(l == k);
		System.out.println(l != k);
		
	}
	public static void game5(int h , int j) {
		System.out.println(h == j && h == j);
		System.out.println(h != j && h == j);
		System.out.println(h == j && h != j);
		System.out.println(h != j && h != j);
		System.out.println(h == j || h == j);
		System.out.println(h != j || h == j);
		System.out.println(h == j || h != j);
		System.out.println(h != j || h != j);
		
	}
}
	















































