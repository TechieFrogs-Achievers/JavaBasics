public class Switch 
{
    public static void main(String[] args) 
    {
        int developers =  6;
        String itIndustry = "security developer" ;
        switch( developers)
        {
            case 1:
            itIndustry = "front end developer";
            break;
            case 2:
            itIndustry = " backend developer";
            break;
            case 3:
            itIndustry = " full stack developer";
            break ;
            case 4:
            itIndustry = "desktop developer";
            break;
            case 5:
            itIndustry = " QA developer";
            break;
            case 6:
            itIndustry = " security developer";
            break ;
            case 7:
            itIndustry = " data base  developer";
            break ;
            case 8:
            itIndustry = " test case developer";
            break ;
            default:
            itIndustry =" invalid";
            break; 

        } 
        System.out.println( itIndustry);
        
    }
    
}
