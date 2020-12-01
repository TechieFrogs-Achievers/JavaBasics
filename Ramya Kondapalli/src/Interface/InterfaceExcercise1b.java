package Interface;

//Interface
interface RegularPolygon1b{
    //abstarct methods
    abstract int getNumSides(); //abstract method 

    //static method
    static int TotalSides(int a)
    {
        return a;
    }
}
 
//class implementing interface
class EquilateralTriangle1b implements RegularPolygon1b{

    //abstract method
    public int getNumSides() {

        return 3;
    }
    
   
}
//class implementing interface
class Square1b implements RegularPolygon1b{

    //abstract method
    public int getNumSides() {
        
        return 4;
    }
    
}
//main class 
public class InterfaceExcercise1b{
    public static void main(String[] args) {
        //object creation and also constructor calling

        EquilateralTriangle1b e = new EquilateralTriangle1b();
        System.out.println("eqilateral Traingle sides : "+ e.getNumSides()); //abstract method callings

        Square1b s = new Square1b();
        System.out.println("Square sides : " + s.getNumSides()); //calling abstract method

        int a = e.getNumSides()+s.getNumSides(); //adding two classes sides 
        System.out.println("The sum of sides of all elements : " + RegularPolygon1b.TotalSides(a));//calling method in interface 
    }
}

