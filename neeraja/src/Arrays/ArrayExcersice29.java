package Arrays;

public class ArrayExcersice29 {
    public static void main(String[] l){
        //Declaring and initializing two matices
        int [][]a={{1,2,3},{6,8,5},{7,0,2}};
        int [][]b={{1,2,3},{9,8,5},{7,0,2}};
        boolean c=true;

        //traversing through the array
        for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
               if(a[i][h]!=b[i][h]) //condition to check if both matrices are equal or not       
               { 
                   c=false;
                 
                 }
            }
    }  
   
    //display where equal or not
    if(c){
        System.out.println("BOTH MATRICES ARE  EQUAL");
    }
    else{
        System.out.println("BOTH MATRICES ARE NOT EQUAL");
    }
    
}
}
