public class SampleIf 
{
    int x=10;
    int y=5;
    public void Sample1()
    {
        //if condition

        if(x>5)
        {
            System.out.println("the value is high " +x);
        }

    
        //if else condition
    
        if(x>y)
        {
            System.out.println("x is the biggest value");
        }
        else  
        {
            System.out.println("y is the highest value");
        }
    
    
        //else if condition

        if(x<y)
        {
            System.out.println("the condition is satisfied");
        }
        else if(y>x)
        {
            System.out.println("the condition dosent satisfied");
        }
        else
        {
            System.out.println("both conditions are wrong");

        }
    }
        
    public static void main(String[] args)
     {
        SampleIf s = new SampleIf();
        s.Sample1();
        
        
    }
    
}
