package Arrays;
//progranm to find standard deviation of matrix=sqrt(varience)
public class Arrayexcersice40 {
    public static void main(String[] y){

        //declaring array
        int[][] q={ {1,5,6}, {4,3,9}, {7,5,3}};
        int sum=0;

        //calulatinf mean of array
        for(int i=0; i<q.length;i++){
            for(int j=0; j<q.length;j++){
               sum=sum+q[i][j];
            }
        }
        int mean=sum/((q.length)*(q.length));//mean

        //claculating variance=(value-mean)^2
        for(int i=0; i<q.length;i++){
            for(int j=0; j<q.length;j++){
                q[i][j]-=mean;
                q[i][j]*= q[i][j];
            }
            
        }

        //calculating again sum to find deviation
         //calulatinf mean of array
         for(int i=0; i<q.length;i++){
            for(int j=0; j<q.length;j++){
               sum=sum+q[i][j];
            }
        }

        System.out.println(" Standars deviation is :"+(int)Math.sqrt(sum));

        
                    
        
    }
    
}
