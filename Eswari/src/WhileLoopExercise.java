public class WhileLoopExercise 
{
    public void table()
    {
        int number=5,i=1;
        while(i <=10)
        {
            System.out.println(number +"*" +i +"=" +number * i);
            i++;
        }
    }
    
    //reverse of a number
    public void reverseOfANumber()
    {
        int number=123, sum=0;
        while(number !=0)
        {
            int reminder= number %10;
            sum= (sum * 10) + reminder;
            number =number / 10;

        }
        System.out.println("The reversed number is "+sum);
    }

    public static void main(String[] args) 
    {
        WhileLoopExercise wl=new WhileLoopExercise();
        wl.table();
        wl.reverseOfANumber();
        
    }
    
}
