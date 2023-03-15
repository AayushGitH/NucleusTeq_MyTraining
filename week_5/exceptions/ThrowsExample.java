// Program demostrating the throws keyword in java application
package Training.week_5.exceptions;

import java.io.FileNotFoundException;

public class ThrowsExample 
{
	public static void method() throws FileNotFoundException
	{
		try 
		{
			System.out.println("Throwing checked exception");
			throw new FileNotFoundException();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void method2() throws ArithmeticException
	{
		try
		{
			System.out.println("Throwing unchecked exception");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String...args)
	{
		System.out.println("Program of throws keyword in java");
		try 
		{
			method(); // if we give throws declaration then we must call a method in try catch block
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		method2(); // here we are calling it directly without any try catch block
	}
}
