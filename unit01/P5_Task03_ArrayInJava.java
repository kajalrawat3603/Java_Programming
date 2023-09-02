package unit01;

import java.util.Scanner;

public class P5_Task03_ArrayInJava {

	public static void main(String[] args) {
		deletion();
	}
	 public static void deletion()
	   {
		   Scanner scan=new Scanner (System.in);
		   int size=scan.nextInt();
		   int arr[]=new int[size];
		   System.out.println("Enter elements");
		   for(int i=0;i<size;i++)
		   {
			   arr[i]=scan.nextInt();
		   }
		   System.out.println("Enter element to delete");
		   int element=scan.nextInt();
		   int j=0;
		   for(int i=0;i<size;i++)
		   {
			   if(arr[i]==element)
			   {
				   continue;
			   }
			   arr[j++]=arr[i];
		   }
		   for(int i=0;i<j;i++)
			   System.out.print(arr[i]+" ");
		   
	   }
}
