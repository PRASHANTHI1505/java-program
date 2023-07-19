import java.util.*;
class Student
  {
    String name;
    int rollno;
    char grade;
    Student(String n,int r,char g)
    {
      name =n;
      rollno=r;
      grade=g;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(Systen.in);
      Student student[]=new Student[2];
      for(int i=0;i<student.length;i++)
        {
          System.out.println("enter the student"+(i+1)+"details");
          System.out.println("enter the student name");
          String name=sc.next();
          System.out.println("enter the student rollno");
          int rollno=sc.nextInt();
          System.out.println("enter the student grades");
          char grade=sc.nextChar();
          Student[i]=new Student(name,rollno,grade);
           }
      for(int i=0;i<student.length;i++)
        {
          student[i].display();
        }
    }
    public void display()
    {
      System.out.println("student name is :"+name);
      System.out.println("student rollno is:"+rollno);
      System.out.println("student grade is"+grade);
    }
  }