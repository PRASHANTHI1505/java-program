import java.util.*;
class ArrayAvg
  {
    public static void average(int a[],int size)
    {
      int sum=0;
      double average=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
          average=sum/size;
        }
      System.out.println("the average of the array is "+average);  
    }    
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      average(a,size);
    }
  }
       