//class for type promotion
class TypePromotion
{
    public void add(int a, float b)
    {
        System.out.println("The sum is " +(a + b));
    }
    public void add(float a, double b)
    {
        System.out.println("Difference is " +(a + b));
    }
}

public class MethodOverloadingTypePromotionExample 
{
    public static void main(String[] args) {
        TypePromotion tp = new TypePromotion();
        tp.add(5, 5);
        tp.add(5.4f, 2);
    }
    
}
