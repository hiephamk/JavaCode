package ArrayList;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String aphorism1 = "Actions speak louder than words.";
	String aphorism2 = "A barking dog never bites.";
	String aphorism3 = "A penny saved is a penny earned.";
	String aphorism4 = "All things come to those who wait.";
	
	System.out.println("Pick number from 1 -4.");
	int pickNum = sc.nextInt();
	if(pickNum == 1) {
		System.out.println(aphorism1);
	}
	else if(pickNum == 2) {
		System.out.println(aphorism2);
	}
	else if(pickNum == 3) {
		System.out.println(aphorism3);
	}
	else if(pickNum == 4) {
		System.out.println(aphorism4);
	}
	

	}

}
