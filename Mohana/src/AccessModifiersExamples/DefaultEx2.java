package AccessModifiersExamples;

public class DefaultEx2 
{
    public static void main(String[] args) 
    { 
        /* here iam calling  default method from another class named DefaultExamples we
         can access default method in another class but with in the same pakage*/
         
        DefaultExample de = new DefaultExample();
    
        de.display();
        
    }
    
}
