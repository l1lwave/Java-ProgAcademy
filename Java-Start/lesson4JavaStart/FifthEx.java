package lesson4JavaStart;

import java.util.Random;
import java.util.Scanner;

public class FifthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("Input size of array: ");
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
	    
	    for (int i = 0; i < size; i++) {
	    	for(int j = 0; j < size; j++ ) {
	    		arr[i][j] = rnd.nextInt(0, 9);
	    	}
	    }
	    
	    System.out.println("------- Array -------");
	    for (int i = 0; i < size; i++) {
	    	for(int j = 0; j < size; j++ ) {
	    		System.out.print(arr[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    

		int startIndex = 0;
	    int endIndex = arr.length - 1;
	    int middleIndex = (startIndex + endIndex) / 2;
	    
			System.out.println("Choose rotate of array: ");	    
		    System.out.println("1) 90");
		    System.out.println("2) 180");
		    System.out.println("3) 270");
			int a = sc.nextInt();
			
			if(a == 1) {
				for (int i = 0; i < size; i++) {
			    	for(int j = i; j < size; j++ ) {
			    		int temp = arr[i][j];
			    		arr[i][j] = arr[j][i];
			    		arr[j][i] = temp;
			    	}
			    }
			    
			    for (int i = 0; i < size; i++) {
		            for (int j = 0; j <= middleIndex; j++) {
		                int temp = arr[i][j];
		                arr[i][j] = arr[i][endIndex + startIndex - j];
		                arr[i][endIndex + startIndex - j] = temp;
		            }
		        }
			    
			    System.out.println("------- Revers 90 Array -------");
			    for (int i = 0; i < size; i++) {
			    	for(int j = 0; j < size; j++ ) {
			    		System.out.print(arr[i][j] + " ");
			    	}
			    	System.out.println();
			    }    
			} else if(a == 2) {    
			    for (int i = 0; i <= middleIndex; i++) {
		            for (int j = 0; j < size; j++) {
		                int temp = arr[i][j];
		                arr[i][j] = arr[endIndex + startIndex - i][endIndex + startIndex - j];
		                arr[endIndex + startIndex - i][endIndex + startIndex - j] = temp;
		            }
		        }
			    
			    if (size % 2 != 0) {
			        for (int j = 0; j < middleIndex; j++) {
			            int temp = arr[middleIndex][j];
			            arr[middleIndex][j] = arr[middleIndex][endIndex - startIndex - j];
			            arr[middleIndex][endIndex - startIndex - j] = temp;
			        }
			    }
			    
			    System.out.println("------- Revers 180 Array -------");
			    for (int i = 0; i < size; i++) {
			    	for(int j = 0; j < size; j++ ) {
			    		System.out.print(arr[i][j] + " ");
			    	}
			    	System.out.println();
			    }
			} else if(a == 3){
				
				for (int i = 0; i < size; i++) {
			    	for(int j = i; j < size; j++ ) {
			    		int temp = arr[i][j];
			    		arr[i][j] = arr[j][i];
			    		arr[j][i] = temp;
			    	}
			    }
				
				for (int j = 0; j < size; j++) {
		            for (int i = 0; i <= middleIndex; i++) {
		                int temp = arr[i][j];
		                arr[i][j] = arr[endIndex + startIndex - i][j];
		                arr[endIndex + startIndex - i][j] = temp;
		            }
		        }
				
			    
				System.out.println("------- Revers 270 Array -------");
			    for (int i = 0; i < size; i++) {
			    	for(int j = 0; j < size; j++ ) {
			    		System.out.print(arr[i][j] + " ");
			    	}
			    	System.out.println();
			    }  
			} else {
				System.out.println("Error. Try again");
			}	
	    
	    
	    
	    sc.close();
	}      
}
