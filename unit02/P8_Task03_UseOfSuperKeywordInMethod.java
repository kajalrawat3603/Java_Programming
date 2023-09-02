package unit02;

public class P8_Task03_UseOfSuperKeywordInMethod {

	public static void main(String[] args) {
//		- try to call super() from method area
//		- copy the error and paste just above the line where you have used super()
		m2 obj = new m2();
		obj.fun();

	}

}
class m1{
	m1(){
		System.out.println("deafault constructor of m1");
	}
	m1(int a,int b){
		System.out.println("parameterised constructor of m1");
	}
}
class m2 extends m1{
	m2(){
		super(2,3);
		System.out.println("parameterised constructor of m1 call by m2");
	}
void fun() {
	//super();
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		Constructor call must be the first statement in a constructor
//
//		at JavaPrograming/unit02.m2.fun(P8_Task03_UseOfSuperKeywordInMethod.java:28)
//		at JavaPrograming/unit02.P8_Task03_UseOfSuperKeywordInMethod.main(P8_Task03_UseOfSuperKeywordInMethod.java:9)
	System.out.println("super call using child class");
}
}
