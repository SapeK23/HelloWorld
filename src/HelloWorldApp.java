
public class HelloWorldApp {
	public static int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 21;
		double b = 324;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("a*b > 100 = " + (a*b > 100? true : false));
		
		HelloWorldApp.a = (int)a;
		System.out.println("a before = " + HelloWorldApp.a);
		TestZmienna.cos(); 
		System.out.println("a after = " + HelloWorldApp.a);
		
	}

}
