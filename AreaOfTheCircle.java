import java.util.*;
class AreaOfTheCircle  
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);    
      System.out.print("Enter the radius of the circle: ");
  int r=sc.nextInt();
    float pi=3.14f;
     float  AreaOfTheCircle=2*pi*r;
    System.out.print("The area of the circle is: "+AreaOfTheCircle );   
}
}