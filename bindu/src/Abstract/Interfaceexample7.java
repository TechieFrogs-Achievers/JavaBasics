package Abstract;
import Interface.Pack;   //importing the interface from another package

public class Interfaceexample7  //outer class
{  
    protected class input2 implements Pack  //inner class that implements the another package
    {
        public input2() //creating method for the outerclass
        {

        }
        public void Input()  //calling method of pack
        {
            System.out.println("Number of Packages:"); //prints the value
        }
    }

    
}
