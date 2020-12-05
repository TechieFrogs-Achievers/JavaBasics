package Strings;
//program to fins no of punctuation charecters ina string
public class PunctuationCharecter {
    public static void main(String[] j){
        String s3="1d&f !w@d!!! he!liio!!";
        int count=0;

        //iterate each and every charrecter in astring
        for(int i=0;i<=s3.length()-1;i++){
            if(s3.charAt(i)=='!'){
                count++;
            }
        }
        //display no of punctuation charecters in a string
        System.out.println(count);
    }
    
}
