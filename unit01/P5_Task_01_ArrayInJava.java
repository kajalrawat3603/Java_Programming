package unit01;
import java.util.Scanner;
public class P5_Task_01_ArrayInJava {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int []a=new int[10];
		int m=0;
		for(int i=0;i<10;i++){
			int x=s.nextInt();
			if(m<x){
				m=x;
			}
			a[i]=x;
		}
		int []c=new int[m+1];
		for(int i=0;i<m+1;i++){
			c[i]=0;
		}
		for(int i=0;i<10;i++){
			c[a[i]]++;
		}
		for(int i=0;i<m;i++){
			if(c[i]>1) {
				System.out.print(i+" ");
			}
		}
	}
}
