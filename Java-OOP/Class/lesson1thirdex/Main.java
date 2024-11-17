package lesson1thirdex;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone("+38(099)1234567", "Samsung");
		Phone phone2 = new Phone("+38(095)9992132", "Iphone");
		Network network = new Network();
		
		phone1.register(network);
		phone2.register(network);
		
		phone1.takeCall("+38(095)9992132");
		
		System.out.println();
		
		phone2.takeCall("+38(099)1234567");
	}

}
