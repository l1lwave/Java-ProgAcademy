package lesson6JavaStart;

import java.util.Scanner;

public class ThirdEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input array height: ");
	    int h = sc.nextInt();
		System.out.println("Input array width: ");
	    int w = sc.nextInt();
	    
	    char[][] result = getStarRectangle(w, h);
	    
	    for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
	  } 	

	 public static char[][] getStarRectangle(int w, int h) {
	        char[][] result = new char[h][w];
	        for(int i = 0; i < h; i++) {
	            for(int j = 0; j < w; j++) {
	                result[i][j] = '*'; 
	            }
	        }
	        return result;
	    }
}
