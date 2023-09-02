package unit02;
public class P8_Task01_InheritanceInJava {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.A();
		Mammal m = new Mammal();
		m.M();
		}
}
class Animal{
	Animal(){
		System.out.println("animal class");
	}
	void A() {
		System.out.println("super class method");
	}
}
class Mammal extends Animal{
	Mammal(){
		System.out.println("animal class");
	}
	void M() {
		System.out.println("By child class");
		A();
	}
}
