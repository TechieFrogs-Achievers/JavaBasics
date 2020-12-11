package Exceptions;

public class PassingArguments 
{
   // /method to cperform concatenate opertaion
    String sum(String a,String b){
    if(a ==null ){
      throw new IllegalStateException("a can not be null");//throwing user exception
    }
    return a+b;
    }

    public static void main(String[] args)
    {
        try{

            //instantiation of class
            PassingArguments a=new PassingArguments();
            //calling method sum by passing arguments
           String c= a.sum(null,"me");
           System.out.println(c);
            }
            catch(IllegalStateException i){
                System.out.println(i);
            } 
    }
}
