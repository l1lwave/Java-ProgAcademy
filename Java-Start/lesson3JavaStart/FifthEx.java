package lesson3JavaStart;

import java.util.Scanner;

public class FifthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height: ");
	    int w = sc.nextInt();
	    if(w % 2 != 0) {
	    	for (int i = 0; i < w; i++) {
				for (int j = 0; j < w; j++) {
					if (i < w / 2 + 1) {
						if (j < i || (i + j) >= w) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					} else if ((i + j) < w - 1 || (i -j) < 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	    } else {
	    	System.out.println("ERROR");
	    }
	}
}
