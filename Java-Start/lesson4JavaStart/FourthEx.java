package lesson4JavaStart;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FourthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Input length of array: ");
		int N = sc.nextInt();
	    int[] arr = new int[N];
	    
	    for (int i = 0; i < arr.length; i++) {
	      arr[i] = rnd.nextInt(-3, 10);
	    }
	    System.out.println("------- Array -------");
	    System.out.println(Arrays.toString(arr));
	   	
	    int startIndex = 0;
	    int endIndex = arr.length - 1;
	    int middleIndex = (startIndex + endIndex) / 2;
	    for(int i = startIndex; i <= middleIndex; i++) {
	    	int temp = arr[i];
	    	arr[i] = arr[endIndex + startIndex - i];
	    	arr[endIndex + startIndex - i] = temp;
	    }
	    
	    System.out.println("------- Reverse Array -------");
	    System.out.println(Arrays.toString(arr));
	    
	    sc.close();
	}      
}
