package Training.week_4.classes.abstractClasses;

public class Rectangle extends Shape
{
	// Properties
	int length;
	int width;
	
	// Constructor
	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	// Overriding methods of Shape class
	@Override
	void perimeter() 
	{
		System.out.println("The perimeter of the rectangle with given parameters is -> "+ (2 * (this.length + this.width)));
	}

	@Override
	void area() 
	{
		System.out.println("The area of the rectangle with given parameters is -> "+ (this.length * this.width));	
	}
	
	
	
	
}
