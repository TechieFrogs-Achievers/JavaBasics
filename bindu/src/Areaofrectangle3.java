public class Areaofrectangle3 
{
    int length;
    int breadth;
    int side;
    //creating methods using parameters
    void input(int s)
    {
        side = s;
        System.out.println("Area is:"+ s*s); // area of square is s*S

    }
    void input(int l, int b)
    {
        length =l;
        breadth = b;
        System.out.println("area of rectangle:"+l*b); //area of rectangle is l*b
    }
    public static void main(String[] args) 
    {
        Areaofrectangle3 A = new Areaofrectangle3(); //creating object with class name
        A.input(7); //assigning value with the object
        A.input(7,9);
    }

    
}
