import java.util.Scanner;
class MaximumOfThree
{
  public static void main(String[] args){
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the number1 : ");
    int num1=input.nextInt();
     System.out.println("Enter the number2 : ");
    int num2=input.nextInt();
     System.out.println("Enter the number3 : ");
    int num3=input.nextInt();
    if(num1>num2 && num1>num3)
    {
      System.out.println(" num1 is greatest among 2:+num1");
    }
    else if(num2>num3){
      System.out.println(" num2 is greatest among 2 : "+num2);
    }
    else
    {
      System.out.println(" num3 is greatest among 2 : "+num3);
    }
  }
}