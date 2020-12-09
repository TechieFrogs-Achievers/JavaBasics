package Strings;

public class LargestAndSmallestWord {
    public static void main(String[] j){

        String h="i am a daughter of Mr.raju";
        String[] k=h.split(" ");
        int count=0;
        for(int i=0; i<h.length(); i++){

            for(int r=0; r<h.length(); r++){
                count++;
            }
            System.out.println("string has "+count+" no of charecters");
        }


    }
    
}
