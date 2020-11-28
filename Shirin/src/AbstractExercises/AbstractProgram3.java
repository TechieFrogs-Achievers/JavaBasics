package AbstractExercises;
//Abstract class
abstract class Marks
{   
    // abstract method
    abstract double getPercentage();
    
}
// sub class
class StudentA extends Marks// inheriting properties from Marks
{
    int java;
    int sql;
    int Html;
    // constructor 
    StudentA(int j ,int s , int h)// parameterized constructor
    {
        java = j;
        sql = s;
        Html = h;
    }
        // Method
        double getPercentage()
        {
            return ((java+sql+Html)/3);// return studentA marks
        }
    


}
// sub class 2
class StudentB extends Marks// inheriting properties from Marks
{
    int java;
    int sql;
    int Html;
    int python;
    //constructor
    StudentB(int j ,int s , int h, int p)//  parameterize constructor
    {
        java = j;
        sql = s;
        Html = h;
        python = p;
    }   
        // method
        double  getPercentage()
        {
            return ((java+sql+Html+python)/4);// return studentB marks
        }
}
// main class 
public class AbstractProgram3
{
    public static void main(String[] args)
    {   
        //upcasting
        Marks a = new StudentA(65, 75, 85);//Assigning student marks 75% 
        Marks b = new StudentB(70,66,55,75);//66%
        //a.getPercentage();
        //b.getPercentage();
        System.out.println("The percentage of StudentA ="+a.getPercentage()+"%");// printing student marks
        System.out.println("The percentage of studentB ="+b.getPercentage()+"%");

        
    }
}
