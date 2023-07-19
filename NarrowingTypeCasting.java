import java.util.Scanner;
class NarrowingTypeCasting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      String name=sc.nextLine();
      String value=(String)name;
      System.out.println(value);
                        
    }
  }