// Method overriding
//super class
class Xyz
{   
    // creating method 
    void display(int i , int j)
    {   
       System.out.println(" the sum of value is "+ (i+j));// addition of i,j values
    }
    
}
// sub class
class Klm extends Xyz
{
     void display(int i, int j)
    {
        super.display(i,j);// using super for calling parent method
        System.out.println("the sum of value is "+ j*i);// multiplication of i,j values

    }
}
public class SampleExercise2
{
public static void main(String[] args) 
{    
    // creating object for parent class
    //Xyz object1 = new Xyz();
   //object1.display(5 ,9);// calling parent  method with object 
   // creating object for child class 
    Klm object2 = new Klm();
    object2.display(9, 4);//calling  child method with object


}
}
