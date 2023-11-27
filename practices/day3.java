package practices;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			int number [] = new int[5];
			number[0] = 11;
			number[1] = 12;
			number[2] = 13;
			number[3] = 14;
			number[4] = 15;
			int number1 [] = {11,12,13,14,15};
			int[] number3 = {16,17,18,19,20};
					
			System.out.println(number[2]);
			
			number[2] =22;
			System.out.println(number[2]);
			
			System.out.println("----------");
			
			String[] names = {"kunaal","kuku","rachana","ruu"};
			int q1 =names.length;
			System.out.println(q1);
			
			System.out.println("----------");
			
			for (int i = 0 ; i < names.length ; i++) {
				System.out.println(names[i]);
			}
			
			System.out.println("----------");
			
			int j = 0;
			while(j < names.length) {
				System.out.println(names[j]);
				j++;
			}
			
			System.out.println("----------");
			for(String name : names) {
				System.out.println(name);
			}
			
			System.out.println("----------");
			
			String State [][] = {
					{"nagpur","pune","bhopal"},
					{"jaipur","mount abu","jammu"}
			};
			System.out.println(State[0][1]);
			
			
 	}

}
