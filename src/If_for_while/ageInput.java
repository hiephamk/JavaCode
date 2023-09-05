package If_for_while;

import java.util.Scanner;

public class ageInput {
	public static void ageInput() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Insert your information at below:");
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 18) {
			System.out.println("You are underage!");
			System.out.println("**************************");
			if(age < 5) {
				System.out.println("You are a baby!");
			}
			else if(age < 15) {
				System.out.println("You can drive a bicycle!");
			}
			else if(age > 15) {
				System.out.println("You can drive a mooded");
			}
		}
		else if(age > 18) {
			System.out.println("You are an adult!");
			System.out.println("****************************");
			if(age < 65) {
				System.out.println("You are in labor forces");
				System.out.println("You can drive and drink alcohol beverages.");
				
			}
			else if (age > 65) {
				System.out.println("You are retired!!! ");
				}
			System.out.println("****************************");
			}
		}

}


