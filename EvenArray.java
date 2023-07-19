//with return type with parameters
import java.util.*;
class EvenArray
  {
    public int even(int a[],int n)
    {
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
            b=a[i];
          }
        }
      return b;
    }
    public static void main(String args)
    {
      Scanner sc =new Scanner(System.in);
      EvenArray s=new EvenArray();
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int [n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int result=s.even(a,n);
      System.out.println("the even numbers are:");
      System.out.println(result);
    }
  }