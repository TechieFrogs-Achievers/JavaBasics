package Strings;

public class SubSetsOfString {
    public static void main(String[] j){ 

        String s="neeraja";
        int l=s.length();
        //declaring n(n+1)/2 length string array
        String arr[] = new String[l*(l+1)/2];  
        int k=0;
        String d="";
        //iterate through string
        for(int i=0; i<l; i++){
            //iterate through string
            for(int u=i; u<l;u++){
             d = s.substring(i,u+1);
             if(d.length()==1){
                 continue;
             }
             else{
                arr[k]=d;
             }
             k++;
            }

        }
        //display all the subsets of a string
        for(String c:arr)
        System.out.print(c+" ");
    }
    
}
