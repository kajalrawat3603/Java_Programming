package unit01;

public class P2_Task02_ConstantsInJava {
	final int b=10;
	private static final double Pi = 3.14;
	protected static final double Pi2 = 3.14;
	public static final double Pi3 = Math.PI;
	public static void main(String[] args) {
		//b=11;				//global variable 
							//Cannot make a static reference to the non-static field b
		final int a=10;		//local variable
		//a=11;				//The final local variable a cannot be assigned. It must be blank and not using a compound assignment

		System.out.println(Pi);
	}
}
