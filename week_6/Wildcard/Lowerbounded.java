package Training.week_6.Wildcard;

import java.util.Arrays;
import java.util.List;

public class Lowerbounded 
{
	// Can print only Integer and Number type
	public static void OnlyInteger(List<? super Integer> list) 
	{
		System.out.println(list);
	}
	
	public static void main(String...args)
	{
			System.out.println("Program demonstrating the upperbounded wildcards in java");
			List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			OnlyInteger(intlist);
			System.out.println();
			
			List<Number> doublelist = Arrays.asList(1.5,2.5,3.5);
			OnlyInteger(doublelist);
			System.out.println();
	}
}
