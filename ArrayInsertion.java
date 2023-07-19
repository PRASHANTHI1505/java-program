import java.util.*;
class InsertionArray
  {
     public static void insert(int a[],int b[],int size,int pos,int value)
    {      
      for(int i=0;i<size+1;i++)
        {
          if(i==pos)
          {
            b[i]=value;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else{
            b[i]=a[i];
          }
        }
      System.out.println("after inserting the elements");
      for(int i=0;i<size+1;i++)
        {
          System.out.println(b[i]+" ");
        }
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
      int b[]=new int[size+1];
      System.out.println("enter the element to be inserted");
       int value=sc.nextInt();
      System.out.println("enter the position of the array to be inserted ");
     int pos=sc.nextInt();
      insert(a,b,size,pos,value);
    }
   
  }