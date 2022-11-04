package Practice;

public class SingleEagerImplementation{
	
	private static final SingleEagerImplementation INSTANCE = new SingleEagerImplementation();
	
	private SingleEagerImplementation() {
		
	}
	
	public static SingleEagerImplementation getInstance() {
		return INSTANCE;
	}
	
	

}
