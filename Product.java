/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Product
  {
    String name;
    int price;
    int quality;
    public void product(String n,int p,int q)
    {
      name=n;
      price=p;
      quality=q;
    }
    public void display()
    {
      System.out.println("the product name is:"+name);
      System.out.println("the product price is:"+price);
      System.out.println("the quality of the product is:"+quality);
          }
    public static void main(String args[])
    {
      Product p=new Product("one plus",25000,66);
      Product p1=new Product("Samsung",17000,40);
      p.display();
      p1.display();
    }
  }
