public class AccessModifiers {

	    private int a = 1;
	             int b = 2; // default
	    protected int c = 3;
	    public int d = 4;

	    public void display() {
	        System.out.println(a + " " + b + " " + c + " " + d);
	    }
	    public static void main(String[] args) {
	    	AccessModifiers a = new AccessModifiers();
	    	a.display();
	    }
}
