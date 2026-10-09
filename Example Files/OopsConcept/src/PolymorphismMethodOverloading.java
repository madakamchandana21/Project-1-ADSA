public class PolymorphismMethodOverloading {

		int add(int a, int b) {
			return a+b;
			
		}
		int add(int a, int b, int c) {
			return a+b+c;
		}
		double add(double a, double b) {
			return a*b;
		}
		public static void main(String[] args) {
			PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();
			System.out.println(obj.add(2, 4));
			System.out.println(obj.add(2, 4, 7));
			System.out.println(obj.add(2.5, 4.5));
		}
}
