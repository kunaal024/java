package practices;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 cls = new sub1();
		cls.color();
		cls.section();
		cls.style();
		
		System.out.println("===============");
		
		sub2 cls2 = new sub2();
		cls2.color();
		cls2.section();
		cls2.style();
		
		System.out.println("===============");
		
		emp ep = new emp();
		ep.getarea(12, 12);
		
		
		System.out.println("===============");
		student S = new student();
		S.rule1();
		S.rule2();
		S.rule3();
		S.rule4();
		S.rule5();
		S.rule6();
		S.rule7();
		S.rule8();
		
		
		
	}
}
abstract class sub {
	public abstract void  color();
	public abstract void style();

}
class sub1 extends sub{

	@Override
	public void color() {
		System.out.println("red");
	}

	@Override
	public void style() {
		System.out.println("roman");
	}
	 
	public void section() {
		System.out.println("A");
	}
}


class sub2 extends sub{

	@Override
	public void color() {
		System.out.println("orange");		
	}

	@Override
	public void style() {
		System.out.println("Arial");
	}
	
	//override
	public void section() {
		System.out.println("B");
	}
}






interface companyy{
	public void getarea(int length , int breadth);
}

class emp implements companyy{

	@Override
	public void getarea(int length, int breadth) {
		System.out.println(length * breadth);		
	}
}



class principal{
	String firstname ;
	String lastname ;
	public principal(String fn , String ln) {
		this.firstname = fn;
		this.lastname = ln;
	}
	public void displayname() {
		System.out.println(this.firstname + this.lastname);
	}
}


class HOD{
	String firstNAme;
	String lastname ;
	public HOD(String fn , String  ln ) {
		this.firstNAme = fn;
		this.lastname = ln;
	}

public void displayname() {
	System.out.println(this.firstNAme + this.lastname);
}

}


interface A {
	public void rule1();
	public void rule2();
	public void rule3();
	public void rule4();
}

interface B {
	public void rule5();
	public void rule6();
	public void rule7();
	public void rule8();
}

class student implements B, A{

	@Override
	public void rule1() {
		System.out.println("rule1");		
	}

	@Override
	public void rule2() {
		System.out.println("rule2");		
	}

	@Override
	public void rule3() {
		System.out.println("rule3");
	}

	@Override
	public void rule4() {
		System.out.println("rule4");		
	}

	@Override
	public void rule5() {
		System.out.println("rule5");		
	}

	@Override
	public void rule6() {
		System.out.println("rule6");		
	}

	@Override
	public void rule7() {
		System.out.println("rule7");		
	}

	@Override
	public void rule8() {
		System.out.println("rule8");		
	}
	
}






























