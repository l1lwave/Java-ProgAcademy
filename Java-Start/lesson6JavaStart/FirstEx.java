package lesson6JavaStart;

import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input array width: ");
	    int n = sc.nextInt();
	    int[] array = new int[n];
	    
	    System.out.println("Input array: ");
	    for(int i = 0; i < n; i++) {
	    	array[i] = sc.nextInt();
	    }

	    int result = getMaxElement(array);
	    
	    System.out.println("Max number from array: " + result);
	  }

	  public static int getMaxElement(int[] array) {
		  int result = array[0];
		  for(int i = 0; i < array.length; i++) {
			  if(array[i] > result) {
				  result = array[i];
			  }
		  }
		  return result;
	  }
}
