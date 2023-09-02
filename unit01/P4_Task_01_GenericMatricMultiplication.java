package unit01;
import java.util.Scanner;
public class P4_Task_01_GenericMatricMultiplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		int r2 = scan.nextInt();
		int arr[][]=new int[r1][c1];
		int brr[][]=new int[r2][c2];
		int r[][]=new int[r1][c2];
		System.out.println("enter elements of 1st Matrix");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter elements of 2nd Matrix");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				brr[i][j]=scan.nextInt();
			}
}
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++){
				int sum=0;
				for(int k=0;k<c1;k++)
				{   
					sum=sum+arr[i][k]*brr[k][j];
					r[i][j]=sum;
				}
			}
		}
		System.out.println("Multiplied Matrix is");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
	}
}
