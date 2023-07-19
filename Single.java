/*Assignment 1: Single Inheritance

Create a superclass called "Animal" with the following attributes:
String name
int age
String breed*/
import java.util.*;
class Animal
  {
    String name; 
    int age;
    String breed;
    public void display(String n,int a,String b)
    {
      System.out.println("animals are different types");
    }
  }
class Snake extends Animal
{
  public void display()
  {
      System.out.println("enter the name of the animal"+name);
      System.out.println("enter the age of the animal"+age);
      System.out.println("enter the animal breed"+breed);
    }
  }
class Single
  {
    public static void main(String args[])
    {
      Snake s=new Snake();
      s.name=snupy;
      s.age=9 ;
      s.breed=sinzju;
      s.display();
    }
  }