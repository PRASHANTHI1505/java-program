import java.util.*;
class Leneachword
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      for(int i=0;i<s.length;i++)
        {
          System.out.println(s[i]+" "+s[i].length());
        }
    }
  }