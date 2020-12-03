package interfaces;


//interface one
interface One{
    void addition(One d);
    void multiplication(One f);
}
//interface two
interface Two{
    void substraction(Two b);
    void division(Two j);
}
//interface three
interface Three{
    void modulo(Three k);
    void single(Three k);
}
//interface inheriting 3 interfacess by adding another method
interface Four extends One,Two,Three{
    void thrice(Four f);
}

//class which implements interface4
class Size implements Four{

    //implementing abstract method
    @Override
    public void addition(One o) {
       System.out.println("addition method of interface One located at         : "+o);

    }
     //implementing abstract method
    @Override
    public void multiplication(One o) {
        System.out.println("multiplication method of interface One located at  : "+o);
    }
     //implementing abstract method
    @Override
    public void substraction(Two t) {
        System.out.println("substraction method of interface Two located at    : "+t);
        
    }
      //implementing abstract method
    @Override
    public void division(Two t) {
        System.out.println("diviion method of interface Two located at         : "+t);

    }
      //implementing abstract method
    @Override
    public void modulo(Three e) {
        System.out.println("modulo method of interface Three located at        : "+e);

    }
    //implementing abstract method
    @Override
    public void single(Three e) {
        System.out.println("single method of interface Three located at        : "+e);

    }
    //implementing abstract method
    @Override
    public void thrice(Four f) {
        System.out.println("thrice  method of interface Three located at       : "+f);
    }
   
}

//driver class
public class Sample6 {
    public static void main(String[] ij){
        //instantiation of child class
        Size sobj=new Size();
        //assigning parent or inheritence references to child class object
        One o=new Size();
        Two t=new Size();
        Three e=new Size();
        Four f=new Size();
        //calling overriding methods 
        sobj.addition(o);
        sobj.division(t);
        sobj.modulo(e);
        sobj.multiplication(o);
        sobj.substraction(t);
        sobj.single(e);
        sobj.thrice(f);
    }
    
}
