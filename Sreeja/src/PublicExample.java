public class PublicExample 
{
    int number;  //defining variables
    int digit;


    public void sum()  //creating sum method
    {
        int sum = number+digit;
        System.out.println(sum);
    }



     public static void main(String[] args) 
     {
        PublicExample pb = new PublicExample(); //object creation
        pb.number = 6;
        pb.digit = 7;  // assigning values to data members through reference variable
        pb.sum();  // method calling
       
       Average a = new Average();  // creating an object for average class 
        a.average(5,4,3); // method calling from average class 

    }
} 
