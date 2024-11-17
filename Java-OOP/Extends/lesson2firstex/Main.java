package lesson2firstex;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Whiskas", "Grey", 20, "Jhon");
		Dog dog = new Dog("Meat", "Black", 40, "Penny");
		Veterinarian vet = new Veterinarian("Dr. Mike");
		
		System.out.println("_____CAT_____");
		System.out.println(cat.toString());
		System.out.println(cat.getVoice());
		cat.eat();
		cat.sleep();
		System.out.println("_____DOG_____");
		System.out.println(dog.toString());
		System.out.println(dog.getVoice());
		dog.eat();
		dog.sleep();
		System.out.println("_____VETERINARIAN_____");
		vet.treatment(cat);
		vet.treatment(dog);
		

	}

}
