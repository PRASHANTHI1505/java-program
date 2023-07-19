/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Student
  {
    String name;
    int rollno;
    char grade;
    public void Student(String n,int r,char g)
    {
      name=n;
      rollno=r;
      grade=g;
     }
    public void display()  
    {
      System.out.println("the student name is:"+name);
      System.out.println("the student rollno is"+rollno);
      System.out.println("the grades og the student is"+grade);
    }
    public static void main(String args[])
    {
      Student s=new Student("anu",73,"A");
      Student s1=new Student("aishu",101,"B");
      s.display();
      s1.display();
    }
  }