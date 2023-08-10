class Ex1
   {
    int rollno;
    String name;
    String address;
    public String toString()
    {
        return rollno+" "+name+" "+address;
    }
    public static void main(String[] args) {
            Student student=new Student();
            student.rollno=123;
            student.name="sowjanya";
            student.address="vij";
            System.out.println(student);

    }
}
    }