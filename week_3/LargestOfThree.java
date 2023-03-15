//Program demonstrating the largest number from three numbers
package Training.week_3;

public class LargestOfThree
{
 public static void main(String...args)
 {
     System.out.println("This is the program of getting highest from the three numbers");
     int a = 340,b=43000,c=800;
     int temp;
     temp = a>b?a:b;
     int highest = c>temp?c:temp;
     System.out.println("The highest amongst three numbers is " + highest);
 }
}