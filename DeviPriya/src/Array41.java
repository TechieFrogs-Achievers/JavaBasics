public class Array41 {
    public static void main(String args[]){  
        //creating two matrices    
        int a[][]={{5,7,6},{2,4,3},{5,6,2}};    
        int b[][]={{1,3,4},{2,9,7},{1,2,4}};    
            
        //creating another matrix to store the sum of two matrices    
        int c[][]=new int[3][3];  //3 rows and 3 columns  
            
        //adding and printing addition of 2 matrices    
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
        System.out.print(c[i][j]+" ");    
        }    
        System.out.println();//new line    
        }    
        }
    
}
