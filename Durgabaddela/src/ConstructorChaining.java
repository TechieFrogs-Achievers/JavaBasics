public class ConstructorChaining
{
    int age;
    String name;
     String address;
     // default constructor 

   public ConstructorChaining() 
   {
       this("Durga");//call second Constructor
   }

   public ConstructorChaining(String name)
{
       this(name, 21);//call  third Constructor
   }

   public ConstructorChaining(String name, int age) 
   {
       this(age, name, "vijayawada");// call the fourth constructor
   }
     //constructor to initilize the parameters

    public ConstructorChaining(int age, String name, String address)
    {
        this.age = age;
        this.name = name;
        this.address = address;
    }
    void display()//method to display the values
    {
        System.out.println(age=         +age);
        System.out.println("name="      +name);
        System.out.println("address="   +address);
    }
    public static void main(String[] args)
    {
        ConstructorChaining c = new ConstructorChaining();
        c.display();
        
    }
    

    
}
