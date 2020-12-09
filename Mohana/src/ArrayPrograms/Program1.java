package ArrayPrograms;

public class Program1
{
    public static void main(String[] args) 
    {
        int arr[] = new int[4]; //creating new array object 
        //giving array elemnents 
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println("initial elements");
        for(int i :arr){

            System.out.print(i + " "); 
        }
        System.out.println(); 

        //using clone method

       /* int copy[] = arr.clone();


        System.out.println("after copying");

        for(int j :copy){

            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print(arr.equals(copy));*/
        

        //using copy method

        int copy[] =new int[4]; 
        System.out.println("after copying");

        System.arraycopy( arr, 0, copy, 0, 4); //array copy method

        for(int i : copy)//for each loop to print array
        {
            System.out.print(i + " ");
        } 

    }
    
}
