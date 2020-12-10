public class Array16 {
    public static int getThirdLargest(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[total-3];  
        }  
        public static void main(String args[]){  
        int a[]={52,42,82,62,92};  
        int b[]={44,64,54,84,34,24};  
        System.out.println("Third Largest: "+getThirdLargest(a,5));  
        System.out.println("Third Largest: "+getThirdLargest(b,6));  
        }
    
}
