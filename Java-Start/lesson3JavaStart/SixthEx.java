package lesson3JavaStart;

import java.util.Scanner;

public class SixthEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		double n = sc.nextDouble();
		double err = 0.0001;
		
		int x = (int) Math.log10(n);
		double r;
		if(x % 2 == 0) {
			r = 6.0 * Math.pow(10, (x - 2)/2);
		} else {
			r = 2.0 * Math.pow(10, (x - 1)/2);
		}
		
		double x0 = (r * r * (r * r + 6 * n) + n * n) / (4 * r * (r * r + n));
		double x1 = r;
		double a;
		double b;
		double d = Math.abs(x1 - x0);
		for(; d > 2 * err && d * d > 2 * err;) {
			a = (n - x0 * x0) / (2 * x0);
			b = x0 + a;
			x1 = b - (a * a) / (2 * b);
			d = Math.abs(x1 - x0);
			x0 = x1;
		}
		
		System.out.println(x1);
		System.out.println(Math.sqrt(n));
	}
}
