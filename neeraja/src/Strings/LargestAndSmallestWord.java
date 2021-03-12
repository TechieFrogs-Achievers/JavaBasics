package Strings;

public class LargestAndSmallestWord {
    public static void main(String[] j){

        String h="i am  daughter of Mr.raju";
        String[] k=h.split(" ");
        //int count=0;
        String small=k[0],large=k[0];
        //System.out.println(k.length);

        for(int i=0; i<k.length; i++)
        {
           if(small.length()>k[i].length()){
              small=k[i];
           }
           if(large.length()<k[i].length()){
            large=k[i];
         }
        }

         System.out.println("smallest word in a string :"+small);
         
         System.out.println("largest word in a string :"+large);
    }
    
}
