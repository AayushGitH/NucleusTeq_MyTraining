// Program for calculating simple and compound interest 
package Training.week_3;

import java.util.Scanner;

public class SIandCI 
{
	public static void main(String...args)
	{
		 Scanner sc = new Scanner(System.in);

	        // Simple interest
	        System.out.println("Enter the details to find simple interest");
	        System.out.println("Enter the principal ");
	        int principal = sc.nextInt();
	        System.out.println("Enter the rate ");
	        float rate = sc.nextFloat();
	        System.out.println("Enter the time ");
	        float time = sc.nextFloat();
	        float ans = principal*rate*time/100;
	        System.out.println("Simple interest is " + ans);

	        // Compound interest
	        System.out.println();
	        System.out.println("Enter the details for calculating the compound interest");
	        System.out.println("Enter the value of P ");
	        float P = sc.nextFloat();
	        System.out.println("Enter the value of n ");
	        float n = sc.nextFloat();
	        System.out.println("Enter the value of r ");
	        float r = sc.nextFloat();
	        System.out.println("Enter the value of t ");
	        float t = sc.nextFloat();
	        float value = (1+r/100);
	        double ans2 = P*(Math.pow(value,n));
	        System.out.println("Compound interest is " + ans2);
	}
}
