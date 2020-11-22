public class NumberPattern2 {
    public static void main(String[] args) {
       
        String s ="0";
        System.out.println(s);
        for (int j=9;j>=1;j--)//loop for printing numbers
        {
        s = j + s+ j;
        //It will print numbers 
        System.out.println(s);
        
        }
    }
}
