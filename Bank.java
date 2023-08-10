/*Challenge-5:
You are tasked with developing a banking solution that allows customers to create accounts, deposit and withdraw money, check their balance, and view their account information. 
As a software developer, your task is to create a program that can perform these operations using object-oriented programming concepts.
Task: Write a Java program that implements a Bank class and an Account class. The Bank class should contain methods for creating new accounts, depositing and withdrawing money, and checking daily withdrawal limits. 
The Account class should store information about individual customer accounts, such as the account number, account holder name, and current balance.

Instructions:
Create an Account class with the following instance variables:
1. accountNumber (String)
2. accountHolderName (String)
3. balance (double)
Create a Bank class that contains an Object Array of Account objects, which will be used to store the account information.
Add a method called createAccount() to the Bank class that takes the account holder name and initial balance as parameters and creates a new Account object with a unique account number.
Add a method called deposit() to the Account class that takes an amount parameter and adds it to the account balance.
Add a method called withdraw() to the Account class that takes an amount parameter and subtracts it from the account balance. The method should also check if the withdrawal amount exceeds the daily withdrawal limit, 
which should be set to a default value of $500.

Add a method called checkBalance() to the Account class that returns the current balance of the account.
Add a method called displayInfo() to the Account class that displays the account number, account holder name, and current balance of the account.
In the main method of the program, prompt the user to select an operation:
1 to create a new account
2 to deposit money
3 to withdraw money
4 to check the balance
5 to display account information
6 to exit the program
Based on the user's selection, call the appropriate method in the Bank or Account class.

Repeat steps 6 until the user chooses to exit the program.

Example Output:

Welcome to the Bank Management System!
Please select an operation:
Create an account
Deposit money
Withdraw money
Check the balance
Display account information
Exit the program
Enter your choice: 1
Enter account holder name: John Doe
Enter initial balance: 1000
Account created successfully!
Account number: 1001
Account holder name: John Doe
Current balance: 1000.0
Please select an operation:

Create an account
Deposit money
Withdraw money
Check the balance
Display account information
Exit the program
Enter your choice: 2
Enter account number: 1001
Enter amount to deposit: 500
Amount deposited successfully!
Current balance: 1500.0
Please select an operation:
Create an account
Deposit money
Withdraw money
Check the balance
Display account information
Exit the program
Enter your choice: 3

Enter account number: 1001
Enter amount to withdraw: 800
Amount withdrawn successfully!
Current balance: 700.0

Please select an operation:
Create an account
Deposit money
Withdraw money
Check the balance
Display account information
Exit the program
Enter your choice: 4
Enter account number: 1001
Current balance: 700*/
import java.util.*;
class Bank
  {
    String Accname;
    float accbal;
    public void initializeAccount(String accname,float accbal)
    {
      accname=name;
      accbal=bal;
    }
    public void displayAccountDetails()
    {
      System.out.println("name of the account holder:"+Accname);
      System.out.println("account balance:"+accbal);
    }
  }
  public void deposit(float amount)
    {
      System.out.println("deposit amount is "+amount);
      balance=balance+amount;
    System.out.println("deposit successful");
   System.out.println("current balance is "+balance);
    }
    public void withDraw(float amount)
    {
      System.out.println("withdraw amount is "+amount)
      if(amount<balance)
      {
        balance=balance-amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is "+balance);
      }
      else{
        System.out.println("enter sufficient balance");
      }
    }
    public void getBalance()
    {
      System.out.println("current balance in the account is "+balance);
    }
  }
class SavingsAccount extends BankAccount{
  public void deposit(float amount)
  {
    System.out.println("deposit amount is "+amount);

      balance=balance+amount;

      System.out.println("deposit successful");

      System.out.println("current balance is "+balance);
    }
    public void withDraw(float amount)
    {
      System.out.println("withdraw amount is "+amount);
      if(amount<balance)
      {
        balance=balance-amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is "+balance);
      }
      else{
        System.out.println("enter sufficient balance");
      }
    }
    public void getBalance()
    {
      System.out.println("current balance in the account is "+balance);
    }
  }
class Transactions
  {
    public static void main(String args[])
    {
      CheckingAccount ca=new CheckingAccount();
      SavingsAccount sa=new SavingsAccount();
      ca.deposit(1000.0f);
      ca.withDraw(500.0f);
      ca.getBalance();
     sa.deposit(1000);
      sa.withDraw(500);
      sa.getBalance();
    }
  }