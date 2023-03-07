package Training.week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest 
{
	public static void main(String[] args) 
	{
		System.out.println("This is the first program on Oops");
		Student st1 = new Student(101, "Aayush Tiwari", "PCM", 40, 52, 25);
		Student st2 = new Student(102, "Gunjan Ujjainiya", "Computer", 80, 82, 85);
		Student st3 = new Student(103, "Anuradha Saini", "PCM", 55, 12, 25);
		Student st4 = new Student(104, "Rohit Sisodiya", "Commerce", 80, 52, 21);
		Student st5 = new Student(105, "Abhishek Sharma", "Arts", 90, 35, 22);
		ArrayList<Student> stlist = new ArrayList<>(Arrays.asList(st1,st2,st3,st4,st5));
		
		
		for(Student student: stlist)
		{
			System.out.println(student.getName());
		}
		
	}
}
