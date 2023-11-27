package oops;

enum Sizea{
	SMALL , MEDIUM , LARGE , EXTRALARGE
}

public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test a = new test(Sizea.LARGE);
		a.orderSamosa();
	}

}
class test {
	Sizea dosaSize;
	public test(Sizea p) {
		this.dosaSize = p;
	}
	
	public void orderSamosa() {
		switch(dosaSize) {
		case SMALL:
			System.out.println("i want small size samosa");
			break;
		case MEDIUM:
			System.out.println("i want medium size somsa");
			break;
		case LARGE:
			System.out.println("i want large size samosa");
			break;
		case EXTRALARGE :
			System.out.println("i want Extralarge size samosa");
		}
	}
	
}