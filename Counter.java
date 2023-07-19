class Counter
  {
    static int x=1;
    int y=1;
    Counter()
    {
      x++;
      y++;
      System.out.println("x value is"+x);
      System.out.println("y value is"+y);
    }
    public static void main(String args[])
    {
      Counter c1=new Counter();
      Counter c2=new Counter();
      Counter c3=new Counter();

    }
  }