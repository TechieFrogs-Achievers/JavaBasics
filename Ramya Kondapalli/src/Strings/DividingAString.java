package Strings;

public class DividingAString {
    public static void main(String[] args) {

        String s = "Ramya Kondapalli";
        int n = 3,c=0;
        int length = s.length();
        int l=length/n;

        String[] equalParts = new String[n]; //empty array string

        if (length%n!=0){
            System.out.println("we can't divide this string into equal parts");
        }
        else{
            for (int i=0;i<length;i = i+l){
                String part = s.substring(i, i+l);  //extracting substring 
                equalParts[c] = part;   //storing each substring into array
                c++;                  //increasing array index
            }
            for (int i=0;i<equalParts.length;i++){
                System.out.println(equalParts[i]);
            }
        }
        
    }
}
