package CollectionsProgram;

import java.util.ArrayList;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		al.add(5);
		
		//al.forEach(System.out::println);
		System.out.println("Size of ArrayList"+al.size());
		
		
		Vector v = new Vector();
		
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		
		//v.forEach(System.out::println);
		System.out.println("Size of Vector "+v.size());
		

	}

}
