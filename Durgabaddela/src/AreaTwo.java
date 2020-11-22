import java.util.Scanner;

public class AreaTwo
{
    int l;
    int b;
    // method to initilize the data

    public void setDim(int length, int breadth)
    {
       l = length ;
       b = breadth;
    }
    // method to return Area

    public int getArea()
    {
        int  Area = (l*b);
        return Area;
    }

    public static void main(String[] args)
    {
        // read inputs from keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter length");
        int a = sc.nextInt();
        System.out.println(" enter breadth");
        int b = sc .nextInt();

        // object creation for instance class

        AreaTwo at = new AreaTwo();

        //method on calling

       at.setDim(a,b);
       System.out.println(at.getArea());
    }

}
