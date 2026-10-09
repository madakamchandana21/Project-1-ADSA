class Animal{
	void sound() {
		System.out.println("Animal make sounds");
	}

}
class Dog extends Animal{
	
	@Overrride
	void sound() {
		System.out.println("Dog sounds barks");
	}
}

class PolymorphismOverriding {
	public static void main(String[] args) {
	Animal obj = new Dog();
	Animal obj1 = new Animal();
	obj1.sound();
	obj.sound();
	}
}
