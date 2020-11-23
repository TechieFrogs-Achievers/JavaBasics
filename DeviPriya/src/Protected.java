class Example1
{
    protected void display()
    {
        System.out.println("protected modifier");
    } 
}

public class Protected 
{

   public static void main(String[] args) 
   {
     Example1 pe=new Example1();//obtect creation
     pe.display(); //method calling
   } 
}

    

