package If_for_while;

import java.util.Scanner;

public class MatrixInput {
	public static void matrixInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert number of row: ");
		int row = sc.nextInt();
		
		System.out.print("Insert number of column: ");
		int column = sc.nextInt();
		
		int [][] matrix = new int[row][column];
		for(int i = 0; i < row;i++) {
			for(int j = 0;j < column;j++) {
				//System.out.println("Insert elements of the matrix. \n");
				
				System.out.printf("Value of matrix [%d][%d] = ",i,j);
				matrix[i][j] = sc.nextInt();
				
				//System.out.println(matrix[i][j]);
			}
		}
		System.out.println("\nIndex of matrix1:\n");
		
		for(int n = 0;n < row;n++) {
			for(int m = 0;m < column;m++) {
				//System.out.printf("_");
				System.out.printf(matrix[n][m] + "|");
				//System.out.printf("_");
				}
			//System.out.printf("-");
            System.out.println();
           // System.out.println("------");
		}
		
	}
	

}
