package Strings;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String s = "Ramya Kondapalli";
        System.out.println(s.split(" ", s.length()));
        
        //for loops for checking duplicate characters
        for (int i=0;i<s.length();i++){  
            char ch1 = s.charAt(i);

            for (int j=i+1;j<s.length();j++){
                char ch2 = s.charAt(j);

                if (ch1 == ch2){  //if letters are equal then it will print that letter
                        System.out.print(ch1 + " ");
                    break;
                }
            }
        }

    }
}
