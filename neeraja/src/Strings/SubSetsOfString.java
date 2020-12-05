package Strings;

public class SubSetsOfString {
    public static void main(String[] j){ 

        String s="neeraja";
        int l=s.length();
        //declaring n(n+1)/2 length string array
        String arr[] = new String[l*(l+1)/2];  
        int k=0;
        //iterate through string
        for(int i=0; i<l; i++){
            //iterate through string
            for(int u=i; u<l;u++){
             arr[k] = s.substring(i,u+1);
             k++;
            }

        }
        //display all the subsets of a string
        for(String c:arr)
        System.out.print(c+" ");
    }
    
}
