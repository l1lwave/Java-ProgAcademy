package lesson1JavaStart;

import java.util.Scanner;

public class FirstEx {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input side A and press Enter: ");
	    double sideA = sc.nextDouble();
	    System.out.println("Input side B and press Enter: ");
	    double sideB = sc.nextDouble();
	    System.out.println("Input side C and press Enter: ");
	    double sideC = sc.nextDouble();
	    
	    double perimeter;
	    double result;
	    
	    perimeter = (sideA+sideB+sideC)/2;
	    result = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
	    System.out.println("Area of ​​a triangle: " + result);
	  }

}
