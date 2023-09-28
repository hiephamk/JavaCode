package If_for_while;

import java.util.Random;
import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		String [] ranName = {"Emma","Julia","John"};
		//System.out.println(ranName[1]);
		int b = rd.nextInt(ranName.length);
		String name = ranName[b];
		System.out.println(ranName[b]);
		
		int i = 0;
		while(true) {
			
			System.out.println("Guess my name (type stop to exit)");
			
			String guessName = sc.nextLine();
			
			if(guessName.equalsIgnoreCase("stop")) {
				//i-=1;
				
				break;
			}
			else if(guessName.equals(name)) {
				System.out.println("Congratulations!");
				i++;
				
				break;
			}
			else {
				i++;
				
			}
			
		}
		System.out.println("You guessed "+i+ " times.");
	}

}
