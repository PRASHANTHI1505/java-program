import java.util.*;
class StaticEx
  {
    static void display()
    {
      System.out.println("static number is " + num);

        System.out.println("static string is " + str);
    }
    void nonstatic()
    {
        display();
    }
    public static void main(String args[])
    {
        StaticExample obj = new StaticExample();
        obj.nonstatic();
        display();
    }
}