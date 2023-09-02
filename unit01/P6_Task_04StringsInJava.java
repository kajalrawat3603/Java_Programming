package unit01;
import java.util.Scanner;
public class P6_Task_04StringsInJava {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();	
		String ans=IntToRoman(i);
		System.out.println(ans);
		
	}
	public static String IntToRoman(int n)
	{
		if(n<1||n>3999)
		{
			return "Invalid";
		}
		String str="";
		while(n>=1000)
		{
			str+="M";
			n-=1000;
		}
		while(n>=900)
		{
			str+="CM";
			n-=900;
		}
		while(n>=500)
		{
			str+="D";
			n-=500;
		}
		while(n>=400)
		{
			str+="CD";
			n-=400;
		}
		while(n>=100)
		{
			str+="C";
			n-=100;
		}
		while(n>=90)
		{
			str+="XC";
			n-=90;
		}
		while(n>=50)
		{
			str+="L";
			n-=50;
		}
		while(n>=40)
		{
			str+="XL";
			n-=40;
		}
		while(n>=10)
		{
			str+="X";
			n-=10;
		}
		while(n>=5)
		{
			str+="V";
			n-=5;
		}
		while(n>=4)
		{
			str+="IV";
			n-=4;
		}
		while(n>=1)
		{
			str+="I";
			n-=1;
		}
		return str;	
	}
}

