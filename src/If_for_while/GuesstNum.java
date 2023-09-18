package If_for_while;

import java.util.Random;
import java.util.Scanner;

public class GuesstNum {

	public static void main(String[] args) {
		

			
			guessNumber();
			

				

	}
	public static void guessNumber() {
		
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	int dealer = rd.nextInt(10);
	
	System.out.print("Choose a number: ");
	int guessNum = sc.nextInt();
	
	while(guessNum != dealer) {
	
		if(guessNum > dealer) {
			System.out.println("You are wrong, choose another smaller number");
			break;
			}
		
		
		else if(guessNum < dealer) {
			System.out.println("You are wrong, choose another greater number");
			break;
			}
		
	}
		
	if(guessNum == dealer) {
			System.out.println("You won");
			}

	}
	
}

	


