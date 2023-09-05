package If_for_while;

import java.util.Scanner;

public class TriangleRevert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
            // In ra các dấu cách
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // In ra các dấu sao
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Xuống dòng sau khi in xong hàng
        }
    }
}




