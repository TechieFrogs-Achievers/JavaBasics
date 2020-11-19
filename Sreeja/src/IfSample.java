public class IfSample
{
 public static void main(String[] args)
  {
    
    
    //checking big number

    if(5>3)   // checking the condition
    {
        System.out.println("First value is big");
    }
    
   
   //printing incremented sample value

    byte sampleValue = 77;  // defining a variable.

   if(sampleValue==77)    //checking the sampleValue
    {
        System.out.println("After increment the value is  " + (++sampleValue));
    }
      


    
    char letter = 'e';     //creating a character variable

      if(letter=='e')         //checking the equality of the letter
    
          System.out.println("the letter is vowel");

    
     
     
    String name= "java";    //creating a string variable
    
       if(name=="java")        //checking the equality of variable with string
       {
          System.out.println("it is a java programming");
       }
    
    
    
    byte initialValue=3;    //defining a Variable

    
       if((sampleValue+initialValue)>sampleValue)      //checking the sum  //78+3=81
       {   
           System.out.println(sampleValue+initialValue);
       }




    



  }
    
}
