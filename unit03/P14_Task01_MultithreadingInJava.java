package unit03;
import java.util.*;
public class P14_Task01_MultithreadingInJava {

	public static void main(String[] args) {
		c2 obj2 = new c2();
		//obj2.show2();
		
		c1 obj = new c1();
		//obj.show1();
		
		Thread t1 = new Thread(new T1(),"T1 Name");
		Thread t2 = new Thread(new T2(),"T2 Name");
		Thread t3 = new Thread(new T3(),"T3 Name");
		Thread t4 = new Thread(new T4(),"T4 Name");
		
		t1.start();			//start() internally calls run()
		t2.start();
		t3.start();
		t4.run();
		
		System.out.println(Thread.currentThread().getName());
				//total thread = threads + 1(main thread)
	}

}
class c1{
	void show1() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+"-hey_1!");
		}
	}
}

class c2{
	void show2() {
//		try {
//			wait(10000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		for(int i=0;i<=10;i++) {
//			System.out.println(i+"-hey_2!");
//		}
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value:");
		int a= scan.nextInt();
		//scan.close();
		System.out.println("value is:" + a);
	}
}
//Thread implements Runnable
class T1 extends Thread{
	void display() {
		System.out.println("hello");
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+"-Hey_1!");
		}
		System.out.println("Done with T1");
		System.out.println(Thread.currentThread().getName());
	}
}
class T2 extends Thread{
	@Override
	 public void run() {
		 	Scanner scan = new Scanner(System.in);
			System.out.println("enter value:");
			int a= scan.nextInt();
			//scan.close();
			System.out.println("value is:" + a);
			System.out.println("Done with T2");
			System.out.println(Thread.currentThread().getName());
	 }
}

class T3 implements Runnable{
	public void run() {	
		System.out.println("running T3 and waiting for 10000ms(10s)");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with T3");
		System.out.println(Thread.currentThread().getName());
	}
}

class T4 implements Runnable{
	public void run() {	
		System.out.println("running T4 and waiting for 10000ms(10s)");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with T4");
		System.out.println(Thread.currentThread().getName());
	}
}


