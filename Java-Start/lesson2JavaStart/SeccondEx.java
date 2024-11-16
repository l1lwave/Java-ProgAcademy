package lesson2JavaStart;

import java.util.Scanner;

public class SeccondEx {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int floors = 9; 
	      int apartmentsPerFloor = 4; 
	      int entrances = 5;
	      
	      System.out.print("Input number of apartment: ");
	      int apartmentNumber = sc.nextInt();

	      if(apartmentNumber < floors * apartmentsPerFloor * entrances) {
	    	  int entrance = (apartmentNumber - 1) / (floors * apartmentsPerFloor) + 1;
	    	  int floor = ((apartmentNumber - 1) % (floors * apartmentsPerFloor)) / apartmentsPerFloor + 1;
	    	  
	    	  System.out.println("The apartment is located in the entrance " + entrance + " on the " + floor + " floor.");
	      } else {
	    	  System.out.println("There is no such apartment.");
	      }
	  }
}
