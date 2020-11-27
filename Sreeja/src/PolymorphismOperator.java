class OperatorOverload
{
    
    //operator overloading
    
    static void operator(int a, int b)     //method to combine two integer variables
    {
        System.out.println(a+b);
    }   

    static void operator(String a,String b)     //method to combine two Strings
    {
        System.out.println(a+b);
    }
    
    static void operator(int a,String b)     //method to combine  int value and string value
    {
        System.out.println(a+b);
    }
 
    static void operator(float a,String b)     //method to combine float value and string value
    {
        System.out.println(a+b);
    }


    static void operator(char a,String b)     //method to combine character and string
    {
        System.out.println(a+b);
    }

    
}
public class PolymorphismOperator
{
    public static void main(String[] args)
     {
         
         // method calling with initializing methods
        
         OperatorOverload.operator("Majeti  ","Sreeja");     
         OperatorOverload.operator(3,6);
         OperatorOverload.operator(6,"sree");
         OperatorOverload.operator(6.7f,"sree");
         OperatorOverload.operator('A',"sree");
        


        
    }
}
