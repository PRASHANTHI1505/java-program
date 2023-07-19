import java.util.Scanner;
class Divisible
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
      if(a%b==0)
      {
        System.out.println(" a is divisible by  b");
      }
      else{
        System.out.println("not divisible");
      }
      }
  }