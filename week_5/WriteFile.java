// Program demonstrating the writing of file
package Training.week_5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile 
{
	public static void main(String...args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program demonstrating the writing of file");
		try 
		{
			FileWriter file = new FileWriter("src/training/week_5/txtFiles/fileWriter.txt",true);
			System.out.println("Enter the text you want to put into the file");
			String str = sc.nextLine();
			file.write(str);
			file.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
