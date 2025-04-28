package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Set<String> names = new HashSet<String>();
  names.add("Tom111222");
  names.add("Jacob");
  names.add("Alan");
  names.add("Robert");
  System.out.println(names);
  Iterator i = names.iterator();
  while(i.hasNext()) {
	  System.out.println(i.next());
  }
  i.remove();
  System.out.println(names);
	}

}
