package lesson2firstex;

public class Cat extends Animal{
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	
	public Cat() {
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
		return "Mey-Mey";
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
		return "Cat [name=" + name + " " + super.toString() + "]";
	}
}
