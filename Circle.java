/*Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.*/
class Circle
  {
    int radius;
    public void Circle(int r)
    {
      radius=r;
    }
    public void display()
    {
      System.out.println("the radius is"+radius);
    }
    public static void main(String args[])
    {
      Circle c1=new Circle(15);
      Circle c2=new Circle(12);
      c1.display();
      c2.display();
    }
  }