/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Employee
  {
    String name;
    String designation;
    int salary;
    public void Employee(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void display()
    {
      System.out.println("the employee name is:"+name);
      System.out.println("the employee designation is:"+designation);
      System.out.println("the employee salary is:"+salary);
    }
    public static void main(String args[])
    {
      Employee e=new Employee("anu","manager"35000);
      Employee e1=new Employee("aishu","assitmanager",20000);
      e.display();
      e1.display();
      
    }
  }