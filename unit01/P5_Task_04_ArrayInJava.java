package unit01;
import java.util.Scanner;
public class P5_Task_04_ArrayInJava {
	public static void main(String[] args) {
		SecondLargeAndSmall();
	}
	public static void SecondLargeAndSmall()
	   {
		   Scanner scan= new Scanner(System.in);
		   int n=scan.nextInt();
		   int[] arr=new int[n];
		   System.out.println("Enter elements");
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=scan.nextInt();
		   }
		   int max=arr[0],s_max=arr[0],min=arr[0],s_min=arr[1];
		   for(int i=0;i<n;i++)
		   {
			   if(arr[i]>max)
			   {
				   s_max=max;
				   max=arr[i];
			   }
			   else if(arr[i]>s_max&&arr[i]<max)
			   {
				   s_max=arr[i];
			   }
		   }
		   for(int i=0;i<n;i++)
		   {
			   if(arr[i]<min)
			   {
				   s_min=min;
				   min=arr[i];
			   }
			   else if(arr[i]<s_min&&arr[i]>min)
			   {
				   s_min=arr[i];
			   }
		   }
		   System.out.println("second max="+s_max);
		   System.out.println("second min="+s_min);
	   }
}


