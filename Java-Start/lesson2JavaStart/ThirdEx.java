package lesson2JavaStart;

import java.util.Scanner;

public class ThirdEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int sideA;
		  int sideB;
		  int sideC;
		  
		  System.out.println("input side A:");
		  sideA = sc.nextInt();
		  System.out.println("input side B:");
		  sideB = sc.nextInt();
		  System.out.println("input side C:");
		  sideC = sc.nextInt();
		  
		  if(sideA+sideB > sideC && sideA+sideC > sideB && sideB+sideC > sideA) {
			  System.out.println("Such a triangle exists");
		  } else {
			  System.out.println("Such a triangle does not exist");
		  }
	  }
}
