package lesson1JavaStart;

import java.util.Scanner;

public class ThirdEx {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input cost of fuel and press Enter: ");
	    double fuelCost = sc.nextDouble();
	    System.out.println("Enter how much fuel your car uses per 100 km and press Enter (liters): ");
	    int useFuel = sc.nextInt();
	    System.out.println("Enter the distance to the city: ");
	    int distance = sc.nextInt();
	    
	    //Находим расход топлива за 1км
	    double expense = useFuel / 100.0;
	    System.out.println("The car expense for 1km: " + expense + " liters");
	    //Находим расход топлива за расстаяние до города
	    double cityExpense = expense * distance;
	    System.out.println("The car expense to get to the city: " + cityExpense + " liters");
	    //Находим стоимость
	    double result = cityExpense * fuelCost;
	    System.out.println("Total cost: " + result + "USD");
	    
	  }
}
