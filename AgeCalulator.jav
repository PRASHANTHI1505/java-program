import java.util.*;
class AgeCalculator

{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter birth year");
    int dob=sc.nextInt();
    int presentyear=2023;
    int age=(presentyear-dob);  
    {
     
    System.out.println("the age of the person is "+age);    
    }
    if(age>=18)
    {
      System.out.println("major");
    }
    else
    {
      System.out.println("minor");
    }
  }
}