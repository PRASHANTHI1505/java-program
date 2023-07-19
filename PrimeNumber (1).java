import java.util.*;
class PrimeNumbers
  {
    public static void main(String args)
    {
     int i,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the  first number");
      int first=sc.nextInt();
      System.out.print("enter the last number");
      int last=sc.nextInt();
      for(i=first;i<=last;i++)
        {
          if(first%last==0)
          {
            count=count+1;
          }
          if(count==2)
          {
            System.out.print("prime number");
          }
        }
    }
    }