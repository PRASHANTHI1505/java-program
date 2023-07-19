import java.util.*;
class Pairs
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the divisor to be divided");
      int k=sc.nextInt();
      int count=0;  
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
                if(i<j)
                {
                  if(a[i]+a[j]%k==0)                
                {
                  count=count+1;
                }
              }
            }
        }
      System.out.println("the possible pairs are "+count);
    }
  }