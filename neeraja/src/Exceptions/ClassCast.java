package Exceptions;
//parent class
class Temporary{
    void add(){
        System.out.println("ADD");
    }
}
//child class
class Tempo extends Temporary{
     public  void add(){
         int a=10;
         System.out.println(a);
     }
}
//driver class/diver code
public class ClassCast {
    public static void main(String[] y){
        //instantiation of objects for both class
        Tempo t=new Tempo();
        //converting child class to parent class
        Temporary ref=(Temporary)t;//valid 

        Temporary r=new Temporary();
        //converting parent class to child class
        Tempo t1=(Tempo)r;//not valid
        ref.add();
        


    }
    
}
