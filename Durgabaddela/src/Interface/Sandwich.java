package Interface;
interface FastFood
{
    public String Veg();
    public void grillVeg();
    public void sliceVeg();
}

 class Sandwich implements FastFood
{
    public String Veg()
    {
        return ("this is veg sandwich");
    }
    public void grillVeg()
    {
        System.out.println("this is  grill veg sandwich");
    }
    public void sliceVeg()
    {
        System.out.println("this is slice bread veg sanwich");

    }
    public static void main(String[] args)
     {
         Sandwich s = new Sandwich();
         System.out.println(s.Veg());
         s.grillVeg();
         s.sliceVeg();

    }
    
}
