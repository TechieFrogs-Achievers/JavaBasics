interface FastFood
{
    void order();
}
class FastSandwitch implements FastFood
{
   public void order()
    {
        {
            System.out.println("Sandwitch order is taken");
        }
    }
}
public class Interface5 implements FastFood
{
    public static void main(String[] args)
    {
        FastSandwitch burger = new FastSandwitch();
        System.out.println("Fries with that ?");
        System.out.println("Size");
        burger.order();
    }
}
