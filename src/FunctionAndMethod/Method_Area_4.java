package FunctionAndMethod;

import java.util.Scanner;

public class Method_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input width and length:");
		int width = sc.nextInt();
		int length = sc.nextInt();
		AreaPrint(width,length);
	}
	public static void AreaPrint(int width, int length) {
		int area = width*length;
		System.out.println("The area is: " + area);
		
	}

}
