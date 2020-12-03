//abstract class 

abstract class Marks
{
    abstract float getPercentage();     //abstract method

}

class A2 extends Marks
{
    int firstSub,secondSub,thirdSub;    //data members
    
    public A2(int firstSub,int secondSub,int thirdSub)  //three parameter constructor for initializing marks
    {
        this.firstSub = firstSub;
        this.secondSub = secondSub;
        this.thirdSub = thirdSub;
    }
    
    float getPercentage()       //implementation for abstract method
    {
        int total = firstSub+secondSub+thirdSub;
        
        float percentage = (total/3);

        return percentage;
    }
}

class B2 extends Marks
{
    int firstSub,secondSub,thirdSub,fourthSub;      //data members

    public B2(int firstSub,int secondSub,int thirdSub,int fourthSub)        //four parameter constructor for entering marks
    {
        this.firstSub = firstSub;
        this.secondSub = secondSub;
        this.thirdSub = thirdSub;
        this.fourthSub = fourthSub;
    }

    float getPercentage()           //implementation for the abstract method
    {
        int total = firstSub+secondSub+thirdSub+fourthSub;

        float percentage = (total/4);

        return percentage;
    }
}
public class Abstract3 
{
         public static void main(String[] args)
          {
            //objects creation with initializing constructors
            
            A2 a = new A2(35,45,55);

            B2 b = new B2(35,45,55,65);

            //printing percentage values

           System.out.println(a.getPercentage());
           System.out.println(b.getPercentage());
        }
}
