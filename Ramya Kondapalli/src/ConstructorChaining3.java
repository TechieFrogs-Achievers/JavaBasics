class Test3{
    static{
        //this is static block
        //This block will execute when class is loaded in jvm
        System.out.println("======User Details=======");
    }
    public Test3(String city)
    {
        //this will call rollNo constructor
        this(201);
        System.out.println("City :" + city);
    }
    public Test3(int rollNo)
    {
        //this will call default constructor i.e., that will print name
        this();
        System.out.println("Roll no :" + rollNo);
    }
    public Test3()
    {
        //this will print name
        System.out.println("Name : Ramya");
    }
}
public class ConstructorChaining3 {
    public static void main(String[] args) {
        Test3 t = new Test3("Hyd");
        //calling string city constructor
    }
}
