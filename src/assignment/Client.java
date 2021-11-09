package assignment;
public class Client 
{
	public static void main(String[] args)
	{
		Persistance fp=new FilePersistance();
		fp.persist();
		Persistance dp=new DatabasePersistance();
		dp.persist();
	}
}
