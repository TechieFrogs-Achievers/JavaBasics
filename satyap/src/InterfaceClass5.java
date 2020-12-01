interface FastFood 
{
    void pizza();
    void burger();
}
class Sandwich implements FastFood
{
   public void pizza()
   {
       System.out.println("Eating Pizza");
   }
   public void burger()
   {
       System.out.println("Eating Burger");
   } 
}
class InterfaceClass5
{
    public static void main(String[] args) {
        Sandwich sw=new Sandwich();
        sw.pizza();
        sw.burger();
    }
}
