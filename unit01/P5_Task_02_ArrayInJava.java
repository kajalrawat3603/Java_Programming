package unit01;
import java.util.Scanner;
public class P5_Task_02_ArrayInJava {
	public static void main(String[] args) {
     	leftrotate();
	}
	 public static void leftrotate()
	   {
		  Scanner scan=new Scanner(System.in);
		  int size=scan.nextInt(),i;
		  int[] arr=new int[size];
		  System.out.println("Enter elements");
		  for(i=0;i<size;i++)
		  {
			  arr[i]=scan.nextInt();
		  }
		  int n=2;
		  while(n>0)
		  {
			  int temp=arr[0];
			  for(i=0;i<size-1;i++)
			  {
				  arr[i]=arr[i+1];
			  }
			  arr[i]=temp;
			  n--;
		  }
		  for(i=0;i<size;i++)
			  System.out.print(arr[i]+" ");
	   }
}

