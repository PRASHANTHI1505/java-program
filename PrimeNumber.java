import java.util.*;
class PrimeNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a Number");
      int n=sc.nextInt();
      int i,count=0;
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
            }
        }
      if(count==2)
      {
        System.out.println("you have entered the prime number");
      }
      else{
        System.out.println("you have entered the not a prime number");
      }
      }
    }
  