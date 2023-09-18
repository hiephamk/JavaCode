package PeerReview;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		boolean tryAgain = true;
		while(tryAgain) {
			
		
		Scanner sc = new Scanner(System.in);
		
		//enter your first, last name and domain here
		System.out.println("Enter your first name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = sc.nextLine();
		
		System.out.println("Enter you domain:");
		String domain = sc.nextLine();
		
		if(firstName ==""||lastName =="" ||domain=="") {
			System.out.println("*** Error!First name|last name|Domain name is missing.");
		}
		else if(firstName.length()< 4 || lastName.length() < 4) {
			System.out.println("*** You should enter a name which has more than 4 letters!");
		}

		else {
		GenerateEmail(firstName, lastName, domain);	//show your email
		
		GenerateUsername(firstName, lastName);	//show your user name
		
		break;			//The program made all things done, and exit.
		}
		
		//if they input a wrong format they have chances to try again.
		
		System.out.println("Do you want to try again?(y/n)");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("n")) {
			tryAgain = false;
			break;
		}
		
	}
		System.out.println("Thank you!!!");
	}	
	
	
	//create your email from first, last, domain
	public static void GenerateEmail(String a, String b, String c) {
		
		System.out.println("Your email is: "+a.toLowerCase()+"."+b.toLowerCase()+"@"+c.toLowerCase());//print out the lowercase
		
	}
	
	//Create your user id here
	public static void GenerateUsername(String fname, String lname) {
		
		String first = fname.substring(0,4);//get 4 first characters of first name
		String last = lname.substring(lname.length() - 4);//get 4 last characters of last name

		System.out.println("Your user name is: "+(first+last).toLowerCase());//print out the lowercase
		
	}
}


