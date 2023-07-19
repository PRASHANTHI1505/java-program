import java.util.*;
class NumberGuessingGame
  {
    public static void main(String args[])
    {
      int num=50;int i;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the guessing number");
      int guessingnumber =sc.nextInt();
      if(num>guessingnumber)
      {
        System.out.print("the number is high than the guessing number");
      }
      else  if(num<guessingnumber)
      {
        System.out.println("the number is low than the guess number");
      }
             
 else {
     System.out.print("number is equal to guessing number");   
      }
    }
    
  }