public class TypePromotion // class Type promotion 
{
    public static void main(String[] args) {
        double d=100.04; // members
        long l=(long)d; // converting double to long
        int i=(int)l; // converting int to long
        System.out.println("Double value:"+d);
        System.out.println("Long value:"+l);
        System.out.println("Int value:"+i);
        byte b; 
        b=(byte)i; // converting int to byte
        System.out.println("Byte value:"+b+" "+"int value"+i);
        b=(byte)d; // converting double to byte
        System.out.println("double to byte:"+b+" "+"double value:"+d);
    }
}
