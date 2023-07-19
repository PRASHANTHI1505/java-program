import java.util.*;
class ReplaceAll
  {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the String");
      String str=sc.nextLine();
      String str1=str.replaceAll("[()]"," ");
      System.out.println(str1);
    }
  }