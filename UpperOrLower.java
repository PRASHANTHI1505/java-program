import java.util.Scanner;
class UpperOrLower
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char ch=sc.next().charAt(0);
if((ch>='A')&&(ch<='a'))
{
System.out.println("uppercase");
}
else
{
System.out.println("lowercase");
}
}
}