abstract class Constructor
{
    void Constructor()//methode
    {
      System.out.println(" this a constractor of abstract class");
    }
    abstract void a_methode();//abstract methode
    
        public void non_abstract()
        {
            System.out.println("this is a non_abstract methode");
        }
    
}
class Constructor2 extends Constructor
{
  void a_methode()//methode
  {
      System.out.println("this is abstract methode");
  }
}
public class AbstractConstructor
{
 public static void main(String[] args)
  {
     Constructor c=new Constructor2();//creat obect
     c.a_methode();
     c.non_abstract();
 }
}