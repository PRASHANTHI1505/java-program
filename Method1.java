import java.util.*;
class Method1
  {
    public static void StudentDetails(String name,int rno)
    {
      System.out.println("the student name is:"+name+"roll no is:"+rno);
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("enter the student name");
    String sname=sc.nextLine();
    System.out.println("enter student number");
int srno=sc.nextInt();
StudentDetails(sname,srno);
StudentDetails("prshanthi",73); 
    }
  }