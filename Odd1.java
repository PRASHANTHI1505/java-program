import java.util.*;
class Odd1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
          char option;
     do{
       System.out.println("enter the frist value");  
       int first=sc.nextInt();
       System.out.println("enter the last value");
       int last=sc.nextInt();
       int i,n;
   
       for(i=first;i<=last;i++)
         {
           if(i%2==0)
           {
             continue;
           }
           System.out.println(i);
         }
       System.out.println("do you want to continue y/n" );
       option=sc.next().charAt(0);
      }
        while(option=='y'||option=='Y');
      {
        System.out.println("exit");
      }
    }
  }