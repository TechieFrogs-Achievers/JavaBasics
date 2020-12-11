public class ArraysEx46 
{
     public static void main(String[] args) 
     {
        //initializing the string arrays
       
        String str[] = {"sree","srr","sr"};         

        String str1[] = {"srr","loky","lo"};

        //create another array to store the required array 
        
        String str2[] = new String[str.length+str1.length];

        //loop to get the values from first array
        
        for(int i = 0 ; i < str.length ; i++)
        {
            str2[i] = str[i]; 
        }

        //loop to get the values from second array that is stored after the first array elements

        for(int i = 0 ; i < str1.length ; i++)
        {
            
            str2[i+str.length] = str1[i];
        }
        
        System.out.println("After cocatination :");

        //loop to print the requred array
        
        for(int i = 0 ; i < str2.length ; i++)
        {
            System.out.print(" "+str2[i]);
        }
    }
}
