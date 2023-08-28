package dayq;

public class ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int number[] = new int[5];
		
		number[0] = 1;
		number[1] = 2;
		number[2] = 3;
		number[3] = 4;
		number[4] = 5;
		System.out.println(number[1]);		
		
		String name[] = new String[4];
		name[0] ="kunaal";
		name[1] = "rachana";
		name[2] = "both";
		name[3] = "are made for each other";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		
		String names[] = {"kunaal","rachana","golu","kuki"};
		
		System.out.println(names[1]);
		
		
		
		
		for(int i = 1 ; i<=3 ; i++) {
			System.out.println(i);
		}
		
		String name1 [][]= {
				{"jaipur", "bhopal", "kholapur"},
				{"indore","nagpur","patnA"},
		};
		System.out.println(name1[1][1]);
		
		
		String name2[][][] = {
				{
					{"pune1","nagpur1"},
					{"bhopal1","hungeriyan1"},
					{"patna1","jaipur1"},
				},
				{
					{"pune2","nagpur2"},
					{"bhopal2","hungeriyan2"},
					{"patna2","jaipur2"},
					
				},
				{
					{"pune","nagpur"},
					{"bhopal","hungeriyan"},
					{"patna","jaipur"},
				},
		};
		
		System.out.println(name2[0][0][1]);
		
		
		
		
		
	}

}
