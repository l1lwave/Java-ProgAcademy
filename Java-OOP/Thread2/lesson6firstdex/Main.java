package lesson6firstdex;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Port port = new Port();

        Ship ship1 = new Ship("Ship 1", port, 10);
        Ship ship2 = new Ship("Ship 2", port, 10);
        Ship ship3 = new Ship("Ship 3", port, 10);

        Thread thread1 = new Thread(ship1);
        Thread thread2 = new Thread(ship2);
        Thread thread3 = new Thread(ship3);

        thread1.start();
        thread2.start();
        thread3.start();
	}

}
