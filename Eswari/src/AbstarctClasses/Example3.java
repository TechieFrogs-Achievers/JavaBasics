package AbstarctClasses;

//abstract class
abstract class Marks
{
    //abstract method for calculating percentage
    abstract float getPercentage();

}
//child class
class StudentA extends Marks
{
    int english,maths,science;
    //constructor
    public StudentA(int e, int m, int s)
    {
        english = e; 
        maths = m;
        science = s;

    }
    //abstract method implementation
    float getPercentage()
    {
        float sum = english + maths + science;
        return (sum / 3);
    }
}
//child class2 
class StudentB extends Marks
{
    int sanskrit,social,hindi,maths;
    //constructor
    public StudentB(int s, int so, int h, int m)
    {
        sanskrit = s;
        social = so;
        hindi = h;
        maths = m;
    }
    //abstract method implementation
    float getPercentage()
    {
        float sum = sanskrit + social + hindi + maths;
        return (sum / 4); 
    }

}

public class Example3 
{
    public static void main(String[] args) {
        Marks m = new StudentA(90,88, 75);                  //upcasting
        System.out.println(m.getPercentage());                                  //method calling
        Marks m1 = new StudentB(90, 85, 75, 95);
        System.out.println(m1.getPercentage());                 //method calling
    }
    
}
