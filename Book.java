/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class Book
  {
    String Author;
    String Title;
    int  Year;
    public void initializeBook(String a,String t,int y)
    {
      Author=a;
      Title=t;
      Year=y;
    }
    public void display()
    {
      System.out.println("the name of the book is:"+Title);
      System.out.println("the name of the Author:"+Author);
      System.out.println("the year of the book is: "+Year);
    }
    public static void main(String args[])
    {
      Book Book1=new Book();
      Book Book2=new Book();
      Book1.initializeBook("john","java",2000);
      Book2.initializeBook("martin","python",2005);
      Book1.display();
      Book2.display();
    }
  }