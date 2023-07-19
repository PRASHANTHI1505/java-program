/*parameterized constructor*/
class Student
  {
    Student(String name,int rollno)
    {
      System.out.println(name+" "+rollno);
    }
    public static void main(String args[])
    {
      Student student=new Student("james",123);
    }