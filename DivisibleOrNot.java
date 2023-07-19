import java.util.*;
class Divisible1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      int a=sc.nextInt();
      if(a%5==0&&a%11==0)
      {
        System.out.println("the given number is divisible by 5 and 11");
      }
      else
      {
        System.out.println("the given number is not divisible by 5 and 11");
      }
    }
  }

