package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayEdit {

	public static void main(String[] args) {
		String car = "Mecedes";

			    ArrayList<String> cars = new ArrayList<String>();
			    cars.add("Kia");
			    cars.add("Tesla");
			    cars.add("BMW");
			    cars.add("Renault");

			    for(String list : cars) {
			    	System.out.println(list);
			    }
			    
			    System.out.println("MODIFIED LIST");
			    cars.add(0,car);
			    cars.add(1,"Ford");
			    cars.remove(2);
			    cars.set(2,"Audi");
			    
			    for(String modlist:cars) {
			    	System.out.println(modlist);
			    }
			    
			    System.out.println("SORTED LIST");
			    
			    Collections.sort(cars);
			    for(String sortList : cars) {
			    	System.out.println(sortList);
			    }
			    
			    

			}
		}

