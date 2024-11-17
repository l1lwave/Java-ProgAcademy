package lesson5firstex;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
  private int number;

  public FactorialTask(int number) {
    super();
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public BigInteger factCalculate(int n) {
    BigInteger fact = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {

      fact = fact.multiply(BigInteger.valueOf(i));
    }
    return fact;
  }

  @Override
  public void run() {
    Thread thr = Thread.currentThread();
    BigInteger fact = factCalculate(number);
    System.out.println(thr.getName() + "\t" + number + "!=" + fact);
  }

}
