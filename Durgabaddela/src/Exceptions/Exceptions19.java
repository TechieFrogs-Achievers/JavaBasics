package Exceptions;

class Sample
{
    void add()
    {
        System.out.println("ADD");
    }
}
//child class
class Tempo extends Sample{
     public  void add(){
         int a=10;
         System.out.println(a);
     }
}
//driver class/diver code
public class Exceptions19
 {
    public static void main(String[] y){
        //instantiation of objects for both class
        Tempo t=new Tempo();
        //converting child class to parent class
        Sample ref=(Sample)t;//valid 

        Sample r=new Sample();
        //converting parent class to child class
        Tempo t1=(Tempo)r;//not valid
        ref.add();
        }
  }
      