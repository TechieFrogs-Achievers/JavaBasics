package Inheritance;

class A
{
    int i,j;
    A( int x, int y) //parameterised constructor
    {
        i=x;
        j=y;

    }
    public void Show() //parent method
    {
        System.out.println(i+j);

    }
}
class B extends A //inherits parent class
{
    int k;
    B(int c)
    {
      super(c,c); //calling super class
      k=c; 
    }
    public void Show() //child class
    {
        System.out.println(k);

    }

}
public class InheritanceExercise8 
{
    public static void main(String[] args)
     {
         B b = new B(5); //creating object to child class
         b.Show();  //calling child class method
        
    }
    
}
