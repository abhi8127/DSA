package must_Do_question;

import java.util.Scanner;

//Given an integer N. Check whether N is prime or not.
public class CheckForPrimeNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not a prime number");
                break;
            }
            else
            {
                System.out.println("prime no");
                break;
            }
        }
    }
}
