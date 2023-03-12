package Training.week_5.exceptions;

import java.io.FileNotFoundException;

public class ThrowExample 
{
	public static void checkedmethod(int i) 
	{
		if(i>21)
		{
			throw new ArithmeticException("Age cannot be greater than 21");
		}
		else
		{
			System.out.println("You are eligible to the fancy dress competition");
		}
	}
	public static void uncheckedmethod(int age) throws FileNotFoundException
	{
		if(age>21)
		{
			throw new FileNotFoundException("Age cannot be greater than 21");
		}
		else
		{
			System.out.println("You are eligible to the fancy dress competition");
		}
	}
	
	public static void main(String...args)
	{
		System.out.println("Program of throw keyword");
		//checkedmethod(23); // Throwing checked exception
		try 
		{
			uncheckedmethod(29); // Throwing unchecked exception
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
}
