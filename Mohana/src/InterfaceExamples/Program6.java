package InterfaceExamples;

interface Animal1 //interface 1
{  
    //methods 
    void type();
    void colour();
} 
interface Cat //interface2 
{ 
    //methods default abstract and public 
    void eat();
    void meow();
} 
interface Dog //interface3 
{
    void bark();
    void name();
} 
interface Lion extends Animal1 , Cat, Dog //implementing 3 interfaces in class
//implementation of abstract methods
{
       void king();
}  
public class Program6  implements Lion
{ 
   public void type()
    {
        System.out.println("lion");
    }  
     public void colour()
     {
         System.out.println("yellow in colour");
     } 
  public void meow()
  {
      System.out.println("meowing");
  } 

  public void eat()
  {
      System.out.println("eating");
  } 

  public void bark()
  {
      System.out.println("barking");
  } 

  public void name()
  {
      System.out.println("Dog");
  } 

  public void king()
  {
      System.out.println("iam king ");
  } 
     public static void main(String[] args) 
     {  
      //object creation 
          Program6 p = new Program6();
          p.type();
          p.colour();
          p.meow();
          p.eat();
          p.bark(); 
          p.name();
          p.king();     
    }
}
