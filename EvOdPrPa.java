//wap to find even and odd and prime and palindrome elements in an array
import java.util.*;
class EvOdPrPa 
  {
    public static void even(int a[])
    {
      System.out.println("the even elements in the array are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            System.out.print(a[i]+" ");
          }
        }
      System.out.println();
    }
    public static void odd(int a[])
    {
      System.out.println("the odd numbers in the array are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.print(a[i]+" ");
          }
        }
      System.out.println();
    }
    public static void prime(int a[])
    {
      System.out.println("the prime elements in the array are");
      for(int i=0;i<a.length;i++)
        {
          int count=0;
          for(int j=1;j<=a[i];j++)
            {
              if(a[i]%j==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.print(a[i]+" ");
          }
        }
      System.out.println();
    }
    public static void palindrome(int a[])
    {
      System.out.println("the palindrome numbers in the array are");
      for(int i=0;i<a.length;i++)
        {
          int temp=a[i];
          int rev=0;
          while(a[i]>0)
            {
              int digit=a[i]%10;
              rev=(rev*10)+digit;
              a[i]=a[i]/10;
            }
          if(temp==rev)
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
      int a[]=new int[n];
      System.out.println("enter elements in to array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      even(a);
      odd(a);
      prime(a);
      palindrome(a);
    }
  }