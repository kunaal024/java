package dayq;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city = "nagpur";
		switch(city) {
		   case "nagpur":
			   System.out.println("mh");
		   case"indore":
			  System.out.println("MP");
		   case"jaipur":
			   System.out.println("RJ");
		   case"patna":
			   System.out.println("bihar");
		 default:{
			System.out.println("in coorect city");
		}

}
		String city2 = "pune";
		switch(city2){
		case"pune":
			System.out.println("Mh");
			break;
		case"surat":
			System.out.println("gj");
			break;
		case"kerela":
			System.out.println("karanataka");
			break;
		default:{
			System.out.println("error");
		}
		
		String city3 = "jaipur";
		switch(city3) {
		case"jaipur":
		case"udipur":
			System.out.println("rj");
		case"delhi":
			System.out.println("delhi");
		case"aasam":
			System.out.println("north east of india");
		}
			
		}

	}
}