package InheritenceExcercises;
class Apple
{
    public int number_of_items=75;
}
class Banana extends Apple
{
    int number_of_items;
    public Banana(int n)
    {
        number_of_items = n;
    }
    void Show()
    {
        System.out.println(super.number_of_items);
        System.out.println(number_of_items);
    }
}
public class Inheritence8
{
    public static void main(String[] args)
    {
        Banana b = new Banana(34);
        b.Show();
    }
}
