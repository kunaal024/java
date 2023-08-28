package dayq;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int number[] = new int[5];
		number[0] = 11;
		number[1] = 12;
		number[2] = 13;
		number[3] = 14;
		number[4] = 15;
		int number1[] = {11, 12, 13, 14, 15};
		int[] number3 = {16, 17, 18, 19, 20};
		
		
		System.out.println(number[2]);
		
		
		number[2] = 22;
		System.out.println(number[2]);
		
		String[] names = {"kunaal", "rachana", "golu", "ruu"};
		int q1 = names.length;
		System.out.println(q1);
		
		
		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
			
		}
		
		//for loop
		
		for(int i = 0; i < names.length; i ++) {
			System.out.println(i);
			//System.out.println(names[i]);
		}
		//while loop
		
		int k1 = 0;
		while(k1 < names.length) {
			System.out.println(names[k1]);
			k1++;
		}
		
		//for each loop
		
		for(String name : names) {
			System.out.println(name);
			
		}
		 //2D Array
		
		String State[][] = {
				{"wardha","nagpur", "pune" },
				{"bhopal", "indor", "jaipur"}
		};
		System.out.println(State);
		
		
		
		
		
	}

}
