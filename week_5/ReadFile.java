// Program demonstrating the reading of file
package Training.week_5;

import java.io.File;
import java.io.FileReader;

public class ReadFile 
{
	public static void main(String...args)
	{
		System.out.println("Program demonstrating the reading the file");
		
		try 
		{
			FileReader file = new FileReader("src/training/week_5/txtFiles/fileReader.txt");
			int i;
			while((i = file.read())!=-1)
			{
				System.out.print((char)i);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
