package Practice;

/* Comment */
public class LazySignletonWTS {
	
	private static LazySignletonWTS Instance = null;
			
	
	private LazySignletonWTS() {
		
	};
	
	public static LazySignletonWTS getInstance() {
		if(Instance == null)
		Instance = new LazySignletonWTS();
		return Instance;
	}

	/* s */
}
