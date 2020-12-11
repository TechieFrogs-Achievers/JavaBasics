package Exceptions;

//program paasing arguments while throwing exception
public class PassingArgument {
    //method to cperform concatenate opertaion
    String sum(String a,String b){
    if(a ==null ){
      throw new IllegalStateException("a can not be null");//throwing user exception
    }
    return a+b;
    }

public static void main(String[] u){
    try{

    //instantiation of class
    PassingArgument a=new PassingArgument();
    //calling method sum by passing arguments
   String c= a.sum(null,"me");
   System.out.println(c);
    }
    catch(IllegalStateException i){
        System.out.println(i);
    }
}}