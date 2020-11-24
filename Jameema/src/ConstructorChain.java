public class ConstructorChain 
{
    String name;
    int RollNo;
    ConstructorChain() //default constructor
    {
        name="jemi"; // assiging value to the variable
        System.out.println("student name :"+name);

    }
    ConstructorChain(int age ) // parameterised constructor
    {
        this(); //calling current constructor
        System.out.println("age of student" + age); // printing age of student

    }
    ConstructorChain(int StdrollNo , String Address)
    {
        this(22); // calling current constructor
        System.out.println("rollno of student" +StdrollNo );
        System.out.println("the address of student "+Address);
    }
    public static void main(String[] args)
     {
         new ConstructorChain(102,"Angara"); //calling constructor by using new keyword
        
    }
}
