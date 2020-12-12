class Rectangle22
{
    int length;         //defining variables
    int breadth;

   public Rectangle22(int a,int b)       //two parameter constructor
   {
       length = a;                      
       breadth = b;
   }
   
   void area()          //method to print area
    {
        System.out.println("Area: "+" "+length*breadth);
    }

    void perimeter()        //method to print perimeter
    {
        System.out.println("Perimeter: "+" "+2*(length+breadth));
    }
}

class Square12 extends Rectangle22     
{
    int side;

   public Square12(int s)         //single parameter constructor
   {
       super(s,s);
   }
}

public class InheritanceEx5
 {
     public static void main(String[] args) 
     {
        //creating objects with initializing constructors
        
        Rectangle22 rt = new Rectangle22(7,6);    //object creation for Rectangle class    
        Square12 sr = new Square12(5);                  //object creation for square class
       
        rt.area();
        rt.perimeter();     //method calling to print results
        sr.area();
        sr.perimeter();

        Square arr[] = new Square[10];          //create array of 10 elements
        
        int k = 5 ;     //initializing k value with 5
         
        //loop to get the array elements
        
        for(int i = 0 ; i < 10 ; i++)
         {
             arr[i] = new Square(k);
             k++; 
         }
         
         //loop to print the area of 10 squares 

         for(int i = 0 ; i < 10 ; i++)
         {
             arr[i].area();
         }
    }
}
