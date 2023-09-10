package ArrayExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAdvance1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Throw length");
		float throw1 = sc.nextFloat();
		
		System.out.println("Throw length");
		float throw2 = sc.nextFloat();
		
		System.out.println("Throw length");
		float throw3 = sc.nextFloat();
		
		ArrayList<Float> ThrowLength = new ArrayList<Float>();
		ThrowLength.add(throw1);
		ThrowLength.add(throw2);
		ThrowLength.add(throw3);
		
		for (int i = 0; i < ThrowLength.size(); i ++) {
			System.out.println("Throw "+(i+1)+": " + ThrowLength.get(i));
		}

	}

}
