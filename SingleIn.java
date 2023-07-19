import java.util.*;
class Snake
  {
    void eat()
    {
      System.out.println("eating");
    }
  }
      class Rat extends Snake
      {
       public  void bite()
        {
          System.out.println("biting");
        }
      }
        class SingleIn
          {
            public static void main(String args[])
            {
              Snake s=new Snake();
              Rat r=new Rat();
              s.eat();
             r.bite();
                     }
      }