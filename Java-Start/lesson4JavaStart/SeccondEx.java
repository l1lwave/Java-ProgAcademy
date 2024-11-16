package lesson4JavaStart;

import java.util.Scanner;

public class SeccondEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w, h;
		
		System.out.println("Input height of Array: ");
		h = sc.nextInt();
		System.out.println("Input width of Array: ");
		w = sc.nextInt();
		
		int[][] arr = new int[h][w];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Input element [" + i + ", " + j + "]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------- Print Array -----------");
		
		for(int[] row : arr) {
			for(int el : row){
				System.out.print(el + " ");
			}
			System.out.println();
		}
	}  
}
