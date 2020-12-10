public class ArrayProgramming33 
{
    public static void main(String args[]){     
        int a[][]={{2,3,4},{2,4,5},{3,4,5}};    
        int b[][]={{3,2,4},{2,7,8},{3,5,6}};       
        int c[][]=new int[3][3];  //stored by a and b matrix    
        for(int i=0;i<3;i++)//multiplying and printing multiplication of 2 matrices 
        {    
        for(int j=0;j<3;j++)
        {    
        c[i][j]=0;      
        for(int k=0;k<3;k++)      
        {      
        c[i][j]+=a[i][k]*b[k][j];      
        }  
        System.out.print(c[i][j]+" ");  //printing matrix element  
        } 
        System.out.println();   
        }    
        }
}
