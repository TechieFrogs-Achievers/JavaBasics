package Arrays;

public class IdentityMatrix {
    public static void main(String[] args) {

        //variable for finding the identity matrix
        boolean result = true;
        
        int[][] arr = new int[][] {
                                    {1,0},
                                    {0,1}
                                };

    //code for identifying the identity matrix
    for (int i=0;i<arr.length;i++){
        
        for(int j =0;j<arr.length;j++) {
                        
            if(i == j && arr[i][j] !=1){
                result = false;
                break;
            }
            else if (i !=j && arr[i][j] != 0){
                result = false;
                break;
            }
        }                                  
    }   
    
    if (result){
        System.out.println("Matrix is identity matrix");
    } 
    else 
        System.out.println("Matrix is not identity matrix");
    
    }
}
