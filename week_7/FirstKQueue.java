// Program demonstrating the reverse the first k elements in queue
package Training.week_7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FirstKQueue 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Following are the elements in a queue");
		Deque<Integer> queue = new ArrayDeque<>();
		queue.add(13);
		queue.add(14);
		queue.add(15);
		queue.add(16);
		queue.add(17);
		queue.add(18);
		queue.add(19);
		queue.add(10);
		for(int i:queue)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("Enter the value of k here ");
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		// Adding first k elements in list
		for(int i=0; i<k; i++)
		{
			 list.add(queue.removeFirst());
		}
		
		// Pushing elements in reverse order in queue
		for(int i=0; i<list.size(); i++)
		{
			queue.addFirst(list.get(i));
		}
		
		// Printing final queue
		for(int i:queue)
		{
			System.out.print(i+" ");
		}
	}

}
