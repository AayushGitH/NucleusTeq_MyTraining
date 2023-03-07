package Training.week_3;

import java.util.Arrays;

public class SecondHighestArray 
{
	
	public static int array2ndhighest(int[] arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	
	public static void main(String...args)
	{
		int arr[] = {12,34,9,30,33,65,67};
		int SecondElement = array2ndhighest(arr);
		System.out.println("Second element from an array is -> " + SecondElement);
	}
}
