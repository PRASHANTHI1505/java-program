import java.util.*;
class Odd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("entr the frist and lst numbers");
      int x=sc.nextInt();
      int y=sc.nextInt();
      int i;
      for(i=x;i<=y;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
  }