// Program demonstrating storing the unique elements in a set
package Training.week_7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueSet 
{
	public static void main(String...strings) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		// Declaring an array
		int arr[] = new int[size];
		
		System.out.println("Enter the values in an array");
		for(int i = 0; i < size; i++)
		{
			int value = sc.nextInt();
			arr[i] = value;
		}
		System.out.println();
		System.out.print("The values in an array are => ");
		for(int i: arr)
		{
			// Printing arrays items
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Declaring a set
		Set<Integer> mySet = new HashSet<>();
		for(int i = 0; i < size; i++)
		{
			// Printing set items
			mySet.add(arr[i]);
		}
		System.out.println();
		System.out.print("The values in a set are => ");
		for(int i : mySet)
		{
			System.out.print(i + " ");
		}
	}
}
