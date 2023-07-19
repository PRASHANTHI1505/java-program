import java.util.*;
class CaluculatorSwitch
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      System.out.println("enter the operator");
      char ch=sc.next().charAt(0);
      switch(ch)
        {
        case '+':
          System.out.println("the addtion of the number is "+(a+b));
        break;
         case '-':
            System.out.println("the subtraction of the number is "+(a-b));
            break;
          case '*':
            System.out.println("the multiplication of the number is "+(a*b));
            break;
          case '/':
            System.out.println("the division of the number is "+(a/b));
            break;
          case '%':
            System.out.println("the remainder of the number is "+(a%b));
          break;
          default:
            System.out.println("entered value is invalid");
        }
    }
  }