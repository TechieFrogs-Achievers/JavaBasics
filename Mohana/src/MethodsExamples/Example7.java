package MethodsExamples;

class Number //parent class
{
   int i ;

   public void printNum(int i ) //method to print i value
   {
       System.out.println("value of i is "+i);
   }

}
class Number2 extends Number //extended class
{

    int j ;
    public void printNum( int j, int i)//overloaded  method  from parent class
    {
        System.out.println(" value of j is  :" +j +" \n"+" value of i is : "+i);
    }
} 

public class Example7 
{
    public static void main(String[] args) 
    {
        Number2 nb = new Number2(); //object for sub class 
         nb.printNum(3 , 2);
         nb.printNum(2);
    }
}
