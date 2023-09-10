package FunctionAndMethod;

import java.util.Scanner;

public class Method_Exercise_1 {

	public static void main(String[] args) {
		printTile();
		int number = userNum();	
		valuesPrint(number);

	}
	public static void printTile() {
		System.out.println("********************");
		System.out.println("* Method Exercises *");
		System.out.println("********************");
	}
	public static void valuesPrint(int number) {
		int e = number*1000;
		
		System.out.println(e);
		
		
	}
	public static int userNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		
		int numIn = sc.nextInt();
		Scanner close;
		return numIn;

		
	}
	
}
