import java.util.*;
class Frequencychar
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String str=sc.next();
      char ch[]=str.toCharArray();
      boolean b[]=new boolean[ch.length];
      for(int i=0;i<b.length;i++)
        {
          b[i]=false;
        }
      for(int i=0;i<ch.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<ch.length;j++)
            {
              if(ch[i]==ch[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println("the frequency of "+ch[i]+"is"+count);
            
        }
      
    }
  }