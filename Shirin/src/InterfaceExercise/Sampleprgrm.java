package InterfaceExercise;
 // interface class
interface  Parent
 {
     void show();
     //void display();
 }
 //child class 
 class Child implements Parent// implementing properties from parent class
 {
     public void show()//method
    {
         System.out.println(" This is interface method");
     }
       public void display()
     {
        System.out.println("This is not interface method");
     }
     
 }

public class Sampleprgrm 
{
    public static void main(String[] args)
    {   
        Parent p = new Child();
        p.show();
       // p.display();

        //Child c = new Child();
        //c.show();
        //c.display();
        
    }
    
}
