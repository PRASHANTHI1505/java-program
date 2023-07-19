import java.util.*;
class ArrayOdd
  {
    public static void oddelements(int a[])
    {
      System.out.print("odd elements in the array are:");
      for(int j=0;j<a.length;j++)
        {
          if(a[j]%2!=0)
          {
            System.out.print(a[j]);
          }
        }
    }
    public static  void main(String args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the value");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      Oddelements(a);
    }
  }