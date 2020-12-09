package Strings;

public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Ramya is kondapalli is a good girl a Raamya of the world then the good";
        int c=0;

        String s[] = str.split(" ");
        
        for (int i=0;i<6;i++){

            for (int j=i+1;j<6;j++){

                if (s[i] .equalsIgnoreCase(s[j]) ){
                    System.out.println(s[j]);
                    c++;
                    break;
                }
            }
        }
    }
}
