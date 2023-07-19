import java.util.*;
class Car
  {
    String model;
    int year;
     public void display()
      {
      Car car1=new Car();
      car1.model="swift";
      car1.year=2001;
      Car car2=new Car();
      car2.model="maruthi";
      car2.year=1999;
      Car car3=new Car();
      car3.model="kn";
      car3.year=2022;
      car1.display();
      car2.display();
      car3.display();
    }
   public static void main(String args[])
    {
      System.out.println("the car name is:"+name);
      System.out.println("the model of the car is:"+model);
      System.out.println("the year of the car is:"+year);
    }
    }