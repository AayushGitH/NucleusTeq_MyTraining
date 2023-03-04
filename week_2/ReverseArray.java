// Program of printing array in reverse order
package Training.week_2;

public class ReverseArray 
{
	public static void main(String...args)
	{
		int arr[] = { 11,22,33,44,55,66,77,88,99,100 };
		System.out.println("Printing an array in a reverse order -> ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
