package must_do_question;

import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position of fibonacci number you want  ");
        int n= sc.nextInt();
        System.out.println(nthfibonaaci(n));
    }
    public static int nthfibonaaci(int n){
        if(n==0)
        {
            return 0;
        } else if (n==1)
        {
            return 1;
        }
        else
        {
            return nthfibonaaci(n-1)+nthfibonaaci(n-2);
        }
    }
}
