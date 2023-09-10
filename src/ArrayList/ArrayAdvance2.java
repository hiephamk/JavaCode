package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAdvance2 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	ArrayList<String> itemList = new ArrayList<String>();
	boolean addItem = true;
	while (addItem) {
		
		
		
		System.out.println("Add item (x = exit)");
		String item = sc.nextLine();

		if(item.equalsIgnoreCase("x")) {
			addItem = false;
			break;
		}
		itemList.add(item);
	}
	for(String i:itemList) {
		System.out.println(i);
		}
	}

}
