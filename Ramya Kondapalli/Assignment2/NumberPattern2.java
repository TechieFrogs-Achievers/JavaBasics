public class NumberPattern2 {
    public static void main(String[] args) {
       
        String s ="0";
        System.out.println(s);
        for (int j=9;j>=1;j--)
        {
        s = j + s+ j;
        System.out.println(s);
        
        }
    }
}
