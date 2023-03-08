// Program of demonstrating the method hiding 
package Training.others;

class Parent1
{
	static void print()
	{
		System.out.println("I am method of parent class");
	}
}

class Child1 extends Parent1
{
	static void print()
	{
		System.out.println("I am method of child class");
	}
}

public class Hiding 
{
	public static void main(String...args)
	{
		System.out.println("Program is for demostrating method hiding");
		Parent1 p = new Parent1();
		p.print();
		Parent1 c = new Child1();
		c.print();
	}
}
