// Program of upperbounded wildcard in java
package Training.week_6.Wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Upperbounded 
{
	// Can sum of any type which comes under Number class
	private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
 
        return sum;
    }
	public static void main(String...args)
	{
		System.out.println("Program demonstrating the upperbounded wildcards in java");
		List<Integer> intlist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double intsum = sum(intlist);
		System.out.println("Integer list sum is " + intsum);
		System.out.println();
		
		List<Double> doublelist = Arrays.asList(1.5,2.5,3.5);
		double doublesum = sum(doublelist);
		System.out.println("Double list sum is " + doublesum);
		System.out.println();
	}
}
