package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> fruits = new ArrayList<String>();
fruits.add("apple");
fruits.add("orange");
fruits.add("grapes");
fruits.add("banana");
fruits.add("kiwi");
System.out.println(fruits);
System.out.println(fruits.get(2));
fruits.set(1, "lemon");
System.out.println(fruits);
fruits.add("lemon");
System.out.println(fruits);
System.out.println(fruits.indexOf("lemon"));
System.out.println(fruits.lastIndexOf("lemon"));
fruits.remove(5);
System.out.println(fruits);
System.out.println(fruits.contains("grapes"));
System.out.println(fruits.isEmpty());
System.out.println(fruits.size());
	}

}
