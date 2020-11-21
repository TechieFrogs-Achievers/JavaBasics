public class ConstructorChain 
{
    String name;
    int RollNo;
    ConstructorChain()
    {
        name="jemi";
        System.out.println("student name :"+name);

    }
    ConstructorChain(int age )
    {
        this();
        System.out.println("age of student" + age);

    }
    ConstructorChain(int StdrollNo , String Address)
    {
        this(22);
        System.out.println("rollno of student" +StdrollNo );
        System.out.println("the address of student "+Address);
    }
    public static void main(String[] args)
     {
         new ConstructorChain(102,"Angara");
        
    }
}
