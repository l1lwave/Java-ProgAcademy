package lesson6firstdex;

class Ship implements Runnable {
    private final String name;
    private final Port port;
    private final int boxsCount;

    public Ship(String name, Port port, int cargoCount) {
        this.name = name;
        this.port = port;
        this.boxsCount = cargoCount;
    }

    @Override
    public void run() {
    	port.unloadBoxes(name, boxsCount);
    }
}
