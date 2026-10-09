public class AreaCalculator {
	void area(int side) {
		System.out.println("Area of Square: " +(side * side));
	}
	void area(float side) {
		System.out.println("Area of Cube: " +(side * side * side));
	}
	void area(double length, double breadth) {
		System.out.println("Area of Rectangle: " + (length * breadth));
	}
	void area(double radius) {
		System.out.println("Area of Circle: " +(3.14 * radius * radius));
	}
	public static void main(String[] args) {
		AreaCalculator obj = new AreaCalculator();
		obj.area(6);
		obj.area(6.8);
		obj.area(6.8, 4.7);
		obj.area(2.1);
	}
}
