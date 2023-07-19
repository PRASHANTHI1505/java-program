/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class Car1
  {
    String make;
    String model;
    int year;
    public void setCarDetails(String n,String m,int y)
    {
      make=n;
      model=m;
      year=y;
      }
    public void display()
    {
      System.out.println("the make of the car is:"+make);
      System.out.println("the model of the car is:"+model);
      System.out.println("the year of the year is:"+year);
    }
    public static void main(String args[])
    {
      Car car1=new Car();
      Car car2=new Car();
      car1.setCarDetails("maruthi","suzuki",1996);
      car2.setCarDetails("bmw","roles royal",2005);
      car1.display();
      car2.display();
    }
  }
  