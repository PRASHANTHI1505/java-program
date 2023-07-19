import java.util.Scanner;
class AlphabetOrDigitOrSpecial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      char ch=sc.next().charAt(0);
      if(((ch<='Z')&&(ch>='A'))||((ch<='z')&&(ch>='a')))
      {
        System.out.println("Given character is a alphabet");
      }
      else if((ch>=0)&&(ch<=9))
      {
        System.out.println("Given value is digit");
      }
      else
      
    {
      System.out.println("given value is special character ");
    }
    }
    
  }