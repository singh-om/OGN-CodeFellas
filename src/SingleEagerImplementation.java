package Practice;

public class SingleEagerImplementation{
	
	
	/* this is the new changes */
	private static final SingleEagerImplementation INSTANCE = new SingleEagerImplementation();
	
	private SingleEagerImplementation() {
		
	}
	
	public static SingleEagerImplementation getInstance() {
		return INSTANCE;
	}
	
	

}
