package accessmodifiers;

class ModifierTwo
{

    protected void add()
    {
        System.out.println("inside method");
    }
}


public class DefaultModifier 
{
   
 public static void main(String[] jn)
    {

        ModifierTwo d=new ModifierTwo();
        d.add();
    }

    
    
}
