public class Average
 {
     int a=9,b=10,c=20; // assigning values to variables
     public void calculate() //default method
     {
         int average;
         average= (a+b+c)/3;
         System.out.println("the average of 3 numbers is :"+average); // printing average
     }
     public static void main(String[] args)
     {
         Average a = new Average(); //creating object to class
         a.calculate(); //calling method using object
         
     }

    
}
