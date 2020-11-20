public class VariableTypes 
{
    int instanceVariable =  90; //InstanceVariable
    static  int  staticVariable = 88; //Static variable
    //display method
    void displayMethod() 
    { 
      int localVariable = 60; //Local variable
      System.out.println( localVariable );
    }
    public static void main( String[] args )
     {
        System.out.println( VariableTypes.staticVariable );
        VariableTypes var=new VariableTypes();
         var.displayMethod();
         System.out.println( var.instanceVariable );

     }
    
}
