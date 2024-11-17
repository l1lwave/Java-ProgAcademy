package lesson2firstex;

public class Dog extends Animal{
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	
	public Dog() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getVoice() {
		return "Bark-Bark";
	}
	
	@Override
	public void eat() {
		System.out.println(this.name + " eats");
	}
	
	@Override
	public void sleep() {
		System.out.println(this.name + " sleeps");
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + " " + super.toString() + "]";
	}
}
