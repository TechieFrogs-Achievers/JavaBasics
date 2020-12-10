public class Array34 {
    public static void main(String[] args) {    
        int rows, cols, sumRow =0,sumCol=0;
        //Initialize matrix a    
        int a[][] = {       
                        {4, 1, 3},    
                        {3, 5, 7},    
                        {8, 2, 6}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Counts the number of even elements and odd elements    
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

            sumRow = sumRow + a[i][j];}
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
            
        }
            for(int i = 0; i < rows; i++){        
            for(int j = 0; j < cols; j++){
                
                sumCol = sumCol + a[j][i];  }
                System.out.println("Sum of " + (i+1) +" column: " + sumCol);      
            } 

    }
}
