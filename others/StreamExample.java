package Training.others;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample 
{
	public static void main(String...args)
	{
		List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		System.out.println("Filtering list without stream");
		for(int i : list1)
		{
			if(i<=6)
				System.out.print(i+" ");
		}
		System.out.println();
		
		/*===================| Intermediate methods |===================*/	
		// filter(), map(), sorted()
		/*-------------------| filter method |-------------------*/
		
		System.out.println("Filtering list with stream");
		List<Integer> newlist1 = list1.stream().filter(e->e<=6).collect(Collectors.toList());
		System.out.println(newlist1);
		
		/*-------------------| map method |-------------------*/
		System.out.println("Using map method to get the squares of numbers in list");
		List<Integer> newlist2 = list1.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(newlist2);
		
		/*-------------------| sorted method |-------------------*/
		List<String> list2 = Arrays.asList("Aayush","Mukesh","Usha","Adit","Aaru","Sonali","Sonam");
		list2.stream().sorted().forEach(System.out::println);
		
		/*===================| Terminal operations |===================*/
		// collect(), forEach(), reduce()
		
		List<Integer> list3 = List.of(1,2,435,2,6,7,8,2,13,15,16,55,444,48,20);
		List<Integer> newlist3 = list3.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println(newlist3);
		
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList("Rupal","Aayush"));
		System.out.println(set1);
		set1.stream().sorted().forEach(e->System.out.println(e));;
				
	}
}
