class Shape1
{
    void show() //show method for shape  parent class
    {
        System.out.println("this is a shape");
    }
}
    class Rectangle6 extends Shape1 //Rectangle class geting properties of Shape class
    {
        void show()
        {
            System.out.println("this is rectangle");
        }
    }
    class Cricle extends Shape1
    {
            void show()
            {
                System.out.println("this is cricle");
            }
    }
     class Square extends Rectangle6
    {
            void display()
            {
                System.out.println("square is a rectangle");
            }
    }
    class Shape
    {
            public static void main(String[] args)
             {
                Square s1=new Square();
                s1.display();
                s1.show();

            }
        
    }
    
