public class IfElseExercises {

    public void booleanExample()
    {
        boolean c= false;
        
        if(c== true)
        {
            System.out.println("These two are equal");
        }
        else
        {
            System.out.println("These two are not equal");
        }
    }
    public void chairs()
    {
        int chair= 10;
        if(chair == 4)
        {
            System.out.println("Chair has 4 legs");
        }
    }
    public void book()
    {
        long pages= 270;
        if(pages >= 250 && pages <=350)
        {
            System.out.println("The cost of book is 45 rupees");
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
    }

    public static void main(String[] args) {
        
        IfElseExercises ie = new IfElseExercises();
        ie.booleanExample();
    }
    
}
