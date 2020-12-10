package ArrayPrograms;

public class Example1 
{
    public static void main(String[] args) 
    {
        int array1[][] = new int[3][3];
        array1[0][0] =1;
        array1[0][1] = 4;
        array1[0][2] = 5;
        for(int i = 0 ;i<array1.length;i++)
        { 
            for(int j = 0; j<array1.length;j++)
            System.out.print(array1[i][j] +" ");
            System.out.println();
        }
        
        
    }
    
}
