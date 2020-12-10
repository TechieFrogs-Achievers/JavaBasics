public class ArrayProgramming30 
{
    public static void main(String[] args) 
{    
int rows, cols;    
boolean flag = true;    
int a[][] = {       
{1, 0, 0},    
{0, 1, 0},    
{0, 0, 1}    
};    //intial matrix
rows = a.length;    
cols = a[0].length;    
if(rows != cols)//row = cols
{    
System.out.println("Matrix should be a square matrix");    
}    
else 
{    
for(int i = 0; i < rows; i++)
{    
for(int j = 0; j < cols; j++)
{    
if(i == j && a[i][j] != 1)//camparing by the rows = cols
{    
flag = false;    
break;    
}    
if(i != j && a[i][j] != 0)
{    
flag = false;    
break;    
}    
}    
}    
if(flag)    
System.out.println("Given matrix is an identity matrix");    
else    
System.out.println("Given matrix is not an identity matrix");    
}    
}    
}
