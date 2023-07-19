import java.util.Scanner;
class MaximumOfTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number2 : ");
        int num2 = sc.nextInt();
        if(num1>num2)
    {
    System.out.println("Maximum Number  " +num1);
    }
        else
    {
     System.out.println("Maximum Number " +num2);
     }
    }
  }
