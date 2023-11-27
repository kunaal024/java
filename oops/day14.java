package oops;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collection1 a = collection1.createobj();
		a.getConnection1();
		collection1 b = collection1.createobj();
		b.getConnection1();
	}

}
class collection1 {
	private static collection1 obj ;
	private collection1() {		
	}
	public static collection1 createobj() {
		if(obj == null) {
			obj = new collection1();
		}
		return obj;
	}
	public void getConnection1() {
		System.out.println("connected to DB");
	}
}
