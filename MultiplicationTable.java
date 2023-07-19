import java.util.*;
class MultiplicationTable
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter the number for multiplication");
      int  n=sc.nextInt();
      int i,result;
      System.out.println("the multiplication table is");
      for(i=1;i<=10;i++)
        {
          result=n*i;
          System.out.println(n+"*"+i+"="+result);
        }
       }
  }