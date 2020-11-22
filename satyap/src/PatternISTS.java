public class PatternISTS {
    public static void main(String[] args) {
        String str="ISTS";
        char a[]=str.toCharArray();
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[j]);
            }
            System.out.println();
        }
    }
    
}
