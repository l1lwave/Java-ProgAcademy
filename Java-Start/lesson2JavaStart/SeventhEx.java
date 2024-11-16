package lesson2JavaStart;

import java.util.Scanner;

public class SeventhEx {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			double ax = 0;
			double ay = 0;
			double bx = 4;
			double by = 4;
			double cx = 6;
			double cy = 1;
			double res1;
			double res2;
			double res3;
			
			System.out.println("input x:");
			double x = sc.nextDouble();
			System.out.println("input y:");
			double y = sc.nextDouble();

			res1 = (ax - x)*(by-ay)-(bx-ax)*(ay - y);
			res2 = (bx - x)*(cy-by)-(cx-bx)*(by - y);
			res3 = (cx - x)*(ay-cy)-(ax-cx)*(cy - y);
			
			if ((res1 > 0 && res2 > 0 && res3 > 0) || (res1 < 0 && res2 < 0 && res3 < 0)) {
				System.out.println("The point lies inside the triangle");
			} else {
			        System.out.println("The point does not lie inside the triangle");
			}

	  }
}
