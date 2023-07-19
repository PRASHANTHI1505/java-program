import java.util.*;
class StrongNumber
  {
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int number=sc.nextInt();
      int temp=number;
      int sum=0,i;
      while(number>0)
        {
          int digit=number%10;
          int fact=1;
          for(i=1;i<=digit;i++)
            {
              fact=fact*i;
            }
          sum=sum+fact;
          number=number/10;
            }
      if(sum==temp)
      {
        System.out.println("strong number");
      }
      else
        System.out.println("not  strong number");
        }
    }
