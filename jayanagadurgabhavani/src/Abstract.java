abstract class Scooty//abstract class
{
  abstract void run();//methode
}
class Honda extends Scooty//next class extends
{
  void run()//methode
  {
      System.out.println("go safly");
  }
}
public class Abstract
{
  public static void main(String[] args) 
  {
      Scooty obj=new Honda();
      obj.run();
  }
}
    

