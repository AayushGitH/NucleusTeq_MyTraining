// This program is for calculating the quadratic equation
package Training.week_2;
import java.util.Scanner;

public class RootQuadratic 
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the value of a : ");
	    int a = sc.nextInt();
	    System.out.println();
	    System.out.print("Enter the value of b : ");
	    int b = sc.nextInt();
	    System.out.println();
	    System.out.print("Enter the value of c : ");
	    int c = sc.nextInt();
	    System.out.println();
	    double ans;
	    float forsquare = ((b*b) - 4*(a*c));
	    ans = ((-(b)) - Math.sqrt(forsquare));
	    System.out.println("The root of the given values is " + (ans)/(2*a));
	}
}
