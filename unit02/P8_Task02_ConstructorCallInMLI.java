package unit02;

public class P8_Task02_ConstructorCallInMLI {
	public static void main(String[] args) {
//		- Create multilevel chain of 3
//		- class A and class C contain both default and parameterised constructor
//		- class B contain only a single parameterised constructor
//		- use super keyword if required
//		- Create object of class C and fix the code if required
		C obj = new C();
	}

}
class A{
	A(){
		System.out.println("deafault constructor of A");
	}
	A(int a,int b){
		System.out.println("parameterised constructor of A");
	}
}
class B extends A{
	B(int a){
		super(2,3);
		System.out.println("parameterised constructor of B");
	}
}
class C extends B{
	C(){
		super(5);
		System.out.println("deafault constructor of C");
	}
	C(int a,int b){
		super(6);
		System.out.println("parameterised constructor of C");
	}
}
