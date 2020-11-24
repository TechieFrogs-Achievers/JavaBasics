//for loop example
public class ForLoopExercise
{
    //method for printing mathematical table 
    public void table()
    {
        int number = 10;    
        for(int i = 1; i <=10; i++)         //for loop for iterating 10 times
        {
            System.out.println( number +"*" +i +"=" +number*i);
        }
    }
    public static void main(String[] args) {
        ForLoopExercise fl= new ForLoopExercise();    //object creation
        fl.table();
    }
    
    
}
