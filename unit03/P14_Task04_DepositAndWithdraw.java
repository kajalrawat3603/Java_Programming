package unit03;

public class P14_Task04_DepositAndWithdraw {

	public static void main(String[] args) {
		sharedResource c= new sharedResource();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(15000);
			}
		}.start();
	}
}

class sharedResource{
	int amount=10000;
	synchronized void withdraw(int amount)  {
		System.out.println("going to withdraw..."+amount);
		if(this.amount<amount) {
			System.out.println("Less balance, waiting for diposite...");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		if(this.amount<0) {
			System.out.println("Negetive balance, waiting for deposit...");
			try {
				//wait();
				Thread.currentThread().interrupt();
			} catch (Exception e) {
			}
		}
		System.out.println("Now total amount is :"+amount);
		System.out.println("withdraw completed...");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit..."+amount);
		this.amount+=amount;
		System.out.println("deposit completed...");
		//notify();
		System.out.println("Now total amount is: "+amount);
		notifyAll();
	}
}
