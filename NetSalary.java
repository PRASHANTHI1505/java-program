import java.util.*;
class NetSalary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double tax,netsalary;
      System.out.println("enter basic salary of the employee");
      double basicsalary=sc.nextDouble();
      double annualsalary=(basicsalary*12);
      System.out.println("the annual salary of the employee is"+annualsalary);
      if(annualsalary<=200000)
      {
        System.out.println("no tax deduction");
      }
      else if((annualsalary>200000)&&(annualsalary<=600000))
      {      
        tax=((annualsalary*10)/100);
        netsalary=(annualsalary-tax);
        System.out.println("the tax deducted by the employee is"+tax);
        System.out.println("the net salary of the employee is"+netsalary);
      }
      else if((annualsalary>600000)&&(annualsalary<=800000))
      {
        tax=((annualsalary*20)/100);
        netsalary=(annualsalary-tax);
        System.out.println("the tax amoun deducted for the employee is"+tax);
        System.out.println("the net salary of the employee is"+netsalary);
      }
      else{      
        tax=((annualsalary*25)/100);
         netsalary=(annualsalary-tax);
        System.out.println("the tax amount deducted for the employee is "+tax);
        System.out.println("the net salary of the employee is "+netsalary);
      }
    }
  }
