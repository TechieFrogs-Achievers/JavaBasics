package AccessModifiersExamples;
public class PublicExample 
{
    public String name ; //public variable

    public void display() //public method 
    {
       System.out.println( name );
    } 

    public static void main(String[] args) 
    {
        PublicExample pb = new PublicExample();
         pb.name =" john";//variable value initializing
         pb.display(); //method call
    }
    
}

