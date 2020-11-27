//method overriding 
class  Animal 
{    
    //overiden method 
    public void display() //method to display output
    {
        System.out.println(" parent class method");
    }
} 

class Lion  extends Animal
{
    public void display() //overriding  method
    {
        System.out.println("child  class method ");
    }
}

public class PolymorphismEx2 
{   

    public static void main(String[] args) 
    {
         Animal an  = new Lion(); //parent object child refernce 
         an.display(); // it prints child class method 
        
    }
    
}

