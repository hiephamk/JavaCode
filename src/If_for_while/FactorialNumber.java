package If_for_while;


import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		factorialNumber();
	}
	public static void factorialNumber() {
		
		//int num = 1;
        int num;
        System.out.print("Enter the number to calculate the factorial: ");
        try (Scanner scanner = new Scanner(System.in)) {
            num = scanner.nextInt();
        }
		long fact = 1;
		if(num != 0) {
			for(int i = 1;i<= num;i++) {
			fact = fact*i;

			}
		}
	System.out.println("Factorial of "+num+ " is "+ fact);

	}

}
