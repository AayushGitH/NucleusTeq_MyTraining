// This program is for rotating an entire array with users choice
package Training.week_2;

import java.util.Scanner;

public class RotateArray {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		System.out.println();

		int value = sc.nextInt();
		for (int i = 0; i < value; i++) 
		{
			int j, last;
			last = arr[arr.length - 1];

			for (j = arr.length - 1; j > 0; j--) 
			{
				arr[j] = arr[j - 1];
			}
			
			arr[0] = last;
		}
		
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
	}
}
