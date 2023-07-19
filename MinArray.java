// without returntype with  parameters
import java.util.*;
class MinArray
  {
    public void min(int a[],int n)
    {
      int min=a[0];
      for(int i=1;i<n;i++)
        {
          if(min>a[i]);
          {
            min=a[i];
          }
        }
      System.out.println("the minimum element in yhe array are:"+min);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      MinArray s=new MinArray();
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the arra elements");
      for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
      s.min(a,n);
    }
    }
