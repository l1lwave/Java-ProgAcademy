package lesson3JavaStart;

import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			 
	      System.out.print("Input number: ");
	      int number = sc.nextInt();
	      long factorial = 1;
	      if(number >= 4 && number <= 16) {
	    	  for(int i = number; i >= 1; i--) {
		    	  factorial = factorial * i;
		      }
	    	  System.out.println(factorial);
	      } else {
	    	  System.out.println("Error, try again.");
	      }
	      
	}
}
