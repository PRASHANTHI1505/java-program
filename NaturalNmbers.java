import java.util.*;
class NaturalNumber
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
     int n=sc.nextInt();
      int i,sum=0;
      for(i=1;i<=n;i++)
      {
        sum=sum+i;
        System.out.println("the sum of "+n+"natural numbers is"+sum);
      }
    }
  }
