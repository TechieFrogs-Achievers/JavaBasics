//operator overloading
class Operator
{
    public void  display(String s1 , char s2) //method to display operation
    {
          String s3 = s1 + s2; //here "+" operator is using to concatinate two strings 
          System.out.println( "combined string :  " +s3);
    }

     public void display( int a ,double b)//overloaded method to display operation 
     {
         double c = a  + b; // here "+" operator is using to concatinate two integers
         System.out.println(" addition :" +c);
     } 

     public void display( String s , int i )
     {
           System.out.println(s+i);
     }
}
public class OperatorOverloadingex 
{

      public static void main(String[] args) 
      {
           Operator op = new Operator();
           op.display("Mohana", 'k');
           op.display(2,3.5); 
           op.display("Techie", 7);
          
      }   
}
