package package1;

class LinearEquation {
	// private double data fields 
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	// Constructor with arguments for a, b, c, d, e, and f 
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){
		this.a = newA;
		this.b = newB;
		this.c = newC;
		this.d = newD;
		this.e = newE;
		this.f = newF;	
	}
	
	// Using the getter methods for accessing the private double data fields
	public double getA() {
		return this.a;
	}
	
	public double getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	public double getD() {
		return this.d;
	}
	
	public double getE() {
		return this.e;
	}
	
	public double getF() {
		return this.f;
	}
	
	// Return true if ad - bc is not 0
	public boolean isSolvable() {
		if (((this.a * this.d) - (this.b * this.c)) == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	// Invoke methods to return the values of x and y 
	public double getX() {
		return ((this.e * this.d) - (this.b * this.f))/((this.a * this.d)  - (this.b * this.c));
	}
	
	public double getY() {
		return ((this.a * this.f) - (this.e * this.c))/((this.a * this.d)  - (this.b * this.c));
	}
}
