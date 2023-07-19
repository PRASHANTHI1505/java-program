import java.util.Scanner;
 class Temparature
  {
        
public static void main(String[] args) 
       
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter c or f to convert ");
      char ch=sc.next().charAt(0);
      if(ch=='c'||ch=='C')
      {
        System.out.println("enter the value of the temparature ");
        double celcius=sc.nextDouble();
        double fahrenheit=((celcius*1.8)+32);
        System.out.println("the temparature is "+fahrenheit);
       
      }
      else if(ch=='f'||ch=='F')
      {
        System.out.println("enter the value of the temparature ");
        double fahrenheit=sc.nextDouble();
        double celcius=((fahrenheit/1.8)-32);
        System.out.println("the temparature is "+celcius);
      }
      else{
        System.out.println("invalid input");
      }
    }
  }