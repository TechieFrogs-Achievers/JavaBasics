public class Average
 {
     int a=9,b=10,c=20;
     public void calculate()
     {
         int average;
         average= (a+b+c)/3;
         System.out.println("the average of 3 numbers is :"+average);
     }
     public static void main(String[] args)
     {
         Average a = new Average();
         a.calculate();
         
     }

    
}
