package unit02;

public class P9_Task02_CountObjects {

	public static void main(String[] args) {
//		- Check how many objects of a class are being created
//		- Hint: use static variable to track the count
		x obj1 = new x();
		x obj2 = new x();
		x obj3 = new x();
		x obj4 = new x();
		x obj5 = new x();
		x obj6 = new x();
		obj1.fun();
		obj1.fun();
		obj1.fun();
		obj1.fun();
		obj1.fun();
		System.out.println(x.c);
	}
	

}
class x{
	static int c=0;
	static int c1=0;
	x(){
		c++;
	}
	
	void fun() {
		c1++;
	}
}
