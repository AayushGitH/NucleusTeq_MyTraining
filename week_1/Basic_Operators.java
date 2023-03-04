package Training.week_1;

public class Basic_Operators 
{
	public static void main(String...args)
	{
		System.out.println("---------------------| Unary operators |---------------------");
		int num=10;
		System.out.println("The value of num++ is " + num++);
		System.out.println("The value of num-- is " + num--);
		System.out.println("The value of ++num is " + ++num);
		System.out.println("The value of --num is " + --num);
		
		System.out.println();
		System.out.println("---------------------| Arithmetic operators |---------------------");
		int a=10,b=2;
		System.out.println("The value of (a + b) is " + (a+b));
		System.out.println("The value of (a - b) is " + (a-b));
		System.out.println("The value of (a * b) is " + (a*b));
		System.out.println("The value of (a / b) is " + (a/b));
		
		System.out.println();
		System.out.println("---------------------| Shift operators |---------------------");
		System.out.println("Left shift -> " + (10<<2)); //10*2^2=10*4=40 
		System.out.println("Right shift -> " + (10>>2)); //10/2^2=10/4=2  
		
		System.out.println();
		System.out.println("---------------------| Relational operators |---------------------");
		System.out.println("Comparison(<,>,<=,>=,instanceof) -> ");
		int c = 100;
		if(c > 50)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
		
		System.out.println();
		System.out.println("Equality(==,!=) ->");
		if(c != 30)
		{
			System.out.println("Valid");
		}
		
		System.out.println();
		System.out.println("---------------------| Logical operators |---------------------");
		int num1 = 10;
		int num2 = 20;
		System.out.println((num1==10) && (num2==10));
		System.out.println((num1==10) || (num2==10));
		
		System.out.println();
		System.out.println("---------------------| Bitwise operators |---------------------");
		System.out.println(10&2);
		System.out.println(10|2);
		
		System.out.println();
		System.out.println("---------------------| Ternary operator |---------------------");
		int ans = num1==20?30:100;
		System.out.println(ans);
	}
}
