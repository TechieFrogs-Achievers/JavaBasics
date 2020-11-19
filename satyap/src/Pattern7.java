import java.util.MissingFormatArgumentException;

public class Pattern7 {
    public static void main(String[] args) {
        for(int i=6;i>=1;i--){
            for(int j=6;j>=6-i+1;j--){
                System.out.print((char)(j+64));
            }
            System.out.println(" ");
        }
    }
    
}
