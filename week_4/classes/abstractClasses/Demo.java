package Training.week_4.classes.abstractClasses;

public class Demo 
{
	public static void main(String...args)
	{
		Circle circle = new Circle(5);
		circle.perimeter();
		circle.area();
		
		System.out.println();
		Rectangle rectangle = new Rectangle(7, 8);
		rectangle.perimeter();
		rectangle.area();
	}
}
