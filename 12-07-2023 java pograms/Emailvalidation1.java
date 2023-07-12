import java.util.*;
class Emailvalidation1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a email address");
      String email=sc.nextLine();
      int scount=0,ecount=0;
          if(email.contains("@")&&email.contains("."))
          {
            scount++;
          }
      if(email.endsWith(".com")||email.endsWith(".org"))
      {
        ecount++;
      }
      if(scount>0&&ecount>0)
      {
        System.out.println("email is valid");
      }
      else{
        System.out.println("email is invalid");
      }
        
        }
    }
  