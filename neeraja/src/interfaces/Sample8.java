package interfaces;


public class Sample8 {
    public static void main(String[] uh){
        //instantiation of outer class
        TestInterface t=new TestInterface();
        //method calling which returns reference of an interface
        Myinterface x = t.swim();
        System.out.println(x);
        //accessing innier by using outer class
        TestInterface.Testt t1=new TestInterface().new Testt();
        t1.swimming();
    }

    
}
//cretion of interface
interface Myinterface{
    void  swimming();
}

//outer claa
class TestInterface{

     //inner class implementing interface
     class Testt implements Myinterface{

        //ovveriding abstract method
         public  void swimming(){
             System.out.println("i am swimming");
             }
         }

    //instance method in outer class
     public Myinterface swim() {
        System.out.println("I am inside inner class");
        //instantiation of inner class
        Testt t1=new Testt();
         t1.swimming();
        //assigning parent reference to child
         Myinterface k=new Testt();;
        return k;
        }
        
}

