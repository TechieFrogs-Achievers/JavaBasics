public class PrintNumber1  //creating class as printnumber
{
     public void printn(int a) //creating the method by using printn 
     {
        System.out.println(a);
    }
     public void printn(float b) // Assign diff datatypes as parameters
    
    {
        System.out.println(b);
    }
    public void printn( double c)
    {
        System.out.println(c);
    }
    public void printn(String d)
    {
        System.out.println(d);
    }
    public static void main(String[] args)
     {
        PrintNumber1 p = new PrintNumber1(); //create object for mainclass
        p.printn(21);
        p.printn(234.6); //assign values to the object
        p.printn(987457723);
        p.printn("DATATYPES");
    }

}
