class Bank{
	void interest() {
		System.out.println("General interest");
	}
}
class HDFC extends Bank{
	@Override
	void interest() {
		System.out.println("Interest percent is 7%");
	}
}
class SBI extends Bank {

	@Override
	void interest() {
		System.out.println("Interest percent is 8%");
	}
}
public class Main {

	public static void main(String[] args) {
		Bank obj2 = new Bank();
		Bank obj = new HDFC();
		Bank obj1 = new SBI();
		obj2.interest();
		obj1.interest();
		obj.interest();
		
		

	}

}
