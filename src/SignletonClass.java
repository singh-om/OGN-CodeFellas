package Practice;

public class SignletonClass {

	public static void main(String[] args) {
	
		/* Eager Singleton : So It create class as soon as class is loaded */
		
		SingleEagerImplementation obj1 = SingleEagerImplementation.getInstance();
		SingleEagerImplementation obj2 = SingleEagerImplementation.getInstance();
		
		System.out.println(obj1.hashCode() == obj2.hashCode());
		
		/* Lazy Singleton : So It create class when it required*/
		
		LazySignletonWTS lazyObj1 = LazySignletonWTS.getInstance();
		LazySignletonWTS lazyObj2 = LazySignletonWTS.getInstance();
		
		System.out.println(lazyObj1.hashCode() == lazyObj2.hashCode());
		
		/* Lazy Singleton : So It create class when it required*
		 * It is thread Safe also we are using the Dual Locking In this */
		
		LazySignletonWithTS abc1 = LazySignletonWithTS.getInstance();
		LazySignletonWithTS abc2 = LazySignletonWithTS.getInstance();
		
		System.out.println(abc1.hashCode() == abc2.hashCode());
		
		
		/* LazyInitializationWithHolderClass : So It create class when it required*/
		
		LazyInitializationWithHolderClass ins1 = LazyInitializationWithHolderClass.getInstance();
		LazyInitializationWithHolderClass ins2 = LazyInitializationWithHolderClass.getInstance();
		
		System.out.println(ins1.hashCode() == ins2.hashCode());

	}

}
