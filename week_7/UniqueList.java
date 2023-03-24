package Training.week_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueList 
{
	public static void main(String...args)
	{
		System.out.println("Enter 10 values to store in an Arraylist unique");
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		for(int i=0; i<10; i++)
		{
			String value = sc.nextLine();
			list.add(value);
		}
		
		// For storing distinct values in a list
		list = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		
		List<String> newlist = null;
		// Soting the list
		newlist = list.stream().sorted().collect(Collectors.toList());
		System.out.println(newlist);
		System.out.println(list);
	}
}
