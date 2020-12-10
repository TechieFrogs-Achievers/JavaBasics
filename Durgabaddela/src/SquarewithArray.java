import java.util.Scanner;

public class SquarewithArray 
{
    
    int area;
    int side;
    public SquarewithArray( int side)
    {
        this.side = side;
    }
    void getArea(int side)
    {
         area = side*side;
        System.out.println(" the area of square is ="+area);
    }
    void getPerimeter(int side) 
    {
        int perimeter = 4*side;
        System.out.println("the perimeter of a square is ="+perimeter);
    }
    
    public static void main(String[] args)
    {
        int side;
        int j=0;
        SquarewithArray s[] = new SquarewithArray[10];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<s.length;i++)
        {
        System.out.println("enter the side"+" "+ (i+1) +" " +"value");
        
        side = sc.nextInt();
        s[j]=new SquarewithArray(side);
        
        s[j].getArea(side);
        s[j].getPerimeter(side);
        }
        sc.close();

    }

}
