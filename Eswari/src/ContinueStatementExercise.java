public class ContinueStatementExercise 
{
    public static void main(String[] args) {
        
        
        for(int employeeId= 501; employeeId <= 600; employeeId++)
        {
            
            if(employeeId == 516)
            {

                continue;
            }
            System.out.println("Employee id is "+employeeId);
        }
    }
    
}
