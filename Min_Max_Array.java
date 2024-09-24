import java.util.Scanner;

public class Min_Max_Array {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("enter the element of the array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max =arr[0];
    int min=arr[0];
    for(int i=1;i<n;i++)
    {
        if(arr[i]<min){
            min=arr[i];

        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.println("min of the array is "+ min);
    System.out.println("max of the array is "+ max);

}
}
