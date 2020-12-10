package Arrays;

public class CharaterToString {
    public static void main(String[] args) {
        
        //declaring character array
        char[] ch = new char[]{'R','a','m','y','a',' ','K','o','n','d','p','a','l','l','i'};

            //converting character array to string 
            System.out.print(String.valueOf(ch)); 

        System.out.println();

        String s = "Ramya Kondapalli";

        char[] c = new char[s.length()];

            //string to chararcter array
            for(int i=0;i<s.length();i++){
                c[i] = s.charAt(i);
            }

        //printing character array
        for (char c1 : c)
            System.out.print(c1 + " ");
    }
}
