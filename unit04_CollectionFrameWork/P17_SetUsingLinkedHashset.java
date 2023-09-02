package unit04_CollectionFrameWork;
import java.util.*;
public class P17_SetUsingLinkedHashset {
/*set
 * no duplicates
 * at most one null element
 * 
 * linkedHashset
 * Inside, it uses doubly-linked list internally
 * preserve insertion order
 * */
	public static void main(String[] args) {
		
		//set demonstration using Hashset
		Set<String>hash_set= new LinkedHashSet<String>();
		hash_set.add("asc");
		hash_set.add("afec");
		hash_set.add("assdfs");
		hash_set.add("assdc");
		hash_set.add("asc");
		hash_set.add("asc");
		hash_set.add("asc");
		hash_set.add("asc");
		hash_set.add(null);
		hash_set.add(null);
		
		System.out.println(hash_set);
		
		//remove null value from the set
		hash_set.remove(null);			//element pass->no repeated element
		System.out.println(hash_set);

	}

}
