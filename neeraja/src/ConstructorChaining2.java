public class ConstructorChaining2 
{
    int i,j;
    //defined constructor with parameters
    public ConstructorChaining2(int i, int j) 
    {
       int divide=(i/j);
       System.out.println(" division was succesfull:"+ divide);
    }

     private void add()
    {
       System.out.println("inside instance method");
    }

    {
        //init block
        System.out.println(" inside first init block");
    }

    {
        //second init/instaceblock
        System.out.println(" inside second init block");
    }

    public static void main(String[] hn)
     {
         //reation of object
          ConstructorChaining2 construct=new ConstructorChaining2(1,56);
          construct.add();
     }
    
    
}
