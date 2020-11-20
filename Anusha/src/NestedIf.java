import javax.lang.model.util.ElementScanner14;

public class NestedIf
{
    //main method
    public static void main(String[] args)
    {
        int marks=70;
        //if block
        if(marks>=45)
        {
            //nested if block
            if(marks>=85 && marks>=70)
            {
              System.out.println("rank is:A");
            }
            else if(marks>=70 && marks>=55)
            {
                System.out.println("rank is: B");
            }
            else if(marks>=55 && marks>=45)
            {
                System.out.println("rank is: c");
            }
            else
            {
                System.out.println("failed");
            }//end nested if block
        }

        else
        {
            System.out.println("exit block");
        }//end if block
    }
}
