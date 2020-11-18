public class DoWhileExercise
 {
    public static void main(String[] args) 
    {
        int n=1;

        //condition true
        do
        {
        System.out.println("hello world");
        n++;
        }
        while(n<5);

        //condition false
        do
        {
            System.out.println("do_while program");
            n++;
        }
        while(n>6);
    }
    
}
