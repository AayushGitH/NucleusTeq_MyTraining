// Program demonstrating the unbounded wildcards in java
package Training.week_6.Wildcard;

import java.util.Arrays;
import java.util.List;

public class Unbounded 
{
	// Can take any type to print the list
	private static void printlist(List<?> list)
    {
        System.out.println(list);
    }
	public static void main(String...args)
	{
		List<Integer> intlist = Arrays.asList(1,2,33,4,5);
		printlist(intlist);
		System.out.println();
		
		List<Character> charlist = Arrays.asList('A','a','y','u');
		printlist(charlist);
		System.out.println();
		
	}
}
