public class TypeCasting 
{
     public static void main(String[] args) 
     {
        char ch = 's';         //initializing character
        int sample = ch;   //automatically convert fro char to int
        long value = sample;       //automatically convert from int to long
        float data = value;         //automatically covert from long to float
        double last = data;         //automatically convert from float to double

        //print all the values

         System.out.println("The value of sample is"+sample);
         System.out.println("The value of long is "+value);
         System.out.println("The value of float is "+data);
         System.out.println("The value of double is"+last);

    }
}
