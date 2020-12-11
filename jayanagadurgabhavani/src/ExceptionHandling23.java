public class ExceptionHandling23
 {
    public static void main(String[] args) 
    {
         int marks=32;
        if(marks<0 || marks>100)//check condition marks are in between 0 and 100
        {
            throw new IllegalArgumentException(Integer.toString(marks));
        }
        else
        {
            System.out.println("marks or okey");
        }


    }
}

