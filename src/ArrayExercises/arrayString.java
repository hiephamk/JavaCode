package ArrayExercises;

public class arrayString {

	public static void main(String[] args) {
		String [] arrayColor = {"Green","Blue","Yellow"};
		System.out.println(arrayColor[1]);
		
		for(int i = 0; i < arrayColor.length; i++) {
			System.out.println((i+1) + ". " + arrayColor[i]); 
		}

	}

}
