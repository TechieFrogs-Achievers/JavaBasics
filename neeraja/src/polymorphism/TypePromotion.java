package polymorphism;

//type promotion in expressions
public class TypePromotion {
    public static void main(String args[])  
    {  
        byte b = 24;  
        char c = 'n';  
        short s = 1204; 
        int i = 74100; 
        float f = 6.67f; 
        double d = .1234; 
          
        // The Expression 
        double result = (f * b) + (i / c) - (d * s); 
          
        //Result after all the promotions are done 
        System.out.println("result = " + result); 
    }  
    
}
