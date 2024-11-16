package lesson4JavaStart;

public class FirstEx {
	public static void main(String[] args) {
		int[] arr = new int[] {0,5,2,4,7,1,3,19};
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}      
}
