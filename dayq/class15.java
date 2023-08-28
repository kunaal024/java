package dayq;

public class class15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "nagpur";
		System.out.println(city);
		System.out.println(city.charAt(0));
		System.out.println(city.charAt(1));
		System.out.println(city.charAt(2));
		System.out.println(city.charAt(3));
	
		
		String city1 = "pune";
		for(int i = 0 ; i < city1.length();i++) {
			System.out.println(city1.charAt(i));
			
	 }
		
	 for(int i = city1.length()-1 ;i>=0;i--) {
		 System.out.println(city1.charAt(i));
	 }
	 
	 
	 	String colour = " blue";
	 	String colour1 = "green";
	 	String add = colour.concat(colour1);
	 	System.out.println(add);
	 	
	 	
	 	String q1 = colour.toLowerCase();
	 	System.out.println(q1);
	 	
	 	
	 	String q2 = colour.toUpperCase();
	 	System.out.println(q2);
	 	
	 	boolean q3 = colour1.endsWith("n");
	 	boolean q4 = colour1.endsWith("w");
	 	System.out.println(q4);
	 	System.out.println(q3);
	 	
	 	
	 	boolean q5 = colour1.startsWith("g");
	 	boolean q6 = colour1.startsWith("e");
	 	System.out.println(q6);
	 	System.out.println(q5);
	 	
	 	String  aim = "i am the best";
	 	String q7 = aim.replace("i", "you");
	 	System.out.println(q7);
	 	
	 	String q8 = aim.replaceFirst("i am", "you are");
	 	System.out.println(q8);
	 	
	 	String q9 = aim.replaceAll("i am the best", "you are crazy");
	 	System.out.println(q9);
	 	
	 	
	 	
	 	
	 
	 	
	 	
	}
		
	 

}
