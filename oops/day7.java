package oops;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sons moghly = new sons("bahgira","jungly","mugliy");
		moghly.displayName();
	}

}

class father{
	String firstName;
	String LastName;
	
	public father(String fn, String ln) {
		this.firstName = fn;
		this.LastName = ln;
	}
	 public void displayName() {
		 System.out.println(this.firstName + this.firstName);
	 }
}

class sons extends father{
		String nickName;
	public sons(String fn, String ln , String Nm) {
		super(fn, ln);
		this.nickName = Nm;
	}
	public void displayName() {
		System.out.println(this.nickName + this.firstName );
		super.displayName();
	}
	
}