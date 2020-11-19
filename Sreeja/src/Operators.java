public class Operators
{
 public static void main(String[] args)
  {
  
    byte sampleValue = 6;
    boolean firstValue = true; 
    int secondValue = 8;
    int thirdValue = 7;
     
    //unary operators

    System.out.println(sampleValue++);
    System.out.println("after increment  " + sampleValue);
    System.out.println(++sampleValue);
    System.out.println(--sampleValue);
    System.out.println(sampleValue--);
    System.out.println("after decrement  "+ sampleValue);
    System.out.println(!firstValue);
    System.out.println(~sampleValue);

    //arthmetic opertors

    System.out.println("adding is  " + (sampleValue+secondValue));
    System.out.println("subtraction is  " + (secondValue-sampleValue));
    System.out.println("multiplication is  " + (sampleValue*secondValue));
    System.out.println( secondValue/sampleValue);
    System.out.println( secondValue%sampleValue);
    
    //shift operators

    System.out.println(sampleValue>>1);
    System.out.println(sampleValue<<1);

    //bitwise operators

    System.out.println(sampleValue&secondValue);
    System.out.println(sampleValue|secondValue);
    System.out.println(sampleValue^secondValue);

    //logical operators

    System.out.println(sampleValue<thirdValue&&secondValue<thirdValue);
    System.out.println(sampleValue<thirdValue||secondValue<thirdValue);
    System.out.println(!(sampleValue<thirdValue&&secondValue<thirdValue));

    // relational operators

    System.out.println(sampleValue==secondValue);
    System.out.println(sampleValue!=thirdValue);
    System.out.println(sampleValue>=secondValue);
    System.out.println(sampleValue<=secondValue);
    System.out.println(sampleValue<secondValue);
    System.out.println(sampleValue>secondValue);

    //ternary operators

    System.out.println(sampleValue<secondValue?sampleValue:firstValue);

    //cast operator

    System.out.println("value  "+ (float)sampleValue);

    //assignment operator

    System.out.println(sampleValue+=1);

     
    
    
    
    
    


     
  }
      
    
}
