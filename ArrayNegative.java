import java.util.*;
class ArrayNegative
  {
    public static void main(String args[])
    {
      int position=sc.nextInt();
      int a[]=new int[6];
      int b[]=new int[6];
      Scanner sc=new Scanner(System.in);
      System.out.print("enter array elements: ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      /*for(int i=0;i<a.length;i++)
        {
          b[i]=a[i];
        }
       System.out.println("the copied elements are");
      for(int i=0;i<a.length;i++)
      {
        System.out.println(b[i]);
      }*/
        for(int i=0;i<a.length;i++)
          {
            if(i==position)
            {
              a[i]=a[i+1];
            }
          }
      System.out.println("the elements after the deletion");
      for(int i=0;i<a.length;i++)
        {
          
        }
     
      /*for(int i=0;i<a.length;i++)
        {
          if(a[i]<0)
          {
            System.out.println(a[i]+" ");
            }
  }*/
    }
  }