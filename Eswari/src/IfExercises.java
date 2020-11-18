public class IfExercises {

    public void ifExercises()
    {
        boolean c= false;
        
        if(c== true)
        {
            System.out.println("These two are equal");
        }
        System.out.println("Doen't print equal");
    }
     public void chairs()
     {
         int chair= 10;
         if(chair == 4)
         {
             System.out.println("Chair has 4 legs");
         }
         else
         {
            System.out.println("It doesn't a chair");
         }
     }
    public void book()
    {
        long pages= 270;
        if(pages >= 250 && pages <=350)
        {
            System.out.println("The cost of book is 45 rupees");
        }
        else
        {
            System.out.println("We didn't give exact price for book");
        }
    }
    
    public void laptop()
    {
        int core=5;
        int generation =7;
        if(core == 3 && generation == 7)
        {
            System.out.println("The price of laptop is 35,000 ");
        }
        else
        {
            System.out.println("We don't tell price because there many core type and different generations");
        }
    }
    public static void main(String[] args) {
        IfExercises ie= new IfExercises();
        ie.ifExercises();
        ie.chairs();
        ie.book();
        ie.laptop();
    }
}
