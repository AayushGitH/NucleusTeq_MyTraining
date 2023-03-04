// Program of calculating the area of triangle
package Training.week_2;
import java.util.Scanner;

public class AreaTriangle 
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base -> ");
		int base = sc.nextInt();
		System.out.println("Enter the height -> ");
		int height = sc.nextInt();
		double ans = (height*base)/2;
		System.out.println("Area of the trianlge is -> "+ans);
	}
}
