package unit02;

public class P9_Task01_JaggedArray {
	
	//provid asymetry.
	//array utilized.
	//memory save.
	
	public static void main(String[] args) {
		 //-Create a 2D array of 3 rows
		 //- columns in each row must not be same
		m1();
		m2();
	}
	static void m1() {
		int arr_name[][] = new int [][] {
		new int [] {10,20,30,40},new int [] {10,20,30,40},new int [] {10,20,30,40}
		};
		for(int i=0 ; i<arr_name.length ; i++) {
			for(int j=0 ; j<arr_name.length ; j++) {
				System.out.print(arr_name[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void m2() {
		int a[][] = new int [3][];		//number of row compulsory
		a[0]= new int[3];				//row 1 have 3 element
		a[1]= new int [2];				//row 2 have 2 element
		a[2]=new int [3];				//row 3 have 3 element
		
		int c=0;
										//a.length is no.of rows
		for(int i=0 ; i<a.length ; i++) {
			for(int j=0 ; j<a[i].length ; j++){
				a[i][j] = c++;
			}
		}
		System.out.println("content of 2-D jagged array");
		for(int i=0 ; i<a.length ; i++) {
			
			for(int j=0 ; j<a[i].length ; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	}
	
