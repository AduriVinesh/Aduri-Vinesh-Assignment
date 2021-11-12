package assignment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection2 {

	public static void main(String[] args) {
		Set<Object> hs=new HashSet<>();
		hs.add(-5);
		hs.add(500);
		hs.add(null);
		hs.add("Hi");
		hs.add(0);
		hs.add(45);
		hs.add(-400);
		hs.add(-5); //will be negleted for being duplicate
		hs.add("Bye");
		hs.add("3.14");
		
		System.out.println(hs);
	}
}
