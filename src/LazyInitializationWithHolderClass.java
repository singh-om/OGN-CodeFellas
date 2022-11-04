package Practice;

public class LazyInitializationWithHolderClass {
	
	/* new changes */

	private static class RegistoryHolder{
		static LazyInitializationWithHolderClass Instance = new LazyInitializationWithHolderClass();
	}
	
	private LazyInitializationWithHolderClass() {
		
	}
	
	public static LazyInitializationWithHolderClass getInstance() {
		return RegistoryHolder.Instance;
	}
	
	/* Local Changes */
}
