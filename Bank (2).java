/*Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
import java.util.*;
class InsufficientFundsException extends Exception
{
  InsufficientFundsException(String message)
  {
    super(message);
  }
}
class Transactions
  {
    double balance;
    public void setDetails(double balance)
    {
      this.balance=balance;
    }
    public void deposit(double amount)
    {
      balance=balance+amount;
      System.out.println("deposit succssful");
      System.out.println("current balance is"+balance);
    }
    public void withDraw(double amount) throws InsufficientFundsException
    {
      if(amount>balance)
      {
        throw new InsufficientFundsException("Insufficient balance");
      }
      else
      {
        balance=balance-amount;
        System.out.println("Withdraw successful");
        System.out.println("current balance is"+balance);
      }
      }
    }
  }