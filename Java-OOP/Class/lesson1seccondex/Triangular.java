package lesson1seccondex;

public class Triangular {
	private int a;
	private int b;
	private int c;
	
	public Triangular(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangular() {
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public boolean isTriangular() {
		if(a+b>c && c+b>a && a+c>c) {
			return true;
		}
		return false;
	}
	
	public double getArea() {
		double s = (a + b + c) / 2.0; 
	    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	@Override
	public String toString() {
		return "Triangular [a=" + a + ", b=" + b + ", c=" + c + "]";
	}	
	
	
}
