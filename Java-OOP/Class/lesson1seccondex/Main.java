package lesson1seccondex;

public class Main {

	public static void main(String[] args) {
		Triangular abc1 = new Triangular(5, 4, 7);
		Triangular abc2 = new Triangular(7, 10, 5);
		Triangular abc3 = new Triangular(9, 2, 10);
		
		if(abc1.isTriangular()) {
			System.out.println(String.format("%.2f", abc1.getArea())); 
		}
		
		if(abc2.isTriangular()) {
			System.out.println(String.format("%.2f", abc2.getArea())); 
		}
		
		if(abc3.isTriangular()) {
			System.out.println(String.format("%.2f", abc3.getArea())); 
		}

	}

}
