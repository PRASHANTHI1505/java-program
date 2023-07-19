import java.util.*;
class InnerFor
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the values of a and b");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int i,j;
      for(i=1;i<=a;i++)
        {
          for(j=1;j<b;j++)
            {
          System.out.println("i="+i);
        }
      System.out.println("j="+j);
        }
    }
  }