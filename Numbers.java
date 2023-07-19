import java.util.*;
class Numbers
{
public static void numbers(int n)
{
for(int i=1;i<=n;i++)
{
System.out.println(i);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
  numbers(n);
}
}