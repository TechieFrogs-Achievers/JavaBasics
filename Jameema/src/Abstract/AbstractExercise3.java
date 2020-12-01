package Abstract;
abstract class Marks //abstract class
{
    abstract float getPercentage(); //abstract method
}
class StudentA extends Marks //inherit abstract class details
{
    int phy, maths, eng; //data menbers
   StudentA( int p , int m , int e) //parameterised constructor
   {
       phy=p;
       maths=m; //assigning parameters to variables
       eng=e;
      // System.out.println(p+m+e);

   }
   float getPercentage() //accessor method
   {
       return (phy+maths+eng)/3; //return value
   }
}
class StudentB extends Marks //inherits abstract class details
{
    int phy, maths, eng , che;
   StudentB( int p,int m ,int e , int c) //parameterised constructor
   {
       phy=p;
       maths=m;
       eng=e;
       che=c;
       //System.out.println(p+m+e+c);

   }
   float getPercentage() //accessor method
   {
       return (phy+maths+eng+che)/4; //return value
   }
}

public class AbstractExercise3 
{
    public static void main(String[] args) 
    {
        Marks m = new StudentA(98,86,85); // parameters passing in constructor
        Marks m1 = new StudentB(78,96,85,67); //creating object
        System.out.println("the percentage of studentA :" +m.getPercentage()+"%");
        System.out.println("the percentage of studentB :"+m1.getPercentage()+"%");   // calling getpercentage by using object
    }
    
}
