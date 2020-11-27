package abstraction;

//abstract parent class
abstract class Animal{
    //abstract methods
    public abstract void cats();
    public abstract void dogs();
 }
 //Dog class extends Animal class
  class Dogs extends Animal {
 
    @Override
    public void cats(){
    }
    public void dogs() {//implementation of abstract method
        System.out.println("dogs bark");
     }
    }

 class Cats extends Animal {

    public void cats(){//implementation of abstract method
        System.out.println("cats meow");
       }

       @Override
       public void dogs() {
        }
 }
 //main class
public class ExcersiceFive 
{
    public static void main(String args[]){
       Dogs obj = new Dogs();
       obj.dogs();
       Cats c=new Cats();
       c.cats();
       }
    
}
