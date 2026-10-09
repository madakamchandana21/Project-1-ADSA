class Ani{
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Cat extends Ani{
	void sleep() {
		System.out.println("Cat is Sleeping");
	}
}
public class Inheritance {

	public static void main(String[] args) {
	    Cat c = new Cat();
		c.eat();
		c.sleep();

	}

}
