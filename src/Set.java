package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {

		HashSet<Integer> abc = new HashSet<>();
		
		
		
		
		Iterator<Integer> it = abc.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
