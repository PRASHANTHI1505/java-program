import java.util.*;
class ArrayNegtive
  {
    public static void main(String args[])
    {
      int a[]=new int[6];
      Scanner sc=new Scanner(System.in);
      System.out.print("enter array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.print("negative elements are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+" ");
            }
        }
    }
  }