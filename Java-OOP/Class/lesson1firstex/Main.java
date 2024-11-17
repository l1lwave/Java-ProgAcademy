package lesson1firstex;

public class Main {

	public static void main(String[] args) {
		Guitar guitar1 = new Guitar("Gibson", 20000, 6, "Gold");
		Guitar guitar2 = new Guitar("Fender", 25000, 6, "Black");
		Guitar guitar3 = new Guitar("Ibanez", 34000, 8, "Red");
		
		System.out.println(guitar1.playing());
		System.out.println(guitar2.toString());
		System.out.println(guitar3.getName());
	
	}
}
