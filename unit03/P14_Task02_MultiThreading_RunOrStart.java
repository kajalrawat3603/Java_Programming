package unit03;
import java.util.*;
public class P14_Task02_MultiThreading_RunOrStart {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T1c(),"T1c Name");
		Thread t2 = new Thread(new T2c(),"T2c Name");
		Thread t3 = new Thread(new T3c());
		
		t1.run();			//start() internally calls run()
		t2.run();
		t3.run();
		
	}
}
class T1c extends Thread{
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
class T2c extends Thread{
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

class T3c implements Runnable{
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