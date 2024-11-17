package lesson1firstex;

public class Guitar {
	private String name;
	private int price;
	private int countOfStrings;
	private String color;
	
	public Guitar(String name, int price, int countOfStrings, String color) {
		this.name = name;
		this.price = price;
		this.countOfStrings = countOfStrings;
		this.color = color;
	}
	
	public Guitar() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountOfStrings() {
		return countOfStrings;
	}

	public void setCountOfStrings(int countOfStrings) {
		this.countOfStrings = countOfStrings;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String playing() {
		return "Guitar is playing";
	}

	@Override
	public String toString() {
		return "Guitar [name=" + name + ", price=" + price + ", count of strings=" + countOfStrings + ", color=" + color
				+ "]";
	}
		
}
