import java.util.*;
class OddArray
  {
    public  int odd(int a[],int n)
    {
     for(int i=0;i<n;i++)
       {
         if(a[i]%2!=0)
         {
           b=a[i];
         }
       }
      return b;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      OddArray s=new OddArray();
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int [n];
       System.out.println(" enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int result=s.odd();
     System.out.println("the odd elements are:");
      System.out.println(result);
    }
  }