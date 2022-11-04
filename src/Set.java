package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {

		HashSet<Integer> abc = new HashSet<>();
		
		abc.add(123);
		abc.add(124);
		
		abc.add(125);
		abc.add(121);
		
		
		Iterator<Integer> it = abc.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
