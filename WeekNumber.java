import java.util.*;
class WeekNumber
  {
    public static void main(String args[])
    {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the week number from(1-7)");
int num=input.nextInt();
switch(num)
  {
    case 1:
      System.out.println("this is a sunday");
      break;
    case 2:
      System.out.println("this is a monday");
      break;
    case 3:
      System.out.println("this is a tuesday");
    case 4:
      System.out.println("this is a wednesday");
      break;
    case 5:
      System.out.println("this is a thursday");
      break;
    case 6:
      System.out.println("this is a friday");
      break;
    case 7:
      System.out.println("this is a saturday");
      break;
    default:
      System.out.println("entered number is invalid ");
  } 
      
  }
  }