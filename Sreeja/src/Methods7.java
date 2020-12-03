class MethodEx7
{
    int i;

    public void printNum()  //method to print i value
    {
        System.out.println(i);
    }
}

class Method7 extends MethodEx7
{
    int j;

    public void printNum()      //method to print j value
    {
       
       
        System.out.println(j);
    }
}

public class Methods7
 {
    
     public static void main(String[] args) 
     {
         Method7 mt = new Method7();        //object creation

        //assigning values with reference variable

        mt.j=5;
        mt.i=6;         

        mt.printNum();  //method calling
        

     }
}
