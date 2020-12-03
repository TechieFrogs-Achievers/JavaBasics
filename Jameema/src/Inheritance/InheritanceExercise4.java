package Inheritance;

class Rectangle1
{
    int length ;
    int breadth;
    public void PrintArea() //creating method for area
    {
        System.out.println("the area  is :" +(length*breadth)); //printing area 

    }
    public void PrintPreimeter() //creating method for perimeter
    {
        System.out.println("the perimeter is :" + (2*(length+breadth))); //printing perimeter
    }
    Rectangle1(int l , int b) //perameterised constructor
    {
        length=l; //assigning parameters to variables
        breadth=b;
    }
}
class Square extends Rectangle1 //inherits super class
{
    Square(int s)
    {
        super(s,s); //super class for calling the parent class constructor
    }

}
public class InheritanceExercise4 
{
    public static void main(String[] args) 
    {
        Rectangle1 r = new Rectangle1(4, 5); //creating object
        r.PrintArea();
        r.PrintPreimeter(); //calling method by using object
        Square s = new  Square(5);
        s.PrintArea();
        s.PrintPreimeter();
        
    }
    
}
