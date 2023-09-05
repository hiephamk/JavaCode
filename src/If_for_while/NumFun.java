package If_for_while;

import java.util.Scanner;

public class NumFun {
	public static void numFun() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter an another number: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1*num2;
		int div = num1/num2;
		System.out.println("Sum of 2 numbers is: "+ sum);
		System.out.println("Subtraction of 2 numbers is: " + sub);
		System.out.println("Multiplication of 2 numbers is: "+ mul);
		System.out.println("division of 2 numbers is: " + div);
	}

}
