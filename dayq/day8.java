package dayq;

public class day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food = "tari poha";
		switch(food){
		case"misla pav":
			System.out.println("pune");
		case"tari poha":
			System.out.println("nagpur");
		case"vada pav":
			System.out.println("mumbai");
		
		}
		String food1 = "tari poha";
		switch(food1){
		case"misla pav":
			System.out.println("pune");
			break;
		case"tari poha":
			System.out.println("nagpur");
			break;
		case"vada pav":
			System.out.println("mumbai");
			break;
		default:{
			System.out.println("not knowning");		}
		
	}
		
		String food2 = "tari poha";
		switch(food2){
		case"misla pav":
		case"pav bhaji":
			System.out.println("pune");
		case"tari poha":
		case"chai":
			System.out.println("nagpur");
		case"vada pav":
		case"pani puri":
			System.out.println("mumbai");
		}
		
		

		String food3 = "tari poha";
		switch(food3){
		case"misla pav":
		case"pav bhaji":
			System.out.println("pune");
			break;
		case"tari poha":
		case"chai":
			System.out.println("nagpur");
			break;
		case"vada pav":
		case"pani puri":
			System.out.println("mumbai");
			break;
		default:{
			System.out.println("as you wish");
		}
		}
}
	

}
