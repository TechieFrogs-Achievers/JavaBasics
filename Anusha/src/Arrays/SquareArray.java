package Arrays;
import java.util.*;
public class SquareArray 
{
    int area;
    int side;
    public SquareArray( int side)//method
    {
        this.side = side;
    }
    void getArea(int side)//method area
    {
         area = side*side;
        System.out.println(" the area of square is ="+area);
    }
    void getPerimeter(int side) //get parameter
    {
        int perimeter = 4*side;
        System.out.println("the perimeter of a square is ="+perimeter);
    }

    public static void main(String[] args) 
    {
        int side;
        int i, j=0;
        SquareArray s[] = new SquareArray[10];
        Scanner sc = new Scanner(System.in);
        for( i =0;i<s.length;i++)
        {
        System.out.println("enter the side"+" "+ (i+1) +" " +"value");

        side = sc.nextInt();
        s[j]=new SquareArray(side);

        s[j].getArea(side);//method calling
        s[j].getPerimeter(side);//method calling
    }
        sc.close();

    }
}
