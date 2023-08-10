/*Assignment 1: Create a Class with Encapsulation

Create a class named "Person" with private attributes: name, age, and email.
Provide public getter and setter methods for each attribute.
Write a displayInfo() method within the class to display all the details of the person.
In the main method, create an object of the class and set values for the attributes using setter methods. Then, call the displayInfo() method to show the details of the person.*/
class Person
  {
    private String name;
    private int age;
    private String email;
      public void setName(String name)
        {
        this.name=name;
        }
    public String getName()
    {
      return name;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
    public void setEmail(String email)
    {
      this.email=email;
    }
    public String getEmail()
    {
      return email;
    }
   public void displayInfo()
    {
      System.out.println("the person name is "+getName());
      System.out.println("the person age is"+getAge());
      System.out.println("the person email is "+getEmail());
    }
  }
    class PersonDetails
      {
        public static void main(String args[])
        {
          Person person=new Person();
          person.setName("prashanthi");
          person.setAge(23);
          person.setEmail("prashanthinaidu1505@gmail.com");
          person.displayInfo();
          
        }
  }