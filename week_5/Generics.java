// Program relating to the generics in java
package Training.week_5;

import java.util.ArrayList;
import java.util.List;

public class Generics 
{
	public static void main(String...args)
	{
		System.out.println("Program demonstrating the generics in Java programming language");
		
		// Without generics
		System.out.println("Without generics");
		List list = new ArrayList<>();
		list.add("Aayush");
		list.add(123);
		System.out.println(list);
		System.out.println();
		
		// With generics
		System.out.println("With generics");
		List<String> list2 = new ArrayList<>();
		list2.add("Aayush");
		list2.add("123");
		System.out.println(list2);
		System.out.println();
		
		// Type casting is need when generics is not used 
		System.out.println("Typecasting example");
		List list3 = new ArrayList<>();
		list3.add("Rocky");
		list3.add(123);
		System.out.println(list3);
		int value = (Integer)list3.get(1);
		System.out.println("The value of list3 second element is " + value);
		System.out.println();
		
	}
}
