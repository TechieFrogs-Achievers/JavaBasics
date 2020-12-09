package AbstractionClassModels;
abstract class Marks//abstract class
{
    float subject1;
    float subject2;
    float subject3;
    float subject4;
    float total;
    float percentage;
    
    abstract void getPercentage();//abstract method
}
//child class inherites the parent class
class A extends Marks
{
    public A(float s1, float s2, float s3)//constructor with  three paremeters
    {
         subject1 = s1;
         subject2 = s2;
         subject3 = s3;
    }
    
    void getPercentage()// override method
    {
         total = (subject1+subject2+subject3);
        percentage = (total/300)*100;
        System.out.println("studentA percentage="+percentage);
    }

}
//child class inherites the parent class
class B extends Marks
{
    public B(float s1, float s2, float s3, float s4)//constructor with  three paremeters
    {
         subject1 = s1;
         subject2 = s2;
         subject3 = s3;
         subject4 = s4;
    }
    void getPercentage()//override method implementation
    {
         total = (subject1+subject2+subject3+subject4);
        percentage = (total/300)*100;
        System.out.println("StudentB percentage="+percentage);
    
    }

}
public class AbstractinClass3 
{
    public static void main(String[] args)
    {
        //creating object for class A

        Marks m1 = new A(67, 46, 67);//passing parameters values
        System.out.println(m1.subject1+" "+m1.subject2+" "+m1.subject3);
        m1.getPercentage();//calling method

        //creating object for class B

        Marks m2 = new B(67, 46, 67, 45);
        System.out.println(m2.subject1+" "+m2.subject2+" "+m2.subject3+" "+m2.subject4);
        m2.getPercentage();//calling method 
    }
}
