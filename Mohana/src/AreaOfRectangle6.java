import java.util.Scanner;

public class AreaOfRectangle6 
{
    int length,breadth;
    public void setDim( int l,int b)
    {
        length =l;
        breadth = b;
        
    } 
    public void getArea()
    {
        System.out.println(" area is =" + (length*breadth));
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
         int l = sc.nextInt();
         int b = sc.nextInt(); 
         AreaOfRectangle6 ae = new AreaOfRectangle6();
         ae.setDim(l, b);
         ae.getArea();

    }

    
}
