package unit01;
import java.util.Scanner;
public class P6_Task_05_StringInJava {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] s=str.toCharArray();
		boolean []arr=new boolean[26];
		int i;
		int l=s.length;
		for(i=0;i<l;i++)
		{
			int index=s[i]-'a';
			arr[index]=true;
		}
		for(i=0;i<26;i++)
		{
			if(arr[i]==false)
			{
				System.out.println("String is not pangram");
				break;
			}
		}
		if(i==26)
		{
			System.out.println("String is pangram");
		}
	}
}

