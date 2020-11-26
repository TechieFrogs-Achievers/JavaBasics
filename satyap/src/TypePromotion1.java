public class TypePromotion1
{
    void show(String s1,String s2) // method for String concatenation
    {
        System.out.println("String concatenation:"+(s1+s2));
    }
    void show(int c,double d) // method for integer to double datatype
    {
        System.out.println("Float arguments:"+c+" "+d);
    }
    void show(char c,int d) // method for character to integer
    {
        System.out.println("Character datatype:"+c+" "+d);
    }
    public static void main(String[] args) {
        TypePromotion1 type=new TypePromotion1();
        type.show(10,20); // method calling for int to double
        type.show("satya","Pachigolla"); // method calling for String concatenetion
        type.show(10,20); // method calling for int to any datatype
        type.show('1',2); // method calling for character to int dadatype

    }
}
