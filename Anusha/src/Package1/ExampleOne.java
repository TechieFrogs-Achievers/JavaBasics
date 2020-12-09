package Package1;
import Package.*;//import package
public class ExampleOne 
{
    public void exampleOne()//method
    {
       System.out.println("example:"); 
    }
    public static void main(String[] args) 
    {
       System.out.println("Hello:");
    SampleOne s=new SampleOne();//object create for import class
    s.sampleOne();//method calling
    //s.simple();//error not visible private 
    SampleTwo s1=new SampleTwo();//create object for import class
    //s1.samp();//error not visible because protected
    //SampleTwo
    }
}
