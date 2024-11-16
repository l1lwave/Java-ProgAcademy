package lesson4JavaStart;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Input length of array: ");
		int n = sc.nextInt();
	    int[] arr1 = new int[n];
	    
	    for (int i = 0; i < arr1.length; i++) {
	      arr1[i] = rnd.nextInt(1, 10);
	    }
	    System.out.println("------- Array 1 -------");
	    System.out.println(Arrays.toString(arr1));
	   	
	    int[] arr2 = Arrays.copyOf(arr1, n*2);
	    
	    for(int i = 0; i < arr2.length/2; i++) {
		    	arr2[i+n] = arr2[i]*2;
	    }
	    System.out.println("------- Array 2 -------");
	    System.out.println(Arrays.toString(arr2));
	}      
}
