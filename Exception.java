class Exception
  {
    public static void main(String args[])
    {
      String str="123@";
      try
        {
      int x=Integer.valueOf(str);
        }
      catch(Exception e)
        {
          e.printStackTrace();

        }
      System.out.println("exception handled");
  }
  }

