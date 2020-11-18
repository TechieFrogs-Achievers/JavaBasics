public class IfElseExercise 
{
    String category="airConditioner";
    String brand="LG";
    String Type="inverterSplit";
    int cost=46999;
    public void Sample()
    {
        if (brand == "LG")
        {
        System.out.println("the brand is LG");
        }
        else
        {
            System.out.println("another brand");
        }


        if ( brand == "LG" & category == "laptop")
        {
            System.out.println("this is  LG airconditioner");
        }
        else 
        {
            System.out.println("this is not a LG airconditioner");

        }


        if (category == "airConditioner" && brand == "LG")
        {
            System.out.println("this is LG airconditioner");
        }
        else
        {
            System.out.println("this is not a LG airconditioner");
        }


        if(brand =="Onida" && Type == "inverterSplit" || cost==46999)
        {
            System.out.println("lg airconditioner with cost of 46999");
        }
        else
        {
            System.out.println("the details are dosent match");
        }
    }

    public void Sample2()
    {
        String model="LS-Q18YNZA";
        String category1="laptop";
        String brand1 = "asus";
        int cost = 34999;

        if(model == "LS-Q18YNZA" && brand1 =="hp")
        {
            System.out.println("the hp laptp model is LS-Q18YNZA");
        }
        else
        {
            System.out.println("it is not a asus laptop");
        }

      
        if(category1 == "telivision" | model == "LS-Q18YNZA" && cost == 34999)
        {
            System.out.println(" this is  a laptop ");
        }
        else
        {
            System.out.println("this is not laptop");

        }
        
    }
    
    public static void main(String[] args)
     {
         IfElseExercise i = new IfElseExercise();
         i.Sample();
         i.Sample2();
         System.out.println("outside the if condition");
        
    }
    
    
}
