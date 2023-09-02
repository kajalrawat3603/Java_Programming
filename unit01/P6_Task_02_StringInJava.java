package unit01;

public class P6_Task_02_StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123",s2="123";
		int n=comparison(s1,s2);
		if(n==0)
			System.out.print("strings are equal");
		else
			System.out.print("strings are not equal");
	}
	public static int comparison(String s1,String s2) {
		int l1=s1.length(),l2=s2.length();
		if(l1!=l2)
			return 1;
		for(int i=0;i<l1;i++) {
			if(s1.charAt(i)!=s2.charAt(i))
				return 1;
		}
		return 0;
	}

}
