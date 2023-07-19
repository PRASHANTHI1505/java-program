import java.util.*;
class Game
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter user value");
      char user=sc.next().charAt(0);
      System.out.println("enter computer value");
      char computer=sc.next().charAt(0);
      if((user=='r'&&computer=='p')||(user=='R'&&computer=='P'))
      {
        System.out.println("computer is the winner");
      }
      else if((user=='p'&&computer=='r')||(user=='P'&&computer=='R'))
      {
        System.out.println("user is the winner");
      }
      else if((user=='r'&&computer=='s')||(user=='R'&&computer=='S'))
      {
        System.out.println("user is the winner");
      }
      else if((user=='s'&&computer=='r')||(user=='S'&&computer=='R'))
      {
        System.out.println("computer is the winner");
      }
      else if((user=='p'&&computer=='s')||(user=='P'&&computer=='S'))
      {
        System.out.println("computer is the winner");
      }
      else if((user=='s'&&computer=='p')||(user=='S'&&computer=='P'))
      {
        System.out.println("user is the winner");
      }
      else{
        System.out.println("invalid input for gaming");        
      }
    }
  } 