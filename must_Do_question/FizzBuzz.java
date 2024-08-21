package must_Do_question;

import java.util.Scanner;

//Given an integer N. Print the numbers from 1 to N and for multiples of ‘3’ print “Fizz”
// instead of the number, for the multiples of ‘5’ print “Buzz” and for multiples of
// both 5 and 3 print "FizzBuzz"
public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter the number");

        int N= sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i%3==0 && i%5==0)
            {
                System.out.print("FizzBuzz"+" ");
            }
            else if (i%3==0)
            {
                System.out.print("Fizz"+" ");
            }
            else if (i%5==0)
            {
                System.out.print("Buzz"+" ");
            }
            else
            {
                System.out.print(i+" ");
            }
        }
    }
}
