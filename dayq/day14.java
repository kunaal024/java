package dayq;

public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt
		// length
		//substring
		
		//charAT
		String myname = "kunaal";
		char q1 = myname.charAt(0);
		System.out.println(q1);
		
		
		String mylastname = "kanoje";
		char q2 =mylastname.charAt(5);
		System.out.println(q2);
		
	
		//length()
		
		String length ="choreographer";
		int q3 = length.length() ;
		System.out.println(q3);
	
		
		
		//substring
		String value = "house";
		String q4 =value.substring(2);
		System.out.println(q4);
	
		String q5 = value.substring(2, 4);
		System.out.println(q5);
	
		
		
		
		//toUpperCase
		
		String name = "baby";
		String q6 = name.toUpperCase();
		System.out.println(q6);
		
		//tolowerCase
		
		String name1 = "BRAND";
		String q7 = name1.toLowerCase();
		System.out.println(q7);
		
		//trim
		
		String city = " nagpur ";
		String q8 = city.trim();
		System.out.println(q8);
		
		
		//startsWith
		
		String city1 = "manipur";
		boolean q9 = city1.startsWith("j");
		System.out.println(q9);
		
		
		
		String city2 = "manipur";
		boolean k1 = city2.startsWith("m");
		System.out.println(k1);
		
		
		
		
		// endWith
		
		String city3 = "mumbai";
		boolean k2 = city3.endsWith("m");
		System.out.println(k2);
		
		String city4 = "mumbai";
		boolean k3 = city3.endsWith("i");
		System.out.println(k3);
		
		
		//Replace
		
		String change = "i am the best ";
		String k4 = change.replace("i", "I");
		System.out.println(k4);
		
		
		
		
		// replacefirst
		
		
		String change1 = "we are the best";
		String k5 = change1.replaceFirst("we", "1");
		System.out.println(k5);
		
		
		
		
		// replaceAll()
		
		String change2 = "we are the best";
		String k6 = change2.replaceAll("we are", "i am");
		System.out.println(k6);
	}
	
	
	
	

}
