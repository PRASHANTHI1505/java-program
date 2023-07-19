import java.util.Scanner;
class Greater
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int number=sc.nextInt();
      if(number>10)
      {
       System.out.println("greater number");
      }
      else{
        System.out.println("not greater number");
      }
    }
  }
