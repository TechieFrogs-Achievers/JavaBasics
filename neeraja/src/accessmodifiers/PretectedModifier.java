package accessmodifiers;
import inheritence .Example1;


 class Demo extends Example1
{
    //instance method
   protected  void multiplication()
    {
        System.out.println("multiplication operation");
    }
    
}

 public class PretectedModifier
{
 public static void main(String[] t)
 {
     //object for class demo and calling metthod in bject
     Demo d=new Demo();
     d.multiplication();

     //accesseing ModifierTwo class which located in same package
     ModifierTwo d1=new ModifierTwo();
     d1.add();

    
     
     

 }
}
