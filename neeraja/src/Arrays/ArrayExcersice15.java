package Arrays;
//program to sort the elements in desecending order an array
public class ArrayExcersice15 {

    public static void main(String[] p){
          //declaring and initializing an array
        char[] k={'a','c','b','h','r'};
        int length=k.length;
        //traversing through array
      for(int i=0; i<=length-1; i++){
         for(int j=0; j<=length-1; j++){
             //condition to check highest element
             if(k[i]<k[j]){
             char temp=k[i];
             k[i]=k[j];
             k[j]=temp;
         }
        }
    }
       //dispays final sorted  array
       for(int l=0; l<=length-1; l++){
           System.out.print(k[l]+" ");
       } 
    }
    
}
