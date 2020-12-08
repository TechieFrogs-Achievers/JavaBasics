package Arrays;
//program to find small and larget elements in an array
public class ArrayExcersice9{
    public static void main(String[] l){
        char[] k={'a','c','b','h','r'};
           int length=k.length;

//method one
    /* for(int i=0; i<length; i++){
        for(int j=0; j<length; j++){
             if(k[i]>k[j]){
            char temp=k[i];
            k[i]=k[j];
            k[j]=temp;
         }
        }
     }   System.out.println("smallest elememt  "+:k[0]);
         System.out.println("largest elememt  "+:k[length-1]);
     */

//method two
     char small=k[0];
     char large=k[0]; 
     
      //checking greatest element with remaining elements
     for(int i=0; i<length-1; i++){
         if(k[i]>large){
             large=k[i];
         }
         if(k[i]<small){
            small=k[i];
     }
    }
     System.out.println("largest elememt is "+small);
     System.out.println("smallest elememt is "+large);
 
    }

}