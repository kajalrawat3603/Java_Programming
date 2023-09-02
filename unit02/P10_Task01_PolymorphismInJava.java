package unit02;

public class P10_Task01_PolymorphismInJava {

	public static void main(String[] args) {
//		- Run time method dispatch
//		- Create a child class name CBA of ABC
//		- Perform overloading and overriding of method add(., ., .)
		ABC obj1 = new ABC();
		obj1.add(0);
	   //CBA obj2 = new ABC();
		ABC obj3 = new CBA();
		obj3.add(0,4);
		obj3.add(4);
	}
}
class ABC{
	void add(int a) {
		System.out.println("parent class add = "+(a+10));
	}
	void add(int a,int b) {
		System.out.println("parent class overloaded add = "+(a+b));
	}
}
class CBA extends ABC{
	CBA(){
		System.out.println("deafault constructor of CBA");
	}
	void add(int a,int b) {
		System.out.println("child class add = "+(a+b+10));
	}
}

