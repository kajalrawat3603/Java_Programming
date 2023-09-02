package unit01;

public class SampleJavaProgram {
	//public class SampleJavaProgram1		->error-could not load main class unit01.SampleJavaProgram 
	//main method not depend wether the class is public or not.
	//in a java program their will only be singl public class although n no. of normal classes can be their.
	//if the class is public than the class name should be same as the file name.
	//
//	public static void main2() {
//		// TODO Auto-generated method stub
//		//
//		System.out.println("hello");
//	}
	int b=0;	//global variable
	//final int b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start execution 
		//main method can be overload
		//public static void main(int a)          ->error-Main method not found in class unit01.SampleJavaProgram
		//
		System.out.println("hello");
		display();
	}
	//method should be static 
	static void display() {
		System.out.println("display");
	}

}
