package FunctionAndMethod;
import javax.swing.*;
import java.awt.*;

public class Create_table {
	public static void tablePrint() {
		String [] titleCol = {"Items","Amount", "Status"};
        Object [][] table = {
        	{"Items | ","Amount", " | Status"},
            {"Honda | ",new Integer(1000)," | used"},
            {"Toyota | ", new Integer(2500), " | used"},
            {"BMW | ", new Integer(10000), " | used"}
            
        };
        

        int numRows = table.length;
        int numCols = table[0].length;
        System.out.println("----------------------");
        
       
        
        for(int i = 1;i < numRows;i++){
        	for(int j = 0;j < numCols;j++) {
        	
        	System.out.print(table[i][j] + " ");
        	}
        	
        System.out.println();
        System.out.println("----------------------");
       
        }
	}
   public static void main(String[] args) {
	    	
	        tablePrint();
	        
	        
	    }
	}
