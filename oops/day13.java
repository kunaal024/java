package oops;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collection.getobj();
	
	}

}
class collection {
	private static collection obj;
	private collection() {
	}
	public static collection getobj() {
		if(obj == null) {
			obj = new collection();
		}
		return obj;
	}
}