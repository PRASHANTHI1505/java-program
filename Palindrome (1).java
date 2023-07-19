import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      int reverse=0,temp;
      temp=n;
      while(n>0)
        {
          int a=n%10;
          reverse=(reverse*10)+a;
          n=n/10;
        }
        if(temp==reverse)
          System.out.println("the  number is palindrome :");
      else
          System.out.println("the number is not a palindrome");
    }
  }