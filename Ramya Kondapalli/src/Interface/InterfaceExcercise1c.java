package Interface;

//Interface
interface RegularPolygon1c{
    //abstarct methods
    // abstract int getNumSides(int x);
    // abstract void getSideLength(int s);

    //Default methods
    default  void getPerimeter(int n,int s){
        System.out.println("Perimeter : " + (n*s));
    }
    default void getInteriorAngle(int n){
        System.out.println("Interior angle : " + n);
    }
    interface Test{
        
    }
}
//class implementing interface
class EquilateralTriangle1c implements RegularPolygon1c{
    
    int side=3,length = 4; //instance variable
    //abstract method
    public int getNumSides(int x ) {
        return x;
    }
    public EquilateralTriangle1c(int s){  //constructor with 1 parameter 
        side = s;
        getSideLength(side); //calling abstract methos from constructor
    }
	public void getSideLength(int side) {  //abstract method
		System.out.println("Equilateral sides length : " + side);
    }
    public void print(){
        //calling default methods for calculating
        //perimeter and interior angle of equilateral triangle
        RegularPolygon1c.super.getPerimeter(3,4);
        RegularPolygon1c.super.getInteriorAngle(5);
    }
}
//class implementing interface
class Square1c implements RegularPolygon1c{
    int side,n=3;
    float pi= 3.14f; //instance variable
    //abstract method
    public int getNumSides(int x ) {
        return x;
    }
    public Square1c(int s){    //constructor with 1 parameter
        side = s;
        getSideLength(side);
    }
	public void getSideLength(int side) {     //abstract method
		System.out.println("Square sides length : " + side);
    }
    public void print(){
        RegularPolygon1c.super.getPerimeter(5, 6);
        RegularPolygon1c.super.getInteriorAngle(9);
    }
}
//main class 
public class InterfaceExcercise1c{
    public static void main(String[] args) {
        //object creation and also constructor calling

        System.out.println("-----Equilateral triangle------");

        EquilateralTriangle1c e = new EquilateralTriangle1c(10);
        System.out.println("eqilateral Traingle sides : "+ e.getNumSides(3)); //abstract method callings
        e.print();//calling default method

        System.out.println("-----Square------");

        Square1c s = new Square1c(8);
        System.out.println("Square sides : " + s.getNumSides(4));
        s.print();   //callig default method
        
        
    }
}

