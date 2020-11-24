class Method2{
   void parent()
    System.out.println( "This is a parent class"); 

        
}
 public class Method1 extends Method2
{
  void  child()
    {
    System.out.println( "This is a child class"); 
    }


public static void main(String args[])
 {
    Method2 m2= new Method2();
    Method2 m1= new Method1();
     m2.parent();
     m1.child()
     m1.parent();

}
}



