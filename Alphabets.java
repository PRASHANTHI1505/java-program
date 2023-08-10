/*Suppose you are working on a project that requires you to count the number of elements in an array that have a specific property, 
such as being an even number, odd number, prime number, and palindrome. You decide to create a program to automate this process.
Write a Java program to count the number of elements in an array that have a specific property. 
The program should prompt the user to enter the size of the array and then input the elements of the array dynamically. 
After inputting the array elements, the program should count the number of elements that have each specific property and display the results.
For example, if the user enters an array of size 5 with the elements {3, 2, 5, 7, 121}, 

the program should output:

Number of even elements: 1
Number of odd elements: 4
Number of prime elements: 4
Number of palindrome elements: 1*/
import java.util.*;
class Alphabets
  {
    public static void even(int a[],int n)
    {
      int evencount=0;
      for(int i=0;i<n;i++)
        {
          if(a[i]%2==0)
          {
             evencount=evencount+1;
          }
        }
      System.out.println("even elements in the given array are"+evencount);
    }
   public static void odd(int a[],int n)
    {
      int oddcount=0;
      for(int i=0;i<n;i++)
        {
          if(a[i]%2!=0)
          {
            oddcount=oddcount+1;
          }
        }
      System.out.println("odd count in the givven array is:"+oddcount);
    }
    public static void prime(int a[],int n)
    {
      int primecount=0;
      for(int i=0;i<n;i++)
        {
          int c=0;
          for(int j=0;j<=a[i];j++)
            {
              if(a[i]%j==0)
              {
                c=c+1;
              }
            }
          if(c==2)
          {
            primecount=primecount+1;
          }
        }
      System.out.println("prime elements in the given array are"+primecount);
    }
    public static void palindrome(int a[],int n)
    {
      int palindromecount=0;
      for(int i=0;i<n;i++)
        {
          int rev=0;
          int temp=a[i];
          while(a[i]>0)
            {
              int s=a[i]%10;
              rev=(rev*10)+5;
              a[i]=a[i]/10;
            }
          if(temp==rev)
          {
            palindromecount=palindromecount+1;
         }
        }
      System.out.println("palindrome elements in the given array are"+palindromecount);
    }
    public static void main(String args[])
    {
      System.out.println("enter the array size");
      int n=sc.nextInt();
      int a[]=new int [n];
      System.out.println("enter array elemets");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      even(a,n);
      odd(a,n);
      prime(a, n);
      palindrome(a, n);
    }
  }