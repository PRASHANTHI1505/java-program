/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.*/
class EmployeeDetail
  {
    String name;
    String designation;
    int salary;
    public void EmployeeDetails(String n,String des,int sal)
    {
      name=n;
      designation=des;
      salary=sal;
    }
    public void display()
    {
      System.out.println("the name of the employee is:"+name);
      System.out.println("the designation of the employee is"+designation);
      System.out.println("the salary of the employee is"+salary);
    }
    public static void main(String args[])
    {
      Employee emp1=new Employee();
      Employee emp2=new Employee();
      emp1.EmployeeDetails("john","manager",25000);
      emp2.EmployeeDetails("martin","assitmanager",20000);
     emp1.display();
      emp2.display();
    }
  }