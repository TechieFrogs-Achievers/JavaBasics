public class NestedIfExercise {

    //example for software engineer
    public void softwareIndustry(String skill1, String skill2, String skill3)
    {
        
        if(skill1 =="ruby" || skill1=="php" || skill1=="python")
        {
            if(skill2 == "database")  //nested if
            {
                if(skill3 == "HTML" || skill3 == "css" || skill3 =="javascript")
                {
                    System.out.println("You are eligible for full stack developer");
                }
                else
                {
                    System.out.println("You are not eligible full stack developer");
                }
            
            }
            else
            {
                System.out.println("You are  not eligible for database developer");
            }
            
        
        }
        else
        {
            System.out.println("You are  not eligible for backend developer");
        }
        if(skill3 == "HTML" || skill3 == "css" || skill3 =="javascript")
        {
            System.out.println("You are eligible for frontend developer");
        }
    }
    public static void main(String[] args) {
        NestedIfExercise ne= new NestedIfExercise();
        ne.softwareIndustry("python", "database", "html");
    }
    
}
