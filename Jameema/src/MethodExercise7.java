class FirstClass
{
    int i; 
    public void printNum() //method for parentclass
    {
        System.out.println(i); //printing i value
    }
}
class SecondClass extends FirstClass //inherits parent class details
{
    int j;
    public void printNum() //method for childclass
    {
        System.out.println(j);
    }
}
public class MethodExercise7 
{
    public static void main(String[] args) 
    {
        SecondClass c = new SecondClass(); //creating object
        c.j=6;
        c.i=7; //calling parentclass method by using childclass object
        c.printNum();
        
    }
    
}
