public class TypePromotion 
 {
    public static void main(String[] args)
    {
        int val=5; //data member of int type
        float f=(float)val; //int converted into float type
        byte b=(byte)val; // int converted into byte type
        System.out.println("integer:"+val);
        System.out.println("float:"+f);
        System.out.println("Byte:"+b);
    }
}
