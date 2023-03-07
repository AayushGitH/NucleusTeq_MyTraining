package Training.week_4.classes.abstractClasses;

public class Circle extends Shape
{
	// Properties
	int radius;

	// Constructor
	public Circle(int radius) 
	{
		this.radius = radius;
	}

	// Overriding methods
	@Override
	void perimeter() 
	{
		System.out.println("The perimeter of the cirle is with the radius "+this.radius+" is -> "+ (2 * Math.PI * this.radius));	
	}

	@Override
	void area() 
	{	
		System.out.println("The area of the cirle is with the radius "+this.radius+" is -> "+ (Math.PI * this.radius * this.radius));
	}
	
	
}
