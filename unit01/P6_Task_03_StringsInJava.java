package unit01;
import java.util.Scanner;
public class P6_Task_03_StringsInJava {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        scan.close();
        String w[]=s.split(" ");
        int l=w.length;
        String reversedString="";
        for(int i=0;i<l;i++)
        {   
        	if(i==l-1)
        	{
        		reversedString=w[i]+reversedString;
        	}
        	else
        	{
        		reversedString=" "+w[i]+reversedString;
        	}
        }
        System.out.println(reversedString); 
        }
}

