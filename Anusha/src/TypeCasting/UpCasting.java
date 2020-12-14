package TypeCasting;

public class UpCasting 
{
    public static void main(String[] args) 
    {
        //create parent class object
        Animal a=new Animal();
        a.nature();//method calling
        //create child class object
        Fish f=new Fish();
        f.name="White";
        f.color="Blue";
        
        System.out.println("Object f");
        System.out.println("Name: "+f.name);
        System.out.println("Color: "+f.color);
        
        f.nature(); //calling method

        Animal a1=new Fish();//upcasting
        System.out.println(a1);
        a.name="GoldFish";
        System.out.println("Object a");
        System.out.println("Name: "+a.name);
        a.nature();

        Animal a2=(Animal)f;//upcasting
        System.out.println(a2);

       //Fish f2= new Animal();//complie time error
       Animal a3= new Fish();
       Fish f2=(Fish)a3;//downcasting
       System.out.println(f2);
                
    }
}
 class Animal
{
    String name;
    //a method to print the nature of the class
    void nature()
    {
        System.out.println("Animal");
    }

}  
class Fish extends Animal
{
    String color;
    //overriding the method 
    void nature()
    {
        System.out.println("Aquatic Animal");
    }
}