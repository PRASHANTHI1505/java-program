class Student
  {
    int rollno;
    String name;
    public void insert(int r,String n)
    {
      rollno=r;
      name=n;
    }
    public void display()
    {
      System.out.println("the rollno of the student  is:"+rollno);
      System.out.println("the name of the student is:"+name);
    }
    public static void main(String args[])
    {
      Student student1=new Student();
      Student student2=new Student();
      student1.insert(1,"anu");
      student2.insert(2,"janu");
      student1.display();
      student2.display();
    }
    }
  