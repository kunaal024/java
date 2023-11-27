package oops;

public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boss b = new boss();
		b.getArea(10, 12);
		 
	}

}

interface compnay{
	public void getArea(int length , int breadth);
}


class boss implements compnay{

	@Override
	public void getArea(int length, int breadth) {
		System.out.println(length * breadth);
		
	}
	
}



