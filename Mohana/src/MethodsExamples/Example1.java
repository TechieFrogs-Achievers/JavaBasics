package MethodsExamples;

class PrintNumber 
{  
    //method overloading 
    /* here printn method name is same but parameters are changed  in every method .same 
     method we are using for differnt forms */  

    public int printn( int n) //method to display int type
    {
         
         return n;
    }  

    public double printn( double n)// overloaded method to display double type
    {
        return n ;
    }
    public String printn( String name)// overloaded method to display string type
    {
        return name;
    } 
    public float printn( float num)// overloaded method to display float type
    {
        return num;
    }
}

public class Example1 
{ 
    public static void main(String[] args) 
    {
        
    PrintNumber pn = new PrintNumber(); //object creation

    //calling differnt methods returning different types of data

     System.out.println(" integer type " +pn.printn(3)); 
     System.out.println(" String type :" +pn.printn("TechieFrogs"));
     System.out.println(" Float type "+pn.printn(2.5));
     System.out.println(" Double type " +pn.printn( 3455677d));
    } 
}
