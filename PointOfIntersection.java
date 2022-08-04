package package1;
import java.util.Scanner;

public class PointOfIntersection {
	public static void main(String[] args) {
		// User Inputs for all 4 points 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Computing the values of a, b, c, d, e, f for applying cramer's rule 
		double a = y1 - y2;
		double b = x2 - x1;
		double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
		double c = y3 - y4;
		double d = x4 - x3;
		double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);
		
		// Create an object of type, LinearEquation with arguments a, b, c, d, e, and f
		LinearEquation object1 = new LinearEquation(a, b, c, d, e, f);
		
		// Check if the linear equations are solvable 
		if (object1.isSolvable()) {
			System.out.printf("The intersecting point is at (%.5f, %.4f)\n", object1.getX(), object1.getY());
		} else {
			System.out.println("The two lines are parallel");
		}
	}
}
