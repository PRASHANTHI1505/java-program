import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      int amount=sc.nextInt();
      int tcount=0;
      int fcount=0;
      int hcount=0;
      if(amount%100==0)
      {
        while(amount>0)
          {
         if(amount>=1000)
            {
               tcount=amount/1000;
              amount=amount%1000;              
            }
         else if(amount>=500&&amount<1000)
            {
               fcount=amount/500;
              amount=amount%500;
            }
        else
        {
          hcount=amount/100;
          amount=amount%100;          
        }
          }
        System.out.println("the total number of notes presten inthe amount is"+(tcount+fcount+hcount));
      }
        
      else{
        System.out.println("enter the amount multiple of 100");
      }
    }
  }
          