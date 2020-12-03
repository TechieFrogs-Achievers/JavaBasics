//abstract class

 abstract class Animal
{
    abstract void makeSound();              //abstract method

    public void display()                   //non-abstract method        
    {
        System.out.println("Iam an Anmal");
    }

    public Animal()                 //creating constructor 
    {
        System.out.println("Animal");       //in object creation, this constructor will call implicitly.
    }
}


class Dog extends Animal                
{
    //implementation of abstract method

     void makeSound()
    {
        System.out.println("Bark Bark");
    }
    

}



class Cat extends Animal
{
   //implementation of abstract method

    void makeSound()
    {
        System.out.println("Meow");
    }
}

public class AbstractionEx
 {
      public static void main(String[] args)
       {
          // Animal a = new Animal();       //we cannot instantiate the abstract classes .so,it throws an error.

          Animal a = new Dog();  //creating object for dog class

          a.display();          //accessing method of abstract class using dog class object
          a.makeSound();

          Animal b = new Cat();         //creating object for cat class

          b.display();          //accessing method of abstract class
          b.makeSound();
         
     }
    
}
