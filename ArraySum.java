import java.util.*;
class ArraySum
  {
    public static void arraySum(int arr[],int size)
    {
     
      
      int sum=0;
      for(int i=0;i<size;i++)
        {
             sum=sum+arr[i];
    }
    System.out.println("sum of the given elements of the array is :"+sum);
      
          }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
     int size=sc.nextInt();
      System.out.println("enter the array elements");
       int arr[]= new int[size];
      for(int i=1;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      arraySum(arr,size);
    }
  }