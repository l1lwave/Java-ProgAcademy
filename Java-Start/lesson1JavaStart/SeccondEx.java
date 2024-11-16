package lesson1JavaStart;

import java.util.Scanner;

public class SeccondEx {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int appleCost = 2;
	    System.out.println("Input apples and press Enter: ");
	    int apples = sc.nextInt();
	    int totalSum;
	    totalSum = appleCost * apples;

	    System.out.println("Apples cost: " + totalSum + " USD");
	  }
}
