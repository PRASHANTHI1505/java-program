/*You are working for a publishing company that sells books and magazines. The company is interested in tracking the orders and sales of their publications. 
As a software developer, your task is to create a program that can calculate the total number of copies of a given book that have been ordered and the total sale of the publication.
Task: Write a program in Java that takes input for a book's title, price, number of copies sold, and number of copies ordered. 
The program should then calculate the total number of copies of the book that have been ordered and the total sale of the publication. The program should also display the results to the user.

A. Create a class called Publication with the following instance variables:
1. title (String)
2. price (double)
3. copies (int)
B. Create a class called Book that extends Publication and adds the following instance variable:
1. author (String)
C. Create a class called Magazine that extends Publication and adds the following instance variables:
1. orderQty (int)
2. currentIssue (String)


Example Output:
Enter title: Introduction to Java Programming
Enter price: 59.99
Enter copies sold: 1000
Enter copies ordered: 500
Total copies of book ordered: 1500
Total sale of publication: 59990.0*/
import java.util.*;
class Book
  {
    String Title;
    Double Price;
     int Copies;
    int OrderQty;
     String Author;
    initializeBook(String T,Double P,int C,int O,String A)
    {
      Title=T;
      Price=P;
      Copies=C;
      OrderQty=O;
      Author=A;
    }
public void display()
  {
  System.out.println(" enter the name of the book :"+Title);
  System.out.println("enter the price of the book is:"+Price);
  System.out.println("enter the no of books ordered"+Copies);
  System.out.println("entr the total no of orders"+OrderQty);
    System.out.println("enter the name of the author"+Author);
  }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Book b[]=new Book[1];
      for(int i=0;i<b.length;i++)
        {
          
        }
    }
}
  }