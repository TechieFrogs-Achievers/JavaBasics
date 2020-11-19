public class SwitchCaseexmp1 
{
    public static void main(String[] args) {
        
        //switch case 

        int  age  =  18  ;

        switch(  age  )
        {
             case 16 :
             System.out.println( " you are minor " );
             break ;
             case 18 :
             System.out.println( " you are eligible for voting " );
             break ;
             case 22 :
             System.out.println( " you are Teenager " );
             break ;
             case 65 :
             System.out.println( " you are senior citizen " );
             break ;
            default :
             System.out.println( " Please provide your age ");

        }
    }

    
}
