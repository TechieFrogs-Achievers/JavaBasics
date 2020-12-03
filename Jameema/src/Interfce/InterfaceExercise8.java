package Interfce;
interface SampleInterface //interface
{
    public void SamplDemo(); //interface method
}
 public class InterfaceExercise8  //outerclass
{
    class Innerclass implements SampleInterface //innerclass implements the sampleinterface
    {
        public void SamplDemo() //implementing method
        {
            System.out.println("this is innerclass interface"); //prints
        }

    }
    public static void main(String[] args) 
    {
        InterfaceExercise8 i = new InterfaceExercise8(); //creating object to the outerclass
        //outerclass.innerclass innobj = outobj.new innerclass()
        InterfaceExercise8.Innerclass j = i.new Innerclass(); //creating object to inner class
        j.SamplDemo(); //calling method by using innerclass object 
        
    }
    
    
}
