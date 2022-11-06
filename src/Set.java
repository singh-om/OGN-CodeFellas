package Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {

		HashSet<Integer> abc = new HashSet<>();
		
		/* new added code */
		abc.add(23131);
		abc.add(123112);
		abc.add(1232151);
			
		
		/* afgd */
		
		Iterator<Integer> it = abc.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
