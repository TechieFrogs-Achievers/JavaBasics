package InterfaceExamples;

interface Calculator //interface 
{   
    //abstract methods
    void add();
    void mul();

} 
interface Function extends Calculator //interface2
{
    void sub(); //abstract method
} 
class Solution implements Function //class implementing 2 interfaces 
{

    int a = 10, b = 5;
       
  //implementation of abstract classes
    public void add()  //method to display addition
    {
        int c =a+b;
        System.out.println("addition : " +c);
    } 

    public void mul()//method to display multiplication
    {  
        int x = (a*b);
      System.out.println("multiplication : " +x);
    } 

    public void sub() //method to display subtraction
    {
        double y = a-b;
        System.out.println("division : " +y);
    }
}
public class Example2 
{
    public static void main(String[] args) 
    {
          Solution sc = new Solution();
          sc.add();
          sc.mul();
          sc.sub();
    }
    
}
