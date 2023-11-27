package practices;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 
class same{
	private static same obj ;
	private same() {
	}
	public static same createobj() {
		if (obj == null) {
			obj = new same();
		}
		return obj;
	}
	public void getsame() {
		System.out.println("connected to DB");
	}
}