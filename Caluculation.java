interface Calculator
  {
      void addition(int a,int b);
      void subtraction(int a,int b);
      void multplication(int a,int b);
      void division(int a,int b);
  }
class Arithmetic implements Calculator
  {
    public void addition(int a,int b)
    {
      System.out.println(a+b);
    }
    public void subtraction(int a,int b)
    {
      System.out.println(a-b);
    }
     public void multplication(int a,int b)
    {
      System.out.println(a*b);
    }
    public void division(int a,int b)
    {
      System.out.println(a/b);
    }
  }
class InterfaceEx
  {
    public static void main(String args[])
    {
      Calculator calc=new Arithmetic();    calc.addition(23,45);
      calc.subtraction(67,56);
      calc.multplication(2,12);
      calc.division(45,5);
    }
  }

       interface Human
{
  public void insert(String name,String address);
  public void display();
  public void print();
}
interface Person
  {
    public void insert(String name,String address);
    public void print();
  }
class Student implements Human,Person{
  String name;
  String address;
  public void insert(String name,String address)
  {
    this.name=name;
    this.address=address;
  }
  public void display()
  {
    System.out.println("displaying all details");
  }
  public void print()
  {
    System.out.println(name+" "+address);
  }
}
class Multiple
  {
    public static void main(String args[])
    {
      Human human=new Student();
      Person person=new Student();
      human.insert("pushpa","vij");
      human.display();
      human.print();
   //  person.display();
      person.insert("latha","guntur");
     person.print();
    }
  }