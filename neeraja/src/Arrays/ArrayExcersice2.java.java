package Arrays;
//program to find frequency of charecters or elements in an rray
 class ArrayExcersice2 {
    public static void main(String[] k){
        //input array
        float arr[]=new float[]{2.3f,1.3f,2.3f,5.3f,6.14f,2.3f}; 
        int [] b = new int [arr.length];  
        int visited = -1; 
         //traversing through array to find frequency of charecters
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
             if(arr[i]==arr[j]){
                 arr[j]=visited;
                 count++;
             }
            }
            //storing frequency in another array
            if(b[i]!=visited){
                b[i]=count;
            }
           
            //display no of times, the value will be reappeating
           // System.out.println(arr[i]+" present"+count+" no of time(s)");
        }
        for(int i = 0; i < b.length; i++){  
            if(b[i] != visited) { 
             System.out.println("the value " + arr[i] + " present " + b[i]+" no of times");  
        }  
        }
    }
}

