package abstraction;


abstract class Sample  {
    
  /* // public static void add();
   // abstract public  void add();
    //abstract public  final  void mul();
    abstract public  void mul();
    //java allows final methods in abstract method
    public final void  sub(){
        System.out.println("which performs sustrction operation");
    }
    //java allows static  methods in abstract method
    public static void div(){
        System.out.println("which performs division operation");
    }  */

}
/*static/final class A
  {
      
  } */

class Simple extends Sample{
    //implementation of abstract  method
    public void add(){
        System.out.println("which performs addition operation");

    }
    public  void mul(){
        //implementation of abstract  method
        System.out.println("which performs multiplication operation");
    }
    /*public  void sub(){}
    public  void div(){}*/
    public void funi(){
        System.out.println("inside function");
    }
}
//it is not  possible to inherit from multiple abstract classes in Java
//class Simple extends A{}

abstract public class Example1 {
    public static void main(String[] yh){
        //instantiation of bankA using parent class reference
        //Simple s=new Simple(1,2);
        Simple s=new Simple();
        s.add();
        s.mul();

        
        

        

    }
    
}
