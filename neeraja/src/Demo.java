public class Demo
{
    static byte age=30;                              //static variable
    short fresherSal=2500;                           //instance variable
    
                                                                 
    public static void main(String ds[])            //main method
    {                                                
        
        int ceoSal=100000;            
        long distance=741859641;
        float num1 = 144.435f;                       //initializing variables of different data types
        double num2 = 2.4578974;
        char ch='z';
        String name="neeraja";
        boolean c=true;

        Demo d=new Demo();                           //object creation

        System.out.println("age is        :"+ Demo.age);
        System.out.println("freshersal is :"+ d.fresherSal);
        System.out.println("cepsal is     :"+ ceoSal);
        System.out.println("distance is   :"+distance);
        System.out.println("num1 value is :"+num1);
        System.out.println("num2 value is :"+num2);
        System.out.println("charecter is  :"+ch);
        System.out.println("my name is    :"+name);
        System.out.println("boolean value :"+c);

     }
         
        
}