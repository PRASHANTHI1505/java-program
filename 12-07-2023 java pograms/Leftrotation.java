import java.util.*;
class Leftrotation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter how many positions you want to shift");
      int k=sc.nextInt();
     
      for(int i=1;i<=k;i++)
        {
           int temp=a[0];
          for(int j=0;j<n-1;j++)
            {
              a[j]=a[j+1];
            }
          a[n-1]=temp;
        }
      System.out.println("after the rotation the array is");
      for(int i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }