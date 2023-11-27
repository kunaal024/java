package practices;

enum Size{
	SAMLL ,MEDIUM ,LARGE, EXTRALARGE
}

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test a = new test(Size.MEDIUM);
		a.orderbuger();
		
		collection b = collection.createobj();
		b.getcollection();
		
		empA q = new empA();
		q.display();
		
		
		empB w = new empB();
		w.display();
		
		empC e = new empC();
		e.display2();
	
		
		empD r = new empD();
		r.display();
		r.display();
		
		
	}
	
}

class test{
	Size bugersize;
	public test(Size p) {
		this.bugersize = p;
	}
	
	public void orderbuger() {
		switch(bugersize) {
		case SAMLL:
			System.out.println("i wanna one small  buger");
			break;
		case MEDIUM:
			System.out.println("i wanna one medium buger");
			break;
		case LARGE:
			System.out.println("i wanna one large buger");
			break ;
		case EXTRALARGE:
			System.out.println("i wanna one etxralarge buger");
		}
		
	}
}


class collection {
	private static collection obj ;
	private collection () {
		
	}
	public static collection createobj() {
		if (obj == null) {
			obj = new collection();
		}
		return obj;
	}
	public void getcollection() {
		System.out.println("connected to DB");
	}
	
}




class empA {
	void display() {
		System.out.println("print empB");
	}
}
class empB {
	 public void display() {
		System.out.println("print empB");
	}
}

class empC{
	 public void display2() {
		System.out.println("print public");
	
	 }
	 
}
class empD{
	 protected void display() {
		System.out.println("print protected");
	
	 }
	 public void display2() {
		System.out.println("print public");
	
	 }
	 
}





























