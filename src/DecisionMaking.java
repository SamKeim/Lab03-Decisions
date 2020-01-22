
/*
 * 
 * @Author Sam Keim - GitHub @ Samtheenby
 */

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		
		// Start
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to our Decision Maker!");
		System.out.println("What is your name?");
		String name = scnr.nextLine(); //Get user name
		System.out.println("Would you like to use the program, " + name + "? (Y/N)");
		String userChoice = scnr.next();
		
		// Check for breakage
		while (!(userChoice.substring(0,1).equalsIgnoreCase("Y")) && !(userChoice.substring(0,1).equalsIgnoreCase("N"))) {
			System.out.println("Please enter Y or N.");
			userChoice = scnr.next();
		}
		
		// While userchoice begins with "Y"
		while(userChoice.substring(0,1).equalsIgnoreCase("Y")) {
			// Get user number
			System.out.println("Enter a number between 1 and 100:");
			int userNum = scnr.nextInt();
			
			// Decision tree
			String message = "";
			if (userNum < 1 || userNum > 100) {
				message = "Please enter a valid number.";
			}
			else if (userNum > 60 && (userNum % 2) == 1) {
				message = userNum + " is Odd and over 60.";
			}
			else if (userNum > 60 && (userNum % 2) == 0) {
				message = userNum + " is Even and over 60.";
			}
			else if (userNum > 25 && (userNum % 2) == 0) {
				message = "Even.";
			}
			else if (userNum > 1 && (userNum % 2) == 0) {
				message = "Even and less than 25.";
			}
			else if (userNum % 2 == 1) {
				message = userNum + " is Odd.";
			}
			
			System.out.println(message); // Returns result
			
			//Asks user if they would like to continue
			System.out.println("Would you like to continue, " + name + "? (Y/N)");
			userChoice = scnr.next();
			
			//Check for breakage
			while (!(userChoice.substring(0,1).equalsIgnoreCase("Y")) && !(userChoice.substring(0,1).equalsIgnoreCase("N"))) {
				System.out.println("Please enter Y or N.");
				userChoice = scnr.next();
			}
		}
		
		//Exit protocol
		System.out.println("Thank you, goodbye.");
		scnr.close();
	}
}
