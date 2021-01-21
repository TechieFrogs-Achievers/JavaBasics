package NewDocument;

public class PalindromeStrings {
    public static void main(String[] args) {
        
        String s = "mam is malayalam girl";

        String[] newString = s.split(" ");

        String strRev = "";

        for (String str:newString){

            System.out.println(str + " ");

            String temp = str;
            
            for (int i=str.length()-1;i>=0;i--){

                char ch = str.charAt(i);
                strRev  = strRev+ch;

            }

            if (temp.equals(strRev)){

                System.out.println(temp);

            }
        }
    }
}


