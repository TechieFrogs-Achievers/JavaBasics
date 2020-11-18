public class ForLoopExercise
{
    public void table()
    {
        int number = 10;    
        for(int i = 1; i <=10; i++)
        {
            System.out.println( number +"*" +i +"=" +number*i);
        }
    }
    public static void main(String[] args) {
        ForLoopExercise fl= new ForLoopExercise();
        fl.table();
    }
    
    
}
