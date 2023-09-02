package unit04_CollectionFrameWork;
import java.util.*;
/* List 
 * don't need to give size of the array at start
 * no index out of bound exception if used properly.
 * duplicates are allowed
 * Multiple null values are allowed
 * preserve insertion order
*/

public class P17_Task01_ListUsingArrayList {

	public static void main(String[] args) {
		//creating list
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,2);
		l1.add(3,null);
		l1.add(4,null);
		System.out.println(l1);
		//create another list 
		//List<Integer> is an Interface while ArrayList<Integer>
		
		List<Integer>l2=new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		l2.add(5);
		System.out.println(l2);
		                                                                           
		//will add list l2 from 5 index
		l1.addAll(5,l2);
		System.out.println(l1);
		
		//add 2 at 5th index
		l1.add(5,2);
		System.out.println(l1);
		
		//remove element at index 3
		l1.remove(2);
		System.out.println(l1);
		
		//prints element at index 3
		System.out.println(l1.get(3));
		
		//replace 0th element with 5
		l1.set(1,7);
		System.out.println(l1);
	}

}
