
/*Method overloading */
class  Additon 
{
    public void  addition(int a , int b ) //method having 2 params 
    {
         System.out.println( "addition of two numbers " + (a+b));
    } 

    public void  addition(int a , int b , int c) //overloaded method having 3 params
    {
           System.out.println( "addition of 3 numbers is "+ (a+b+c));
    }
}
public class Polymorphismex1 
{

     public static void main(String[] args) 
     {
          Additon ad = new Additon();
          ad.addition(2, 3);
          ad.addition(2, 3, 5);
         
     } 
}
