package Training.week_6.FMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class OperationFile 
{
	// Method for adding an Employee
			public static void addEmployee(Employee emp)
			{
				System.out.println("Hello I am the addEmployee method()");
						
				try 
				{
					File path = new File("src/training/week_6/FMSfiles/"+"emp"+emp.getEid()+".txt");
					path.createNewFile();
					FileOutputStream file = new FileOutputStream("src/training/week_6/FMSfiles/"+"emp"+emp.getEid()+".txt");
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(emp);
					out.close();
					file.close();
					System.out.println("Successfully added an Employee");
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
			
			// Method for updating a specific Employee
			public static void updateEmployee()
			{
				System.out.println("Hello I am the updateEmployee method()");
			}
			
			// Method for deleting an Employee
			public static void deleteEmployee(int id)
			{
				File file = new File("src/training/week_6/FMSfiles/"+"emp"+id+".txt");
				file.delete();
			}
			
			// Method for getting an Employee
			public static void getEmployee(int id)
			{
				try
				{
					FileInputStream fin = new FileInputStream("src/training/week_6/FMSfiles/"+"emp"+id+".txt");
					ObjectInputStream in = new ObjectInputStream(fin);
					Employee emp = null;
					emp = (Employee)in.readObject();
					System.out.println(emp);
					in.close();
					fin.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void main(String...args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("****************** Welcome to the File Management System ******************");
				int input;
				do
				{
					System.out.println("-------------------------------------------------------------------------");
					System.out.println("Enter 1 for add an Employee");
					System.out.println("Enter 2 for edit an Employee");
					System.out.println("Enter 3 for delete an Employee");
					System.out.println("Enter 4 for get an Employee");
					System.out.println("Enter 5 for exit");
					System.out.println();
					System.out.print("Enter your choice -> ");
					input = sc.nextInt();
					System.out.println();
					System.out.println("-------------------------------------------------------------------------");
					
					switch (input) 
					{
						case 1:
							System.out.print("Enter id of Employee : ");
							int eid = sc.nextInt();
							System.out.println();
							System.out.print("Enter name of Employee : ");
							String eName= sc.next();
							System.out.println();
							System.out.print("Enter field of Employee : ");
							String eField = sc.next();
							System.out.println();
							System.out.print("Enter salary of Employee : ");
							String eSalary = sc.next();
							System.out.println();
							Employee emp = new Employee(eid,eName,eField,eSalary);
							addEmployee(emp);
							break;
							
						case 2:
							updateEmployee();
							break;
							
						case 3:
							System.out.println("Enter the id to delete an Employee");
							int id = sc.nextInt();
							deleteEmployee(id);
							break;
							
						case 4:
							System.out.println("Enter the id of an Employee you want to display");
							int idd = sc.nextInt();
							getEmployee(idd);
							break;
							
						case 5:
							break;
					}
				}while(input!=5);
				
				System.out.println();
				System.out.println("Thank you for your visit !!");
			}
}
