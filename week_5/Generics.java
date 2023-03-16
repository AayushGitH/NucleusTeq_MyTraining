// Program relating to the generics in java
package Training.week_5;

import java.util.ArrayList;
import java.util.List;


// Generic class
class Demo<T>
{
	T value;
	T get()
	{
		return value;
	}
}

// Concrete class
public class Generics 
{
	
	// Generic method
	public static <E> void gdemo(E element)
	{
		System.out.println("The value of the generic element is = " + element);
	}
	
	// Main method
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
		
		// Making object of generic class
		Demo<Integer> obj = new Demo();
		obj.value = 9999;
		System.out.println(obj.get());
		
		Demo<Double> dobj = new Demo();
		dobj.value = 999.9000;
		System.out.println(dobj.get());
		
		// Calling generic method
		gdemo("Aayush");
		gdemo(123456);
		gdemo(1222222.2222);
		gdemo('A');
	}
}
