import java.util.*;
class Atm
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
       int balance = 100000, withdraw, deposit;  
      System.out.println("ATM transactions");
      System.out.println("choose 1 for the withdraw");
      System.out.println("choose 2 for the deposit"); 
      System.out.println("choose 3 for the balance check ");
      System.out.println("choose 4 for the pin change"); 
      System.out.println("choose the  operation you want to perform");
      int choice=sc.nextInt();
      switch(choice)
        {
          case 1:
             System.out.println("enter money to be withdrawn:");
            withdraw=sc.nextInt();
            if(balance>= withdraw)
            {
              balance=balance-withdraw;
              System.out.println("please collect your money");              }
           else 
            {
            System.out.println("Insufficient funds");
              } 
            System.out.println("");
            break;
            
          case 2:
            System.out.println("enter money to be deposited:");
          deposit=sc.nextInt();
            balance=balance+deposit;
            System.out.println("");
            break;
            
          case 3:
            System.out.println("Balance: "+balance);
             break;
            
          case 4:
            System.out.println("enter pin to be change");
            System.out.println("enter your pin");
            int pin=sc.nextInt();
              if(pin==1234)
            {
              System.out.println("valid pin");
            }
            else
            {
              System.out.println("in valid pin");
              System.out.println(""); 
              break;
            }
        default:
        System.out.println("entered value is invalid");
        }
      }
    }
  