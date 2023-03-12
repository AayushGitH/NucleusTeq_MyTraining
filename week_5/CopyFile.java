// Program demonstrating the copying of file
package Training.week_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyFile 
{
	public static void main(String...args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("This is the demonstration of the copying the file");
		try
		{
			OutputStream outputStream = new FileOutputStream("src/training/week_5/txtFiles/outpute.txt");
			InputStream inputStream = new FileInputStream("src/training/week_5/txtFiles/inpute.txt");
			
			 int c;
	         while ((c = inputStream.read()) != -1) 
	         {
	            outputStream.write(c);
	         }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
