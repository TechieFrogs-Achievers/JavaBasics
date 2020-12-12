package Exceptions;

//program to handle exception using throw keyword
class UsingThrow  {
         //instance method to calculate sum
        int sum(int num1, int num2){
           if (num1 == 0)
              throw new ArithmeticException("First parameter is not valid");//throw defind exception
           else
              System.out.println("Both are valid parameters");
           return num1+num2;
        }
        public static void main(String args[]){
           //instantiation of class object
           UsingThrow u=new UsingThrow();
           //calling method by passing parameters
           try{
           int res=u.sum(0,12);
           System.out.println(res);
           }
           catch(ArithmeticException e){
               System.out.println(e);
           }
           System.out.println("Continue Next statements");
        }
     }
 
