public class Inheritance2 
{
    
      private void parent() // used in private
        {
           System.out.println(" this is a parent class");
        }
       } 
    class Methode2 extends ParentAndChild
    {
      void child()
      {
          System.out.println(" this is a child class");
      }
     
    public static void main(String[] args) 
    {
       ParentAndChild p=new ParentAndChild (); // methode calling
       Methode2 m=new Methode2();//methode calling
       p.parent();
       m.parent();
       m.child();
    }
   
}