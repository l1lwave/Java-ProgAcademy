package lesson6JavaStart;

import java.util.Scanner;

public class FourthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input array width: ");
	    int n = sc.nextInt();
	    int[] array = new int[n];
	    
	    System.out.println("Input array: ");
	    for(int i = 0; i < n; i++) {
	    	array[i] = sc.nextInt();
	    }
	    
	    int result = getNextElement(array);
	    if(result != -1) {
	    	System.out.println("Next element: " + result);
	    } else {
	    	System.out.println("Error. It isn't progration.");
	    }
	    
	  } 	
	
	public static boolean isArithmetic(int[] array) {
		if (array.length < 2) return false;
		int el = array[1] - array[0];
		for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != el) {
                return false;
            }
        }
		return true;
	}
	
	public static boolean isGeometric(int[] array) {
	    if (array.length < 2) return false;
	    if (array[0] == 0) {
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] != 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    double ratio = (double) array[1] / array[0];
	    for (int i = 2; i < array.length; i++) {
	        if (array[i - 1] == 0 || ((double) array[i] / array[i - 1]) != ratio) {
	            return false;
	        }
	    }
	    return true;
	}

	public static boolean isDegree(int[] array) {
	    if (array.length < 2) return false;
	    if (array[0] == 0) {
	        return false;
	    }
	    double ratio = (double) array[1] / array[0];
	    int k = (int) Math.round(Math.log(ratio) / Math.log(2));
	    for (int i = 1; i < array.length; i++) {
	        double expected = Math.pow(i + 1, k);
	        if (Math.abs(array[i] - expected) > 1e-6) {
	            return false;
	        }
	    }
	    return true;
	}


	public static int getNextElement(int[] array) {
		int element = 0;
		int width = array.length;
		if(isArithmetic(array)) {
			element = array[width-1] + array[1]-array[0];
			return element;
		} else if(isGeometric(array)) {
			if(array[0] != 0) {
				element = array[width-1] * array[1]/array[0];
				return element;
			}
			return -1;
		} else if(isDegree(array)) {
			int k = (int) Math.round(Math.log(array[1] / array[0]) / Math.log(2));
			int nextN = array.length + 1;
			element = (int) Math.pow(nextN, k);
			return element;
		} 
		return -1;
	}
}
