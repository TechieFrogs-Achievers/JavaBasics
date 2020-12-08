package StringExamples;

public class SubsetPrgm7 
{
    public static void main(String[] args) 
    {
        String str="mohana";
        int length=str.length();
        //declaring n(n+1)/2 length string array
        String arr[] = new String[length*(length+1)/2];  
        int k=0;
        
        for(int i=0; i<length; i++)
        {
            //iterate through string
            for(int j=i; j<length; j++)
            {
             arr[k] = str.substring(i,j+1);
             k++;
            }

        }
        //display all the subsets of a string
        for(String  subsets:arr)
        System.out.println(subsets+" ");
        
    }
    
}
