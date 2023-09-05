package If_for_while;

import java.util.Scanner;

public class TernaryOperator {
	public static void ternaryOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out the min of 3 numbers?");
		
		System.out.print("First Number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Third number: ");
		int num3 = sc.nextInt();
		
		int tempNum1 = num1 < num2 ? num1:num2;
		int minNum = num3 < tempNum1 ? num3:tempNum1;
		
		int tempNum2 = num1 > num2 ? num1:num2;
		int maxNum = num3 > tempNum2 ? num3:tempNum2;
		
		System.out.println("The smallest of the three numbers is: "+ minNum);
		System.out.println("The greatest of the three numbers is: "+ maxNum);
		
	}

}
