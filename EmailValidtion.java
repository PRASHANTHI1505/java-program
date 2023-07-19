import java.util.Scanner;
class Email
  {
    public static void main(String args[])
    {
      int a=0,s=0,d=0,count=0;
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the email");
      String email=sc.nextLine();
      for(int i=0;i<email.length();i++)
        {
           ch=email.charAt(i);
          if(ch>='a'&&ch<='z')
          {
            a++;
          }
            else if(ch>='0'&&ch<='9')
          {
           
          d++;
          }
          else{
            s++;
          }
        }
      if(a>0 && d>0 && s>0)
      {
        System.out.println("it is a valid emai");
      }
      else
        System.out.println("invalid email");
    }
  }