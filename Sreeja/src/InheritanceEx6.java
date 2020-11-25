class Shape
{
    void display()      //method to print
    {
        System.out.println("This is a Shape");
    }
}

class Rectangle4 extends Shape      //rectangle class inherits the shape class
{
    void show()             //method to print
    {
        System.out.println("This is a Rectangle shape");
    }
}

class Circle extends Shape      //circle class inherits the shape class
{
    void show1()        //method to print
    {
    System.out.println("This is a Circle Shape");
    }
}

class Square2 extends Rectangle4    //square class inherits the rectangle class
{
    void display1()     //method to print
    {
    
    System.out.println("Square is a Rectangle");
    }
}


public class InheritanceEx6
 {
    public static void main(String[] args) 
    {
        Square2 sc = new Square2();     //object creation for square class
        sc.display();       //method calling
        sc.show();
    }
}
