package lesson3JavaStart;

import java.util.Scanner;

public class FourthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input height: ");
	    int h = sc.nextInt();
	    int space = 1;
	    int iterator = 1;
	    int direction = 1;
	    
	    for(int i=1; i < h*h+1; i++) {
	    	System.out.print("*");
	    	if(space == i) {
		    	System.out.println();
		    	if(direction<h) {
		    		direction++;
		    		iterator++;
		    	} else {
		    		iterator--;
		    	}
		    	space += iterator;
	    	}
	    }
	}
}
