package assignment;
class Singleton {
	static Singleton single_instance = new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if (single_instance == null)
			single_instance = new Singleton();

		return single_instance;
	}
}
class CFG  {
		public static void main(String args[])
	{
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		System.out.println("Hashcode of x is "+ x.hashCode());
		System.out.println("Hashcode of y is "+ y.hashCode());
		System.out.println("Hashcode of z is "+ z.hashCode());
	}
}