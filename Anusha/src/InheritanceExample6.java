public class InheritanceExample6 
{
   public static void main(String[] args)
   {
      Square s=new Square();//create a object for Square class
      s.display(); //call the method of 'Shape' by the object of 'Square' class.
      s.show();//call the method of 'Rectanglez' by the object of 'Square' class.
   } 
}
//parent class
class Shape
{
    //create a method for display
    public void display()
    {
        System.out.println("This is shape");
    }
}
//sub class of shape class
class RectangleZ extends Shape
{
    //create a method for display
    public void show()
    {
        System.out.println("This is rectangular shape");
    }
}
//sub class of shape class
class Circle extends Shape
{
    public void display1()//create a method for display
    {
        System.out.println("This is circular shape" );
    }
}
//sub class of rectanglez class
class Square extends RectangleZ
{
    //create a method for display
    public void show1()
    {
        System.out.println("Square is a rectangle");
    }
}