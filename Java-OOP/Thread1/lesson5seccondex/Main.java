package lesson5seccondex;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
        long totalSum = 0;
        
		System.out.println("main start");
		
		System.out.print("Input array size: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        
        System.out.print("Input count of threads: ");
        int numberOfThreads = sc.nextInt();
	    
	    for (int i = 0; i < arrayLength; i++) {
	       array[i] = random.nextInt(100); 
	    }
	    
	    System.out.println("--------MultiThread Sum--------");
        int chunkSize = arrayLength / numberOfThreads;
        
        SumTask[] tasks = new SumTask[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];
        
        for (int i = 0; i < numberOfThreads; i++) {
            int start = i * chunkSize;
            int end;
            
            if(i == numberOfThreads - 1) {
            	end = arrayLength;
            } else {
                end = start + chunkSize;
            }

            tasks[i] = new SumTask(array, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        
        try {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < tasks.length; i++) {
            totalSum += tasks[i].getPartialSum();
        }

        System.out.println("Total sum of array = " + totalSum);
        System.out.println("main end");

        System.out.println("--------Default Sum--------");
    	long sum = array[0];
    	for (int i = 0; i < array.length; i++) {
    	  sum += array[i]; 
    	}
    	
    	System.out.println("Total sum of array = " + totalSum);
    	
    	sc.close();
	}

}
