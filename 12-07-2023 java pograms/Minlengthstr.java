import java.util.*;
class Minlengthstr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int min=s[0].length();
      String s1="";
      for(int i=0;i<s.length;i++)
        {
          if(min>s[i].length())
          {
            min=s[i].length();
            s1=s[i];
          }
        }
      System.out.println("the minimum word in the string is: "+s1);
      
    }
  }