package Training.week_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuList 
{	
	public static void main(String...args)
	{
		// Global list to perform all operations
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************** Menu ****************************");
		int input;
		do 
		{
			System.out.println("------------------------------------------------------");
			System.out.println("Enter your choice from below options\n");
			System.out.println("Press 1 for add element in a list \n"
							+ "Press 2 for remove element from a list\n"
							+ "Press 3 for get an element from a list\n"
							+ "Press 4 for getting the full list\n"
							+ "Press 5 for exit");
			System.out.println("Enter your choice here => ");
			input = sc.nextInt();
			
			switch (input) 
			{
			case 1:
				System.out.println("Enter the element to add in a list");
				int ele = sc.nextInt();
				list.add(ele);
				break;
			
			case 2:
				System.out.println("Enter the index of an element you want to delete");
				int index = sc.nextInt();
				list.remove(index-1);
				System.out.println("Successfully removed the item from the list");
				break;
				
			case 3:
				System.out.println("Enter the index of an element you want to get");
				int gindex = sc.nextInt();
				System.out.println(list.get(gindex));
				break;
				
			case 4:
				System.out.println("Following are the elements in the list");
				System.out.println(list);
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Enter the valid choice");
				break;
			}
			
			System.out.println("------------------------------------------------------");
		} while (input != 5);
		
		System.out.println("\n \nEnd of the program");
	}
}
