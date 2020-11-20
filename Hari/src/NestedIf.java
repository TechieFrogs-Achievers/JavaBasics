public class NestedIf 
{
    public static void main(String []args)
    {
        int num = -28 ;
        if ( num > 0 ) // checks either positive or negative
        {
            if (num % 2 == 0) // 
            System.out.println("Given number is positive even number");
            else
            System.out.println("Given number is positive odd number");
        }
        else
        System.out.println("Given number is Negative number");



        String gender = "female" ;
        int age = 30 ;
        float height = 5.4f ;
        boolean bool = Boolean.parseBoolean(gender); // convert string to boolean
        if (bool)
        { 
            if ( age < 35 && height > 5.0f)
            System.out.println("Eligible for job");
        }
        else
        System.out.println("Not eligible");


        int age1 = 41 ;
        if ( age1 < 18 )
        System.out.println("Minor");
        else 
        {
            if ( age1 >18 && age1 < 20 )
            System.out.println("Teenage");
            else if( age1 >= 20 && age1 < 35 )
            System.out.println("Young Age");
            else if ( age1 >= 35 && age1 < 50 )
            System.out.println("Middle Age");
            else 
            System.out.println("Old Age");        
        }
    }    
}
