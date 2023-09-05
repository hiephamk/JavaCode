package ArrayExercises;

public class arrayInt {

	public static void main(String[] args) {
		
		int [] arrayInt = {16,18,5,7,10};
		int minNum = arrayInt[0];
		for(int i = 0;i < arrayInt.length; i++) {
			if(minNum > arrayInt[i]) {
				minNum = arrayInt[i];
			}
		
		}
		System.out.println(minNum);
	}

	
}
