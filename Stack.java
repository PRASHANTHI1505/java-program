import java.util.*;
 class Stack
{
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Main(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value)
    {
        if(top<=maxSize-1)
        {
            top++;
            stackArray[top]=value;
            System.out.println("Pushed: " + value);
        }
        else
        System.out.println("Stack is full. Cannot push " + value);
    }
    public int pop()
    {
        if(top!=-1)
        {
            int poppedValue=stackArray[top];
            top--;
            return poppedValue;
        }
        else 
         System.out.println("Stack is empty. Cannot pop.");
        return -1;
    }
    public void display() {
        if (top >= 0) {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
      public int peek() {
        if (top >= 0) {
            int peekedValue = stackArray[top];
            System.out.println("Peeked: " + peekedValue);
            return peekedValue;
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicate empty stack with a different value if needed
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Main m=new Main(4);

        while(true)
        {
        System.out.println(" 1.insert \n 2.remove \n 3.peek \n 4.display \n 5.exit");
        System.out.println("enter the choice");
        int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("enter value");
                    int value=sc.nextInt();
                    m.push(value);
                    break;
                case 2:
                    System.out.println(m.pop());
                    break;
                case 3:
                    m.peek();
                    break;
                case 4:
                    m.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}





