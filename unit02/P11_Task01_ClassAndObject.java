package unit02;
import java.util.Scanner;
public class P11_Task01_ClassAndObject {

	public static void main(String[] args) {
		String p,n;
		int a;
		Scanner scan = new Scanner(System.in);
		p=scan.next();
		scan.nextLine();
		n=scan.next();
		a=scan.nextInt() ;
		Telcall obj=new Telcall(p,n,a);
		obj.compute();
		obj.display();
	}
}
class Telcall
{
	String phno;
	String sname;
	int n;
	double amt;
	Telcall(String phno,String sname,int n)
	{
		this.phno=phno;
		this.sname=sname;
		this.n=n;
		this.amt=0;
	}
	void compute()
	{
		if(n>300)
		{
			amt+=(n-300)*1.50;
			n=300;
		}
		if(n>200)
		{
			amt+=(n-200)*1.20;
			n=200;
		}
		if(n>100)
		{
			amt+=(n-100)*1;
			n=100;
		}
		if(n>0)
		{ 
			amt+=500;
		}

	}
	void display()
	{
		System.out.println("Total Amount is:"+amt);
	}
	
}