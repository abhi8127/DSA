package must_Do_question;

import java.util.Arrays;
import java.util.Scanner;

//Check whether two given strings X and Y of sizes N and M respectively are anagram of each other or not.
public class Check_for_Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.next();
        System.out.println("Enter the first string");
        String s2=sc.next();

        int s1length=s1.length();
        int s2length=s2.length();

        if(s1length!=s2length){
            System.out.println("Not an Anagram");
        }
        else {
            if(anagram(s1,s2,s1length)){
                System.out.println("Its an Anagram");
            }
            else{
                System.out.println("Not an Anagram");
            }
        }



    }
    public static boolean anagram(String a, String b,int n){
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String str1 = String.valueOf(arr1);
        System.out.println(str1);
        String str2=String.valueOf(arr2);
        System.out.println(str2);
        for(int i=0;i<n;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
