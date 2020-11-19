public class NestedIfElse {
    public static void main(String[] args) {
        int attendance=70;
        int percentage=65;
        if(attendance>=50){
            if(percentage>65){
                System.out.println("You are Promoted to next class");
            }
            else{
                System.out.println("you are failed in exam ");
            }
        }
            else{
                System.out.println("you should have minimum percentage and 75% of attendance");
            }
        
    }

    
}
