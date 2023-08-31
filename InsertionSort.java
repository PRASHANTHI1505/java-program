import java.util.*;
class InsertionSort
{
    public static void insertionSort(int a[])
    {
      int i,j,key;
      for(i=1;i<a.length;i++)
        {
          key=arr[i];
          j=i-1;
          while(j>=0 && key<=a[j])
            {
              a[j+1]=a[j];
              j=j-1;
            }
          arr[j+1]=key;

        }
    }
    public static void main(String args[])
    {
      int arr[]={22,27,25,15,10,12};
      System.out.println("before sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      insertionSort(arr);
      System.out.println();
      System.out.println("after sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
  }