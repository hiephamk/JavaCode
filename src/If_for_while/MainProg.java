package If_for_while;

import java.util.Scanner;

public class MainProg {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean userInput = true;
			
			while(userInput){
				System.out.println("\nDo exercises!!");
				
				System.out.println("\n********************************************");

				NumFun.numFun();
				System.out.println("\n********************************************");
				System.out.println("\nContinue with next task!");
				TernaryOperator.ternaryOperator();
				System.out.println("\n********************************************");
				System.out.println("\nContinue with next task!");
				MatrixInput.matrixInput();
				System.out.println("\n********************************************");
				
				System.out.println("\nContinue with next task!");
				ageInput.ageInput();
				System.out.println("\n********************************************");
				
				System.out.println("\nContinue with next task!");
				FactorialNumber.factorialNumber();
				
				System.out.print("\nDo you want to continue? (y/n): ");
				String choice = sc.nextLine();
				if(choice.equalsIgnoreCase("n")) {
					userInput = false;
				}

			}
		}
		System.out.println("The program was stopped.");


	

	}

}
