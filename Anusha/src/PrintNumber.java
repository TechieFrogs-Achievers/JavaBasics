public class PrintNumber 
{
    //method for print integer values
    public static void printn(int integer_value)
    {
       System.out.println("integer value="+integer_value);
    }
    //method for print float values
    public static float printn(float float_value)
    {
        return float_value;
    }
    //method for print double values
    public double printn(double d)
    {
        return d;
    }
    //method for print long values
    public void printn(long l)
    {
        System.out.println(l);
    }
    //method for print charecter values
     public void printn(char c)
     {
         System.out.println(c);
     } 
     //method for print string values
     public void printn(String s)
     {
         System.out.println(s);
     }  
    
    public static void main(String[] args) 
    {
      PrintNumber.printn(4258);//assign value
     System.out.println("float value= "+PrintNumber.printn(42.65f));//assign value for static method
     PrintNumber pn=new PrintNumber();//create object
     System.out.println("double value="+pn.printn(528.255d));////assign value for static method
     pn.printn("long value="+122554856l);//assign value
     pn.printn("char value="+'a');//assign value
     pn.printn("string value="+"Anusha");// assign value    
    }
}
