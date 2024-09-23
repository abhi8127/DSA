package must_Do_question;

import java.util.Scanner;

//Check if the given number is a power of two
public class PowerOfTwo {
    public static void main(String[] args){
        System.out.println("Enter the number you want to check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<1)
        {
            System.out.println("number can not be written as a power of two");

        } else {

            while(n%2==0){
                n=n/2;
            }
        }
        if(n==1){
            System.out.println("number can be written as a power of two");
        }
      else if(n>1) {
          System.out.println("number can not be written as a power of two");
      }
    }
}
