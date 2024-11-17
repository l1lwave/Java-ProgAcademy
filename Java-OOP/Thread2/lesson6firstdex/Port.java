package lesson6firstdex;

public class Port {
	private int availableDocks = 2;
	
	public synchronized void enterDock(String shipName) {
        for (; availableDocks == 0 ;) {
        	try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        availableDocks--; 
        System.out.println(shipName + " enters the dock for unloading.");
    }
	
	public synchronized void leaveDock(String shipName) {
        System.out.println(shipName + " finished unloading and leaving the dock.");
        availableDocks++;
        notifyAll();
    }

	public void unloadBoxes(String shipName, int boxesCount) {
        enterDock(shipName);

        for (int i = 1; i <= boxesCount; i++) {
            try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(shipName + " unloads the box " + i);
        }

        leaveDock(shipName); 
    }
}
