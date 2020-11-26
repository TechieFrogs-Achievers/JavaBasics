package MethodsExamples;

  //method overloading 

class Method 
{

    public void intChar( int n ,char ch) //method to display  values having 2 parameters
    {
          System.out.println(n + "-----" +ch);
    } 
    
    public void intChar( char ch ,int n)//overloaded method it has 2 parameters but order changed 
    {
        System.out.println(ch + "------"+n);
    }
} 

public class Example2 
{ 
    public static void main(String[] args) 
    { 
        Method m = new Method();
        m.intChar(2, 'M');
        m.intChar('k', 5);
        
    }
    
}
