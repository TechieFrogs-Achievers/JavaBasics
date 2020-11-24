//package src;

public class ContinuePractice1 {
    public static void main(String[] args) {
        int i=1;
        while(i<=10)
        {
            if (i==5)
            {
                i++;
                continue; //skips the exection when i== 5
            }
            else 
                System.out.println(i); //prints rest of values
            i++;
        }
    }
}
