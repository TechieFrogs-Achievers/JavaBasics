public class ArrayProgramming4 
{
    static void min(int arr[])
    {
     int min=arr[0];
     for(int i=0;i<arr.length; i++)
     if (min > arr[i])
     min=arr[i];
    System.out.println(min);
    }   

public static void main(String[] args) 
{
    int a[]={566,552,528}; //declaring and initializing an array  
    min(a); //passing array to method  

}
}
