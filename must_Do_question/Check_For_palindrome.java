package must_Do_question;

import java.util.Scanner;

public class Check_For_palindrome {
    public static void main(String[] args)
    {
        System.out.println("Please Enter the string to check");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.println("String is :"+ str);
        String rev="";
        for(int i=0;i<str.length();i++)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse String is :"+ rev);
        if(rev.equalsIgnoreCase(str)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }
    }
}
