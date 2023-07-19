//with return type with out parameters
import java.util.*;
class SumArray
  {
    public int sum()
    {
      int sum=0;
      Scanner sc=new Scanner (System.in);      System.out.println("enter the size of the array ");
      int n=sc.nextInt();
      int a[]=new int[n];
       System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          }
      for(int i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
      return sum;
    }
    public static void main(String args[])
    {
      SumArray s=SumArray();
      int result=s.sum();
      System.out.println("the sum of the rray elements are:"+result);
    }
  }