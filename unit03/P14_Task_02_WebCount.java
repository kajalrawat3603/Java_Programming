package unit03;

public class P14_Task_02_WebCount {
	

	public static void main(String[] args) throws InterruptedException{
		WebCount obj= new WebCount();
		
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				obj.webcount();
			}
		});

		Thread t2 = new Thread(new Runnable(){
			public void run() {
				obj.webcount();
			}
		});
		t1.start();
		t2.start();
		
		//t1.join();
		//t2.join();
		
		//obj.webcount();
		System.out.println("Done with main");
		System.out.print(WebCount.c);
	}

}

class WebCount{
	public static int c=0;
	public synchronized void webcount() {
		for(int i=0;i<1000;i++) {
			c++;
		}
	}
}
