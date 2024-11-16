package lesson6JavaStart;

import java.util.Scanner;

public class SeccondEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[] {2, 3, -6, 34, -6, 12, 17, 10, 4, 5, 7};
		System.out.println("Input element to find: ");
	    int e = sc.nextInt();
	    
	    System.out.println("Index = " + findElement(array, e));
	  } 	

	 public static int findElement(int[] array, int e) {
		 	for(int i = 0; i < array.length; i++) {
		 		if(array[i] == e) {
		 			return i;
		 		}
		 	}
		 	return -1;
	    }
}
