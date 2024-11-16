package lesson7JavaStart;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SeccondEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size of array(a x b): ");
		String size = sc.nextLine();
		String[] sizearray = size.split(" x ");
		
		int h = Integer.parseInt(sizearray[0]);
		int w = Integer.parseInt(sizearray[1]);
		
		int[][] numbers = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.println("Element[" + i + "][" + j + "]");
				numbers[i][j] = sc.nextInt();
			}
		}
		
		saveArray(numbers);

		
	}
	
	public static void saveArray(int[][] array) {
		File file = new File("hello.txt");
		
		try (PrintWriter pw = new PrintWriter(file)) {

			for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    pw.print(array[i][j] + " "); 
                }
                pw.println(); 
            }

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
