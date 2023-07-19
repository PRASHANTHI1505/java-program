import java.util.*;
class ReverseString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s=" ";
      for(int i=0;i<str.length();i++)
        {
        char ch=str.charAt(i);
          s=ch+s;
        }
      System.out.println("the reverse of the string is:"+s);
    }
  }