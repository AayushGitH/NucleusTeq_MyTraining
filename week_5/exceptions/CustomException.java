package Training.week_5.exceptions;

class MyException extends Exception 
{
    public MyException(String s)
    {
        super(s);
    }
}

public class CustomException 
{
	public static void main(String...args)
    {
        try 
        {
            throw new MyException("I am the exception in the program");
        }
        catch (MyException ex) 
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
