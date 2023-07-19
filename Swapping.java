import java.util.*;
class Swapping
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter A value:");
      int A=sc.nextInt();
      System.out.println("enter B value:");
      int B=sc.nextInt();
      System.out.println("before swapping of values A,B are "+(A)+"," +(B));
      A=A+B;
      B=A-B;
      A=A-B;
      System.out.println("After swapping of values A,B are "+(A)+"," +(B));
     
    }
  }
