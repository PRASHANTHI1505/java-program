/*Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle.*/
class Rectanglemethod
  {
    int length;
    int breadth;
    public void rectangle()
    {
      int area=length*breadth;
      int perimeter=2*(length+breadth);
      System.out.println("the area of the rectangle is"+area);
      System.out.println("the perimeter of the rectangle is"+perimeter);
    }
    public static void main(String args[])
    {
      Rectanglemethod r=new Rectanglemethod();
      r.length=6;
      r.breadth=4;
      r.rectangle();
    }
  }