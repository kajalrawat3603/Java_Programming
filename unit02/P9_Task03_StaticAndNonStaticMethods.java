package unit02;

public class P9_Task03_StaticAndNonStaticMethods {

	public static void main(String[] args) {
//		  - Illustrate the best ways to call
//		  - static methods
//		  - non-static methods
		A.s1();
		A obj = new A();
		obj.s2();
	}
	static class A{
		int a=10;
		static int c=20;
		A(){
			c++;
		}
		static void s1() {
			System.out.println("static method c="+c);
		}
		void s2() {
			System.out.println("non-static method c = "+c+"and a = "+a);
		}
	}

}
