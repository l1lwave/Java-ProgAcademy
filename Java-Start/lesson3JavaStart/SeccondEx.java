package lesson3JavaStart;

import java.util.Scanner;

public class SeccondEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      System.out.print("Input number: ");
	      int number = sc.nextInt();
	      int res = 1;
	      for(int i = 1; i <= 10; i++) {
	    	  res = i * number;
	    	  System.out.println(i + " x " + number + " = " + res);
	      }
	      
	}
}
