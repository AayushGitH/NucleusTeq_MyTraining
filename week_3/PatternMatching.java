package Training.week_3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PatternMatching
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text for pattern matching");
        String str = sc.nextLine();
        if(Pattern.matches("443[^a-z]*",str))
        {
            System.out.println("Pattern matches, you are allowed");
        }
        else
        {
            System.out.println("Oops, pattern doesn't match, try later !!");
        }

    }
}