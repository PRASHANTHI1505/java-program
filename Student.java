/*Create a program that maintains an array of Student objects. Each Student object should have a studentId, studentName, rollNo, mobileNumber, marks, and address. 
The program should allow the user to input the data for each student dynamically with validations. After inputting the data for five students, the program should display the data for all five students.

1.studentId should be a unique id and id should contains 5-digit number only.
2.Name should contain only letters and should be between 2 and 30 characters long.
3.rollNo should be a positive integer.
4.Mobile should contains only 10 digits and should starts with 9 or 8 or 7 or 6.
5.Marks should be a positive integer, and should a two digits number.
6.Address should be between 5 and 100 characters long.
To complete this task, you'll need to write Java code that includes the following:

Here's an example input and output for the program: 
----------------------------------------------------------- 
Sample Input: 
------- 
Enter how many students do you want to add : 2
 
Enter data for student 1: 
Student ID: 12345 
Name: John Smith 
Roll number: 101 
Mobile: 934637673 
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Enter data for student 2: 
Student ID: 56784 
Name: Jane Doe 
Roll number: 102 
Mobile: 928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA
 
Output: 
-------- 
Student ID: 12345
Name: John Smith 
Roll number: 101 
Mobile: 934637673
Marks: 87.5 
Address: 123 Main St, Anytown USA 
 
Student ID: 56784
Name: Jane Doe 
Roll number: 102 
Mobile:  928972973 
Marks: 92.0 
Address: 456 Elm St, Anytown USA */
import java.util.*;
class Student
  {
    int id;
    String name;
    int rollno;
    long mobileno;
    float marks;
    String address;
    void insert(String name,int rollno,long mobile,float marks,String address)
    {
      this.name=name;
      this.id=id;
      this.rollno=rollno;
      this.mobileno=mobileno;
      this.marks=marks;
      this.address=address;
    }
  }
class Main
  {
    public static void main(String args)
    {
      int size=2;
      Student[] student=new Student[size];
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<size;i++)
        {
          students[i]=new Student();
          int id;
          int count=0;
          while(true)
            {
              id=sc.nextInt();
              if(id<=99)
              {
                System.out.println("Student id is must countain 2 digits");
                count++;
              }
              else{
                boolean isUnique=true;
                for(int j=0;j<i;j++)
                  {
                    if(Student[j].id==id)
                    {
                      System.out.println("Student id must be unique");
                      isUnique=false;
                      count++;
                      break;
                    }
                  }
                if(Unique)
                {
                  break;
                } 
                   }
                     }
         String name;
          while(true)
            {
              System.out.println("enter the student name");
              name=sc.next();
              if(name.length()>=3&&name.length()<=30)
              {
                System.out.println("enter a valid name(between 3 and 30 characters)");
              }
            }
            int rollno;
          while(true)
            {
              System.out.println("enter the rollno");
              rollno=sc.nextInt();
              if(rollno>6)
              {
                System.out.println("valid rollno");
                break;
              }
              else{
                System.out.println("enter the positive numbers only");
              }
              }
           long mobileno;
          while(true)
            {
              System.out.println("enter the mobile number");
              long mobile=sc.nextLong();
              String phno=Long.toString(mobile);
              if((phno.length()==10)&&(phno.startsWith("9")||(phno.startsWith("8")||(phno.startsWith("7")||(phno.startsWith("6"))))))
              {
                System.out.println("phoneno is valid");
                break;
              }
              else{
                System.out.println("invalid mobile no");
              }
            }
          float marks;
          while(true)
            {
              System.out.println("enter the marks");
              marks=sc.nextFloat();
              if(marks>0)
              {
                if(marks>0&&marks<=99)
                {
                  System.out.println("valid marks");
                  break;
                }
              }
              else{
                System.out.println("invalid marks");
              }
            }
          String address;
          while(True)
            {
              System.out.println("enter the address");
              address=sc.next();
              if(address.length()>=3&&address.length()<=50)
              {
                System.out.println("address is valid");
                break;
              }
              else{
                System.out.println("enter the valid address");
              }
            }
          Student[i].insert(id,name,rollno,mobileno,marks,address);
          }
      System.out.println("the student details are");
      for(Student st:student)
        {
          System.out.println("student id:"+st.id);
          System.out.println("student name:"+st.name);
          System.out.println("student rollno:"+st.rollno);
          System.out.println("student mobileno:"+st.mobileno);
          System.out.println("student marks:"+st.marks);
          System.out.println("student address:"+st.address);
        }
     }   
  }
    