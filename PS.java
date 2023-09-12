/* write a program to find perfect number and strong number in the given array.*/
import java.util.*;
class PS
    {
    public static void perfect(int a[])
    {
      System.out.println("the perfect numbers in the array are");
      for(int i=0;i<a.length;i++)
        {
          int sum=0;
          for(int j=1;j<a[i];j++)
            {
              if(a[i]%j==0)
              {
                sum=sum+j;
              }
            }
          if(sum==a[i])
          {
            System.out.print(a[i]+" ");
          }
        }
      System.out.println();
    }
    public static void strong(int a[])
    {
      System.out.println("the strong numbers in the array are");
      for(int i=0;i<a.length;i++)
        {
          int sum=0;
          int temp=a[i];
          while(a[i]>0)
            {
              int fact=1;
              int digit=a[i]%10;
              for(int j=1;j<=digit;j++)
                {
                  fact=fact*j;
                }
              sum=sum+fact;
              a[i]=a[i]/10;
            }
          if(temp==sum)
          {
            System.out.print(temp+" ");
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      perfect(a);
      strong(a);
    }
  }