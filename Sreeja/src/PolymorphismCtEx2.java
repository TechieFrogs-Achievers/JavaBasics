class Operations
{
   
    static void add(int length, float breadth)  //method to add float and int values
    {
            float addition = length + breadth;

             System.out.println(addition);
    }

    static void add(float length, double breadth)     //method to add float and byte values
    {
        double addValue = length+breadth;

        System.out.println(addValue);
    }
}

public class PolymorphismCtEx2
 {
     public static void main(String[] args)
      {
        
        //method calling with class because those are static methods

        Operations.add(6,7.7f);         
        Operations.add(5.5f,2);
        
    }    
}
