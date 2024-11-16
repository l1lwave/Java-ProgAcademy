package lesson2JavaStart;

import java.util.Scanner;

public class SixthEx {
	public static void main(String[] args) {
		  int r = 4;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("input X:");
		  int x = sc.nextInt();
		  System.out.println("input Y:");
		  int y = sc.nextInt();
		  
		  
		  if(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)) <= r) {
			  System.out.println("The point is on the circle");
		  } else {
			  System.out.println("The point isn't on the circle");
		  }

	  }
}
