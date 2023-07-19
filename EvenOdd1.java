import java.util.*;
class EvenOdd1
  {
    public static void even(int num)
    {
      if(num%2==0)
      {
        System.out.print("num is even");
      }
      else
      {
        System.out.print("num is odd");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the num");
      int num=sc.nextInt();
      even(num);
    }
  }