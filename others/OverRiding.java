// Program for demostrating the method overriding 
package Training.others;

class Parent
{
	void print()
	{
		System.out.println("I am method of parent class");
	}
}

class Child extends Parent
{
	void print()
	{
		System.out.println("I am method of child class");
	}
	void print(int a)
	{
		System.out.println("The value of a is "+a);
	}
}

public class OverRiding 
{
	public static void main(String...args)
	{
		System.out.println("Program is for the overriding of the methods");
		Parent p = new Parent();
		p.print();
		// Parent c = new Child();
		// c.print(2); // throws error 
		
		Parent c = new Child();
		c.print();
	}
}
