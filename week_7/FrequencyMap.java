package Training.week_7;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {

	public static void main(String[] args) 
	{
		System.out.println("-----------------------------------| Frequency of an array |-----------------------------------");
		
		int arr[] = {1,1,2,2};
		Map<Integer, Integer> myMap = new HashMap<>();
				
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(myMap.containsKey(arr[i]))
			{
				myMap.put(arr[i], myMap.get(arr[i])+1);				
			}
			else
			{
				myMap.put(arr[i], 1);
			}
		}
		System.out.println("Following are the frequencies of elements in an array");
		for (Map.Entry<Integer, Integer> m : myMap.entrySet()) {
			System.out.println("Element - " + m.getKey() + " Frequency - " + m.getValue());
		}

		System.out.println();
		
		
		System.out.println("-----------------------------------| Frequency of a String |-----------------------------------");

		String inputString = "aayushtiwari";
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) 
			{
				charCountMap.put(c, charCountMap.get(c) + 1);
			} 
			else 
			{
				charCountMap.put(c, 1);
			}
		}

		
		System.out.println("Following are the frequencies of characters in a String");
		for (Map.Entry entry : charCountMap.entrySet()) 
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
