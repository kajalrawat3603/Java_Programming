package unit01;

import java.util.Arrays;
import java.util.Scanner;

public class P5_Task_05_ArrayInJava {

	public static void main(String[] args) {
		insertion();
	}
	public static void insertion() {

		   Scanner scan= new Scanner(System.in);
		   int n=scan.nextInt();
		   int[] arr=new int[n];
		   System.out.println("Enter elements");
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=scan.nextInt();
		   }
		   for(int i=0;i<n;i++)
		   {
			   System.out.println(arr[i]);
		   }
		   System.out.println("Enter element to insert");
		   int element=scan.nextInt();
		   System.out.println("Enter index");
		   int position=scan.nextInt();
		   int arr2[]=Arrays.copyOf(arr, n+1);
		   for(int i=0,k=0;i<=n;i++)
		   {   
			   if(i==position) {
				   arr2[i]=element;
				   for(int j=i+1;j<n+1;j++)
				   {
					   arr2[j]=arr[i];
					   i++;
				   }
			   }
			   else
			   {
				   arr2[i]=arr[k++];
			   }
		   }
		   for(int i=0;i<=n;i++)
			   System.out.print(arr2[i]+" ");
	   }
}

