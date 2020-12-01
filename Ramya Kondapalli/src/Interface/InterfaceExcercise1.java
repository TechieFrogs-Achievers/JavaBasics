package Interface;

//Interface
interface RegularPolygon{
    //abstarct methods
    abstract int getNumSides(int x);
    abstract void getSideLength(int s);
}
//class implementing interface
class EquilateralTriangle implements RegularPolygon{
    
    int side; //instance variable
    //abstract method
    public int getNumSides(int x ) {
        return x;
    }
    public EquilateralTriangle(int s){  //constructor with 1 parameter 
        side = s;
        getSideLength(side); //calling abstract methos from constructor
    }
	public void getSideLength(int side) {  //abstract method
		System.out.println("Equilateral sides length : " + side);
	}
}
//class implementing interface
class Square implements RegularPolygon{
    int side; //instance variable
    //abstract method
    public int getNumSides(int x ) {
        return x;
    }
    public Square(int s){    //constructor with 1 parameter
        side = s;
        getSideLength(side);
    }
	public void getSideLength(int side) {     //abstract method
		System.out.println("Square sides length : " + side);
	}
}
//main class 
public class InterfaceExcercise1 {
    public static void main(String[] args) {
        //object creation and also constructor calling
        EquilateralTriangle e = new EquilateralTriangle(10);
        Square s = new Square(8);
        //abstract method callings
        System.out.println("eqilateral Traingle sides : "+ e.getNumSides(3));
        System.out.println("Square sides : " + s.getNumSides(4));
        
    }
}
