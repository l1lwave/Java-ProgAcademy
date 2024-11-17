package lesson5firstex;

public class Main {

	public static void main(String[] args) {
		System.out.println("main start");
		FactorialTask[] tasks = new FactorialTask[100];
		Thread[] threads = new Thread[100];
		
		for (int i = 0; i < tasks.length; i++) {
			FactorialTask task = new FactorialTask(i);
			tasks[i] = task;
			threads[i] = new Thread(task);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();;
		}
				
		System.out.println("main end");
	}
}
