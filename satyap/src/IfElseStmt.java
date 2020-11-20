public class IfElseStmt {
    public static void main(String[] args) 
    {
        // If Else statement for postive number
        int num=10;
        if(num>0)
        {
            System.out.println("Postive number:"+num);
        }
        else
        {
            System.out.println("Number is not Positive");
        }
        

    // If Else Statement for even and odd
        if(num%2==0)
        {
            System.out.println("Even number:"+num);
        }
        else
        {
           System.out.println("Given Number is odd");
        }

        
    // If Else Statement for Leap year
        int year=2000;
        if(((year%4==0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println("Leap Year:"+year);

        }
        else
        {
            System.out.println("Non Leap year");
        }

    // If Else Statement for ternary operator

        String value=(num%2==0)?"even number":"odd number";
        System.out.println("Number is:"+value);
   
    }
  
}
