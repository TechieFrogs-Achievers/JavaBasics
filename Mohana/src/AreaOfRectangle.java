import java.util.Scanner;

public class AreaOfRectangle 
{
    int length ,breadth;
    AreaOfRectangle(int l, int b)//constructor having parameters
    { 
        length = l;
        breadth = b;

    } 
    public void returnArea()//method to calculate area
    {
        System.out.println( " area of rectangle =" +length* breadth);
    } 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         int l = sc.nextInt();
         int b = sc.nextInt();
         AreaOfRectangle ae = new AreaOfRectangle(l, b);
         ae.returnArea();


        
    }
    
}
