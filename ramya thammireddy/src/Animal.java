

public class Animal 
{
    
        // protected method
        protected void display() 
        {
            System.out.println("I am an animal");
        }

        public static void main(String args[]) 
        {
    
            // create an object of Dog class
            Animal dog = new Animal();
             // access protected method
            dog.display();
        }
    
    
}
