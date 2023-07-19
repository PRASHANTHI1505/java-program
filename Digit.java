import java.util.*;
class Digit
  {
    public static void  digit(int n)
  {
  while(n>0)
  {
    int result=n%10;
    System.out.print(result);
    n=n/10;
  }
  }
public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  digit(n);
  }
  }