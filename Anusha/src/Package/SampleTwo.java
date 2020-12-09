package Package;
import Package1.*;//import package
public class SampleTwo 
{
    public void sampleTwo()//method
    {
        System.out.println("Second program:"); 
    }
    protected void samp()//protected method
    {
        System.out.println("example:");
    }
   
    public static void main(String[] args) 
    {
       SampleTwo st=new SampleTwo();//create object
       st.sampleTwo();//method calling
       st.samp();//method calling
       ExampleOne e=new ExampleOne();//create object for import class
       e.exampleOne();//method calling

    } 
}
