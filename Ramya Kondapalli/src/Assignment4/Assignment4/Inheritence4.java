package Assignment4;
class Reactangle{
    //data members
    int length,breadth;
    //constructor to intialise data members
    public Reactangle(int length,int breadth){
        this.length= length;
        this.breadth= breadth;
    }
    //method to calculate area
    void area(){
        System.out.println(length*breadth);
    }
    //method to calculate perimeter
    void perimeter(){
        System.out.println(2*(length+breadth));
    }
}
//extending the reactangle properties for square
class Square extends Reactangle{
    int side;
    //constructor 
    public Square(int side){
        super(side,side);//calling super class method
        this.side= side;
    }
}

public class Inheritence4 {
    public static void main(String[] args) {
    Reactangle r= new Reactangle(4,5);   
    //method calling through objects for reactangle 
    r.area();
    r.perimeter();
    //method calling through objects for reactangle 
    Square s = new Square(4); 
    s.area();
    s.perimeter();

    }
}
