package lesson5seccondex;

public class SumTask implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int partialSum;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public int getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
        System.out.println(thr.getName() + " calculated partial sum: " + partialSum);
    }
}
