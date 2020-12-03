package interfaces;

//1(a)
//creating interface with two abstract methods
interface RegularPolygon{
   abstract int getNumSides();
   abstract int  getSideLength();

   default void getPerimeter(int length,int noOfSides){
          System.out.println("Perimeter is:"+(length*noOfSides));
   }
   default void  getInteriorAngle(int noOfSides){
       System.out.println("perimeter is:"+((noOfSides-2)*(3.14)/noOfSides));
   }
      
   
   /*static int totsides(int a){
       return a;*/
   }


//subclass implementing body for abstract method
class  EqualateralTriangle implements RegularPolygon{
    int numOfSides=3;
    int sideLength;
    //constructor to assign instance variable
    public EqualateralTriangle(int sideLength){
     this.sideLength=sideLength;
    }
    //implementation of abstract method
    public int getNumSides(){
        return numOfSides;
    }
    //implementation of abstract method
    public int getSideLength(){
        return sideLength;
    }
    public void print(){
     RegularPolygon.super. getPerimeter(sideLength,numOfSides);
     RegularPolygon.super. getInteriorAngle(numOfSides);

    }
    
}

//subclass implementing body for abstract method
class  Square implements RegularPolygon{
    int numOfSides=4;
    int SideLength;
    //constructor to assign instance variable
    public Square(int SideLength){
     this.SideLength=SideLength;
    }
    //implementation of abstract method
    public int getNumSides(){
        return numOfSides;
    }
    //implementation of abstract method
    public int getSideLength(){
        return SideLength;
    }
    public void print(){
        RegularPolygon.super. getPerimeter(SideLength,numOfSides);
        RegularPolygon.super. getInteriorAngle(numOfSides);
   
       }
   
}

public class Sample1 
{
   public static int  totSides(int a){
       return a;
    }
    public static void main(String[] jn){
        //instantiation of bankA using parent class reference
        EqualateralTriangle e=new EqualateralTriangle(5);
        System.out.println(e.getNumSides());
        System.out.println(e.getSideLength());
        e.print();
        //instantiation of bankA using parent class reference
        Square s=new Square(7);
        System.out.println(s.getNumSides());
        System.out.println(s.getSideLength());
        s.print();

        //1(b)
        int a=e.getSideLength()+s.getSideLength();
        System.out.println("Sum of sides of all elements:"+a);

         }
    
}
