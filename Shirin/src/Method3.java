public class Method3
{
    int lenght;
    int breadth;
    int side;
    // creating methods using with parameters
    public void display( int s )
    {
        side = s;
        System.out.println(" square of area =" + s*s);//print square value for area
    }
    public void display(int l , int b)
    {
        lenght = l;
        breadth = b;
        System.out.println(" Rectangle  of area is ="+l*b);// print rectangle value  for area
    }
    public static void main(String[] args)
    {   
        // creating object for class
        Method3 m = new Method3();
        // calling methods with object
        m.display(4);
        m.display( 6,7);
    
        
    }
    
}
