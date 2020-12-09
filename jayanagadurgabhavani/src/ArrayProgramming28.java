public class ArrayProgramming28 
{
    public static void main(String args[])
    {  
       int original[][]={{1,3,4},{2,4,3},{3,4,5}};     
        int transpose[][]=new int[3][3];  //3 rows and 3 columns  
        for(int i=0;i<3;i++)
        {    
        for(int j=0;j<3;j++)
        {    
        transpose[i][j]=original[j][i];  
        }    
        }    
        for(int i=0;i<3;i++)//original matric
        {    
        for(int j=0;j<3;j++)
        {    
        System.out.print("orginal ordar of matric:"+original[i][j]+" ");    
        }    
        System.out.println();   
        }      
        for(int i=0;i<3;i++)//transpose of array
        {    
        for(int j=0;j<3;j++)
        {    
        System.out.print("transpose ordar of array:"+transpose[i][j]+" ");    
        }    
        System.out.println();   
        }    
    }
}
