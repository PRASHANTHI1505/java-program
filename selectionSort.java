import java.util.*;
class Selectionsort
  {
    public static void selectionSort(int arr[])
    {
      int i,j,temp=0;
      for(i=0;i<arr.length;i++)
        {
          int min=i;
          for(j=i+1;j<arr.length;j++)
            {
              ifimport java.util.*;
class SelectionSort
  {
    public static void selectionSort(int arr[])
    {
      int i,j,temp=0;

      for(i=0;i<arr.length;i++)
        {
          int min=i;
          for(j=i+1;j<arr.length;j++)
            {
             if(arr[j]<arr[min])
                min=j;
            }
          temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr[]={7,4,10,8,3};
      System.out.println("before sorting");
   for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      selectionSort(arr);
      System.out.println("after sorting");
       System.out.println();
      for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }
    }
  }(arr[j]<arr[min])
                min=j;
            }
          temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int arr[]={7,4,10,8,3};
      System.out.println("before sorting");
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
      selectionSort(arr);
      System.out.println("after sorting");
       System.out.println();
      for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
  }