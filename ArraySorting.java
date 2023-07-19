import java.util.*;
class ArraySorting
  {
    public static void sort(int a[],int size)
    {
      int temp=0;
      for( int i=0;i<size;i++)
        {
          for( int j=i+1;j<size;j++)
            {
              if(a[j]<a[i])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("after the sorting elements are:");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+" ");
        }
    }
  public static void main(String args[])  
{
  Scanner sc=new Scanner (System.in);
  System.out.println("enter the size of the array");
  int size=sc.nextInt();
  int a[]=new int[size];
  System.out.println("enter the array elements");
  for(int i=0;i<size;i++)
    {
      a[i]=sc.nextInt();
    }
  sort(a,size);

    }
}