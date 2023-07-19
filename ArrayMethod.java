import java.util.*;
class ArrayMethod
  {
    public void arr(int a[],int n)
    {
      System.out.print(a[i]+" ");
    }
  }
public static void main(String args[])
  {
  Scanner sc=new Scanner (System.in);
  System.out.println(" enter the size of the array");
  int n=sc.nextInt();
  System.out.println("enter the array elements");
  int a[]=new int [n];
  for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
        }
  ArrayMethod b=new ArrayMethod();
  b.aarr(a,n);
  }
}