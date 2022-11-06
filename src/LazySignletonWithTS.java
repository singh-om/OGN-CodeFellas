package Practice;

public class LazySignletonWithTS {
	
	private static LazySignletonWithTS Instance = null;
	
	private LazySignletonWithTS() {
		
	}
	
	
	public static LazySignletonWithTS getInstance() {
		if (Instance == null) {
			synchronized (LazySignletonWithTS.class) {
				if (Instance == null) {
					Instance = new LazySignletonWithTS();
				}
			}
		}
		return Instance;
	}
	
	/*fds w*/

}
