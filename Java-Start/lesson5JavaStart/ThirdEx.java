package lesson5JavaStart;

public class ThirdEx {
	public static void main(String[] args) {
		String result = "";
		for(int i = 2; i <= 11; i++) {
			result = String.format("%." + i + "f", Math.PI);
			System.out.println(result);
		}  
	}      
}
