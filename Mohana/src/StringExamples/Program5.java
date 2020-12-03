package StringExamples;

public class Program5 
{
    public static void main(String[] args) {
      //here s1 and s2 are stored in string constant pool 
      //== checks the address of the variable 
        String s1 = "Apple";
        String s2 = "Apple";
        System.out.println(s1==s2);//true

        //creating strings by using new operator
        //here the s3 and s4 are having different address they are stored in heap area 
        String s3 = new String("mohana");
        String s4 = new String("mohana");
        System.out.println(s3 == s4);//false
    }
    
}
