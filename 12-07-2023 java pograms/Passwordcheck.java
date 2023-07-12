import java.util.Scanner;
class Passwordcheck
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a password");
      String str=sc.nextLine();
      int ucount=0,lcount=0,dcount=0,scount=0;
      if(str.length()>=8)
      {
        for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            {
              ucount++;
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
              lcount++;
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
            {
              dcount++;
      }
            else{
              scount++;
            }
          }
      }
      else
      {
              System.out.println("password must contain 8 characters");
              
            }
      if(ucount>0&&lcount>0&&scount>0&&dcount>0)
      {
        System.out.println("the password is strong");
      }
      else{
        System.out.println("the password is weak");
      }
            
          }
      }
    
  