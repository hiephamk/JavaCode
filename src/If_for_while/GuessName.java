package If_for_while;

import java.util.Scanner;

public class GuessName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "Emma";
		int i = 1;
		while(true) {
			
			System.out.println("Guess my name (type stop to exit)");
			
			String guessName = sc.nextLine();
			
			if(guessName.equalsIgnoreCase("stop")) {
				i-=1;
				
				break;
			}
			else if(guessName.equals(name)) {
				System.out.println("Congratulations!");
				
				break;
			}
			else {
				i++;
				
			}
			
		}
		System.out.println("You guessed "+i+ " times.");
	}

}
