import java.util.*;
class Employee
  {
    String name;
    int salary;
    String designation;
    public void display()
    {
      System.out.println("the name of the employee:"+name);
      System.out.println("the salary of the employee:"+salary);
      System.out.println("the designation of the employee is:"+designation);
    }
    public static void main(String args[])
    {
      Employee e1=new Employee();
      e1.name="anu";
      e1.salary=20000;
      e1.designation="employee";
      Employee e2=new Employee();
      e2.name="chinnu";
      e2.salary=25000;
      e2.designation="asstManager";
      Employee e3=new Employee();
      e3.name="aishu";
      e3.salary=30000;
      e3.designation="teamlead";
      e1.display();
      e2.display();
      e3.display();
        
    }
  }