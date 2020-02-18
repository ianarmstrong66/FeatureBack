package Feature.access;

import Business.checkMate;

public class CheckMateTest {
	
	public static boolean getCheckResponse;

	public static void main(String[] args) throws Exception {
		checkMate CM = new checkMate();
		getCheckResponse = CM.getCheckMate("10001", "BlueYonder");
		
		if (getCheckResponse == true) {
			System.out.println(" User 1 - You have successfully logged in");
		} else {
			System.out.println("User 1 - Failed, try again");
		}
		
		CM = new checkMate();

		getCheckResponse = CM.getCheckMate("10002", "BlueYonder");
		
		if (getCheckResponse == true) {
			System.out.println(" User 2 - You have successfully logged in");
		} else {
			System.out.println("User 2 - Failed, try again");
		}	

	}

}