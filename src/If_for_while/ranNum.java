package If_for_while;

import java.util.Random;
import java.util.Scanner;

public class ranNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		boolean multiChoice = true;
		while(multiChoice) {
			playGame();
			
	System.out.println("---------------------------------------------");
	System.out.print("Do you want to continue with a new game?(y/n): ");
	String playAgain = sc.next();
	System.out.println("---------------------------------------------");
	if(playAgain.equalsIgnoreCase("n")) {
		multiChoice = false;
		}
	}
}

	public static int[] ranNumber(Random rd, int ranNum) {
		int [] results = new int[ranNum];
		for(int i = 0; i < ranNum; i++) {
			results[i] = rd.nextInt(10);
			//System.out.print(results[i]+ " ");
		}
		return results;
	}
	
	
	public static void playGame() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.print("How much money do you want to spend??? ");
		int balance = sc.nextInt();
		
		System.out.print("Game cost: ");
		int gameCost = sc.nextInt();
		
		System.out.print("Please guests a number in range 0 - 9: ");
		int guestNum = sc.nextInt();
			
		while(balance >= gameCost) {
			int count = 0;
			int reward1 = gameCost * 2;
			int reward2 = gameCost * 3;
			int reward3 = gameCost * 5;
		
			
			System.out.println("---------------------------------");
			System.out.print("Continue or not?(y/n): ");
			
			String choice = sc.next();
			System.out.println("---------------------------------");
			if(choice.equalsIgnoreCase("y")) {
				balance -= gameCost;
				
				System.out.println("Hoora!!! The lottey result is:");
				int [] printRanNum = ranNumber(rd,3);
				for(int i = 0; i < printRanNum.length;i++) {
					System.out.print(printRanNum[i] + " ");
					}
				
				for(int j=0;j < printRanNum.length;j++) {
					if(printRanNum[j]== guestNum) {
						count++;
						}
				}
				
				System.out.println("\nThere are "+ count +" number " + guestNum);
				
				if(count == 0) {
					System.out.println("You failed!!! You balance is: " + balance + " €");
					}
				else if(count == 1) {
					balance += reward1;
					System.out.println("*** CONGRATULATION!!! ***");
					System.out.println("You won " + reward1 + " €! Your balance is: " +balance + " €");
				}
				else if(count == 2) {
					balance += reward2;
					System.out.println("*** CONGRATULATION!!! ***");
					System.out.println("You won " + reward2 + " €! Your balance is: " +balance + " €");
				}
				else if(count == 3) {
					balance += reward3;
					System.out.println("*** CONGRATULATION!!! ***");
					System.out.println("You won " + reward3 + " €! Your balance is: " +balance + " €");
				}
			}
			else {
				System.out.println("Thank you for playing the game.");
				break;
			}	
		}
		
			System.out.println("The game stopped!!");
			
	}
}
	

		


