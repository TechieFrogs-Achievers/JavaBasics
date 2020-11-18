public class LabeledForLoopExercise 
{
    public static void main(String[] args) 
    {
        aa:
        for(int i=1;i<=10;i++)
        {
            bb:
            for(int j=1;j<=10;j++)
            {
                if(i % 2 ==0 && j %2 == 0)
                {
                    break aa;
                }
            System.out.println(i +" " +j);
        }
             
           
        } 
                
    }
        
    
}
