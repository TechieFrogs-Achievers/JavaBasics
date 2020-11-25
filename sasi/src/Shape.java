class Shape1
{
    void show() //show method for shape  grand parent class
    {
        System.out.println("this is a shape");
    }
}
    class Rectangle6 extends Shape1 //Rectangle class geting properties of Shape1 class
    {
        void show() //show method for grandparent class
        {
            System.out.println("this is rectangle");
        }
    }
    class Cricle extends Shape1  //cricle  gtting the properties from shape1 class
    {
            void show() // show method for parent class
            {
                System.out.println("this is cricle");
            }
    }
     class Square extends Rectangle6    //square gtting the propeties from Rectangle6class
    {
            void display()  // method for child class
            {
                System.out.println("square is a rectangle");
            }
    }
    class Shape
    {
            public static void main(String[] args)
             {
                Square s1=new Square(); // object creation for childclass 
                s1.display();// calling the method from child class
                s1.show(); //calling the method from child class
                

            }
        
    }
    
