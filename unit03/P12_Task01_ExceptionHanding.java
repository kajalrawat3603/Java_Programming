package unit03;
import java.util.*;
//
//Firstly create a P12_Task01_ExceptionHanding public class, and psvm main method.
//Create a separate class name FunctionsOfException and through the object of this class perform given operations:
// 
//
//1- obj.basicException() {/ by zero but unhandled exception}
//2- obj.handleException() {use of try and catch, handled exception}
//3- obj.multipleCatch() {multiple catch for one try block}
//4- obj.inputMismatchException() {nextInt() and enter string}
//5- obj.stackOverFlowError() {unstoppable recursion}
//6- obj.indexOutOfBoundException() {a[10] in a[3] array, index out of bound}
//7- obj.nullPointerException() {s.lenght() when s is null}
//8- obj.useOfThrow() {manually throw exception}
//9- obj.use?>>OfThrows_And_Finally() {declare what possible exceptions may occur, finally always run}

public class P12_Task01_ExceptionHanding {

	public static void main(String[] args) {
		FunctionsOfException obj = new FunctionsOfException();
		obj.handleException();
		obj.inputMismatchException();
		//obj.stackOverFlowError();
		//obj.indexOutOfBoundException();
		obj.nullPointerException();
	}

}
class FunctionsOfException{
	Scanner scan = new Scanner(System.in);
	void basicException() {
		int a=9;
		int b=0;
		//System.out.print(a/b);
	}
	void handleException() {
		int a=9;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("enter another value of b");
			b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
	}
	void multipleCatch() {
		int a=9;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("catch by arithmeticException enter another value of b");
			b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(RuntimeException e) {
			System.out.println("catch by RuntimeException enter another value of b");
			b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("enter another value of b");
			b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
	}
	void inputMismatchException() {
		try{
			int a=scan.nextInt();
			System.out.println(a);
		}catch(InputMismatchException e) {
			System.out.println("enter integer value!!");
			scan.nextLine();
			int a=scan.nextInt();
			System.out.println(a);
		}
	}
	void stackOverFlowError() {
		int i=1;
		while(i>0) {
			stackOverFlowError();
			i++;
		}
	}
	void indexOutOfBoundException() {
		try{
			int a[]= {1,2,3};
		System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("indexOut Of Bound Exception");
			int a[]= {1,2,3};
			System.out.println(a[2]);
		}
	}
	void nullPointerException() {
		try{
			String a=null;
			System.out.println(a.length());
		}catch(Exception e) {
			System.out.println("null Pointer Exception");
			String a=scan.nextLine();
			System.out.println(a.length());
		}
	}
	
}