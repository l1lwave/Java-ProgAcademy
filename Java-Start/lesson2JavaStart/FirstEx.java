package lesson2JavaStart;

import java.util.Scanner;

public class FirstEx {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numb1;
	    int numb2;
	    int numb3;
	    int numb4;
	    int maxNumb1;
	    int maxNumb2;

	    System.out.println("input number 1:");
	    numb1 = sc.nextInt();

	    System.out.println("input number 2:");
	    numb2 = sc.nextInt();

	    System.out.println("input number 3:");
	    numb3 = sc.nextInt();
	    
	    System.out.println("input number 4:");
	    numb4 = sc.nextInt();

	    maxNumb1 = numb1;
	    maxNumb2 = numb3;
	    
	    if(maxNumb1 < numb2) {
	    	maxNumb1 = numb2;
	    }
	    if(maxNumb2 < numb4) {
	    	maxNumb2 = numb4;
	    }
	    if(maxNumb1 > maxNumb2) {
	    	System.out.println("Max number = " + maxNumb1);
	    }
	    else {
	    	System.out.println("Max number = " + maxNumb2);
	    }
	       
	  }
}
