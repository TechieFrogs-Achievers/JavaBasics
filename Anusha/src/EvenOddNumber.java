import javax.lang.model.util.ElementScanner14;

public class EvenOddNumber
{
    //main method
    public static void main(String[] args) 
 {
      int number=-12;
    //find the number is even or odd
    if (number>0 && (number%2!=0))//f && f=f
    {
        System.out.println("positive odd number");
    } 
    else if(number>0 && (number%2==0))//f && t=f
    {
        System.out.println("positive even number");
    } 
    else if(number<0 && (number%2!=0))//t && f=f
    {
        System.out.println("negative odd number");
    }
    else if(number<0 && (number%2==0))//t && t=t
    {
        System.out.println("negative even number");
    }  
    else  
    {
        System.out.println("invalid number");
    }
    
 }
}
