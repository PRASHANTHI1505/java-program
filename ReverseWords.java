import java.util.*;
class ReverseWords
  {
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      String str1=" ";
      for(int i=s.length-1;i>=0;i--){
         str1=str1+s[i];
         }
      System.out.println("the reverse of the given string is:"+str1); 
    }
  }