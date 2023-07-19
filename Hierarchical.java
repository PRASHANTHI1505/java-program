import java.util.*;
class Snake 
  {
  public void eat()
    {
      System.out.println("eating");
    }
  }
  class Rat extends Snake
      {
       public void bite()
        {
          System.out.println("biting");
        }
      }
class cat extends Snake
  {
    public void sleep()
    {
      System.out.println("sleeping");
    }
  }
  class Hierarchical
          {
            public static void main(String args[])
            {
              Snake s=new Snake();
              s.eat();
              s.bite();
              s.sleep();
              
            }
      }