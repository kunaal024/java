package dayq;

public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String first_name = new String("kunaal");
		String last_name = "kanoje";
		
		
		String city = "nagpur";
		System.out.println(city);
		System.out.println(city.charAt(0));
		System.out.println(city.charAt(1));
		System.out.println(city.charAt(2));
		System.out.println(city.charAt(3));
		System.out.println(city.charAt(4));
		System.out.println(city.charAt(5));
		System.out.println(city.charAt(6));
		
		
		
		
		
		
		String city2 = "pune";
		for(int i =0 ; i < city2.length(); i ++) {
			System.out.println(city2.charAt(i));
		}
		
		for(int i = city2.length()-1 ; i >=0 ; i--) {
			System.out.println(city2.charAt(i));
		}
		
		
		int a = 10;
		int b = 20;
		String first_namea = "kunaal";
		String last_namea = "kanoje";
		
		System.out.println("my firstname is "+first_namea +"my last name is "+ last_namea);
		
		String greeting = "hello";
		String greet = greeting.concat("world !");
		System.out.println(greet);
		
		
		
		String first_Name2 ="kunaal";
		String uppercase = first_Name2.toUpperCase();
		System.out.println(uppercase);
		
		
		String firstname2 = "kanoje";
		String lowercase  = firstname2.toLowerCase();
		System.out.println(lowercase);
}

}
