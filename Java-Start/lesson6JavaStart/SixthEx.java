package lesson6JavaStart;

import java.util.Arrays;

public class SixthEx {
	public static void main(String[] args) {
		combinitionArray(5);
		
	}
	
	public static int findMaxIndex(int[] combinition) {
		for (int i =  combinition.length - 2; i >= 0; i--) {
			if(combinition[i] < combinition[i + 1]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findIndexBiggerElement(int[] combinition, int el) {
		for (int i = combinition.length - 1; i >= 0; i--) {
			if(combinition[i] > el) {
				return i;
			}
		}
		return -1;
	}
	
	public static void swap(int[] combinition, int i, int j) {
		int temp = combinition[i];
		combinition[i] = combinition[j];
		combinition[j] = temp;
	}
	
	public static void reverse(int[] combinition, int index) {
		int shift = index + 1;
		for (int i = 0; i < (combinition.length - shift) / 2; i++) {
			int temp = combinition[shift + 1];
			combinition[shift + 1] = combinition[combinition.length - i - 1];
			combinition[combinition.length - i - 1] = temp;
		}
	}
	
	public static void combinitionArray(int n) {
		int[] combinition = new int[n];
		for (int i = 0; i < combinition.length; i++) {
			combinition[i] = i + 1;
		}
		System.out.println(Arrays.toString(combinition));
		int index = findMaxIndex(combinition);
		for(; index != -1;) {
			int el = combinition[index];
			int swapIndex = findIndexBiggerElement(combinition, el);
			swap(combinition, index, swapIndex);
			reverse(combinition, index);
			System.out.println(Arrays.toString(combinition));
			index = findMaxIndex(combinition);
		}
	}
}
