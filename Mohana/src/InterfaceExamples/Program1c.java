package InterfaceExamples;

interface RegularPolygon1c //interface
{
    default void getPerimeter(int n , int l)//default method to print perimeter
    {
        System.out.println("Peimeter of polygon : " +(n*l));
    } 
    default void getInteriorAngle(int n)//default method to print interiror angle
    {
        System.out.println("interior anngle : "+((n-2)*Math.PI)/n);
    }
}  
class EquilateralTriangle1c implements RegularPolygon1c  
{   
    int n , l;

    public EquilateralTriangle1c(int n , int l)//two param constructor
    {
         this.n = n;
         this.l = l;
    }
    public int  getSide(int n)//method to return side
    {
       return n;  
    } 

    public int getLength(int l)//method to return length
    {
        return l;
    }  

    void display()//method to display perimetr and ange
    {
        RegularPolygon1c.super.getPerimeter(this.n,this. l); //interface method call by interface name 
        RegularPolygon1c.super.getInteriorAngle(n);//interface method call by interface name 

    }
} 
class Square1c implements RegularPolygon1c
{   
    int n , l;

    public Square1c(int n , int l)//two param constructor
    {
         this.n = n;
         this.l = l;
    }
    public int  getSide(int n)//method to return side
    {
       return n;  
    } 

    public int getLength(int l)//mehod toretyrn length
    {
        return l;
    }  

    void display()
    {
        RegularPolygon1c.super.getPerimeter(this.n,this. l); 
        RegularPolygon1c.super.getInteriorAngle(n);

    }
} 

public class Program1c 
{
    public static void main(String[] args) 
    {
        System.out.println("**************** Equilateral Triangle ****************");
          EquilateralTriangle1c  eq = new EquilateralTriangle1c(3, 5);
          eq.getSide(3);
          eq.getLength(5);
          eq.display(); 

          System.out.println("****************** Square **********");

          Square1c sq = new Square1c(4, 10);
          sq.getSide(4);
          sq.getLength(10);
          sq.display(); 

    }
    
}
