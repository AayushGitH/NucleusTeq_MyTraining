package Training.week_5.exceptions;

public class MainException 
{
	public static void main(String...args)
	{
		System.out.println("Program demonstrating different types of exceptions in java");
		try 
		{
			// int div = 10/0; // Arithmetic exception
			
			//String a = null;
			//char value = a.charAt(0);
			
			String ab = "This is like chipping "; // length is 22
	        char c = ab.charAt(24); // accessing 25th element
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Cannot divide the number by zero");
		}
		catch (NullPointerException e) 
		{
			System.out.println("Check the string if this is null");
		}
		 catch(StringIndexOutOfBoundsException e) 
		{
	        System.out.println("StringIndexOutOfBoundsException");
	    }
	}
}
