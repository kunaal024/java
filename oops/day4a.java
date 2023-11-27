package oops;

public class day4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher kunal = new Teacher("kunal","kanoje","23",10000);
		System.out.println(kunal.firstName);
		System.out.println(kunal.lastName);
		System.out.println(kunal.rollNo);
		System.out.println(kunal.salary);
		
		kunal.displayName();
		kunal.displaySalary();
	}

}

class StudentK{
	
	String firstName;
	String lastName;
	String rollNo;

	public StudentK(String fn , String ln , String rn) {
		this.firstName = fn;
		this.lastName = ln;
		this.rollNo = rn;
	}
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacher extends StudentK{
	int salary;
	 public Teacher(String fn, String ln, String rn, int sy) {
		super(fn, ln, rn);
		this.salary = sy;
	}
	 public void displaySalary() {
		 System.out.println(this.salary);
	 }

	 
}
