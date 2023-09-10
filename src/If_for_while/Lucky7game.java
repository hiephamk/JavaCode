package If_for_while;

import java.util.Random;
import java.util.Scanner;

public class Lucky7game {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        Random rd = new Random();
		        
		        System.out.println("How much money do you want to spend?");
		        int money = sc.nextInt();
		        
		        System.out.println("Game cost:");
		        int cost = sc.nextInt();

		        while (money >= cost) {
		            System.out.println("Your balance is: " + money+"€");
		            System.out.print("Do you want to continue? (y/n): ");
		            String playAgain = sc.next();

		            if (playAgain.equalsIgnoreCase("y")) {
		                // when player want to continue playing, their money will be decreased 1 money
		                money -= cost;

		                // create random numbers
		                int[] results = ranNum(rd, 3);
		                System.out.print("Result: ");
		                for (int i = 0; i < results.length; i++) {
		                    System.out.print(results[i] + " ");
		                }
		                System.out.println();
		                int count = 0;
		                for(int i = 0;i<3;i++) {
		                	if(results[i]==7) {
		                		count++;
		                	}
		                	
		                }
		                System.out.println("There are "+count+" number 7");

		  //check the result
		                if (count == 0) {
		                    System.out.println("You failed!!");
		                    //money += 3;
		                } 
		                else if (count == 1) {
		                    System.out.println("You won 3€ !!");
		                    money += 3;
		                } 
		                else if (count == 2) {
		                    System.out.println("You won 5€ !!");
		                    money += 5;
		                }
		            else if (count == 3) {
	                    System.out.println("You won 10€ !!");
	                    money += 10;
	                }
		            } 
		            else {
		                System.out.println("Thank you for your playing!!");
		                break;
		            }
		        }

		        System.out.println("Stopping game!!");
		    }

		    public static int[] ranNum(Random rd,int ranNum1) {

		        int[] results = new int[ranNum1];
		        for (int i = 0; i < ranNum1; i++) {
		            results[i] = rd.nextInt(10);
		        }
		        return results;
		    }
		}
