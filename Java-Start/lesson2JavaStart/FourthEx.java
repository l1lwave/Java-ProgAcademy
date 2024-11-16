package lesson2JavaStart;

import java.util.Scanner;

public class FourthEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("input number:");
		  int number = sc.nextInt();
		  
		  int numHalf1 = number / 100;
		  int numHalf2 = number % 100;
		  
		  int num1 = numHalf1 / 10;
		  int num2 = numHalf1 % 10;
		  int num3 = numHalf2 / 10;
		  int num4 = numHalf2 % 10;

		  if(num1 + num2 == num3 + num4) {
			  System.out.println("Your number is lucky");
		  } else {
			  System.out.println("Your number isn't lucky");
		  }
		  
	  }
}
