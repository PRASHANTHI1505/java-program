import java.util.*;
class Frequency
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
      boolean b[]=new boolean[n];
      for(int m=0;m<b.length;m++)
        {
          b[m]=false;
        }
      for(int i=0;i<n;i++)
        {
          int count=1;
          if(b[i]==true)
          continue;
          for(int j=i+1;j<n;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println("the frequency of the" +a[i]+  "is"+ count);
          }
       
    }
  }