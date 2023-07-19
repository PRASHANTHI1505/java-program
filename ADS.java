class ADS
{
 public static void main(String args[])
{
   int alphabet=0,digit=0,symbol=0;
   String s1="andhra loyola college @ **123";
   for(int i=0;i<s1.length;i++)
   {
     char ch=s1.charAt(i);
     if((ch>='a'&&ch<='z')||(chAt>='A'&& ch<='Z'))
   {
      alphabet++;
   }
   else if(ch>='0'&&s1.ch<='9')
{
   digit++;
}
else
{
symbol++;
}
}
System.out.println("the no of alphabets in the given string="+alphabet);
System.out.println("the no of digit in the given string="+digit);
System.out.println("the no of symbol in the given string="+symbol);
}
}

