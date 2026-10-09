abstract class Shape{
	abstract void area();
}
class Circle extends Shape{
	@Override
	void area() {
		double r = 2.5;
		System.out.println("Area of Circle: " + (3.14 * r * r))	;
	}
}
class Square extends Shape {
	@Override
	void area() {
		int side = 5;
		System.out.println("Area of a Square: " + (side * side));
	}
}
public class ShapeArea {

	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.area();
		s = new Square();
		s.area();
		
	}
}

