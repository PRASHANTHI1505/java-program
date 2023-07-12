import java.util.*;

class Palindromesent {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str = sc.nextLine();
    String s[] = str.split(" ");
    for (int i = 0; i < s.length; i++) 
    {
      String temp=s[i];
      String rev="";
      {
        for(int j=temp.length()-1;j>=0;j--)
          {
            rev=rev+temp.charAt(j);
          }
        if(rev.equals(temp))
        {
          System.out.println(temp);
        }
      }
    }
  }
}