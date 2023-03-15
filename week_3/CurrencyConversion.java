package Training.week_3;

//Program of converting the currency
import java.util.Arrays;
import java.util.Scanner;
import java.util.Currency;  

public class CurrencyConversion
{
 public static void main(String...args)
 {

     Scanner sc = new Scanner(System.in);

     Currency cur = Currency.getInstance("USD"); 
     String dollar = cur.getSymbol();
     System.out.println("Enter the choice for the conversion of the currency");
     System.out.println("Press 1 for  INR to " + dollar);
     System.out.println("Press 2 for " + dollar + " to INR");
     int choice = sc.nextInt();
     System.out.println("Enter the price to convert ");
     float currency=0.0f;

     switch(choice)
     {
         case 1:
             System.out.println("Enter Indian rupee");
             currency = sc.nextFloat();
             currency = currency / 82.81f;
             break;
         
         case 2:
             System.out.println("Enter US dollar");
             currency = sc.nextFloat();
             currency = currency * 82.81f;
             break;

         default:
             System.out.println("Invalid choice");
             break;
     }
     System.out.println("The value after conversion is " + currency);
     System.out.println();
 }
}