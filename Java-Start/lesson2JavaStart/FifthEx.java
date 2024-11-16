package lesson2JavaStart;

import java.util.Scanner;

public class FifthEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("input number:");
		  int number = sc.nextInt();
		  
		  int numHalf1 = number / 1000;
		  int numHalf2 = number % 1000;
		  
		  int num1 = numHalf1 / 100; 
		  int num2 = numHalf1 / 10;
		  num2 = num2 % 10;
		  int num3 = numHalf1 % 10;
		  
		  int num4 = numHalf2 / 100; 
		  int num5 = numHalf2 / 10;
		  num5 = num5 % 10;
		  int num6 = numHalf2 % 10;
		  
		  if(num1 == num6 && num2 == num5 && num3 == num4) {
			  System.out.println("Your number is polindrome");
		  } else {
			  System.out.println("Your number isn't polindrome");
		  }

		  
	  }
}
