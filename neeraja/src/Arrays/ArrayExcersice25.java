package Arrays;

//program to find transpose of a matrix
public class ArrayExcersice25 {
    public static void main(String[] l){
        int [][]a={{1,2,3},{6,8,5},{7,0,2}};
        int[][]  g=new int[3][3];


        //diplay original matrix before transpose
        for(int i=0; i<a.length; i++){
            for(int h=0; h<a.length; h++){
            System.out.print(a[i][h]+" ");
            }
            System.out.println();
        }

        //transposing given matrix
        for(int i=0; i<a.length; i++){
         for(int h=0; h<a.length; h++){
            g[h][i]=a[i][h];//condition to change rows into columns and viceversa
         }
         //System.out.println();
        }

        // trnspose of a matrix
        for(int i=0; i<g.length; i++){
            for(int h=0; h<g.length; h++){
            System.out.print(g[i][h]+" ");
            }
            System.out.println();
        }

    }

}
    

