package unit03;
import java.util.*;
public class P14_Task_01_runOrStart {

	public static void main(String[] args) {
		customThreadStartorRun customThread = new customThreadStartorRun();
		//Thread t1 = new Thread(new customThreadStartorRun(),"customThreadStartorRun Name");
		//Thread t2 = new Thread(new customThreadStartorRun(),"customThreadStartorRun Name");
		Thread t1 = new Thread(customThread,"customThreadStartorRun Name");
		Thread t2 = new Thread(customThread,"customThreadStartorRun Name");
		t1.start();
		t2.run();
		System.out.println(Thread.currentThread().getName());
	}
}
class customThreadStartorRun implements Runnable{
	void display() {
		System.out.println("hello");
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
}
